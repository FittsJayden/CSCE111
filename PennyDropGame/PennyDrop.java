/*
 * Jayden Fitts
 * 530003798
 * CSCE111-502
 * 4/5/24
 */

import javax.swing.JOptionPane;

public class PennyDrop {
    public static void main(String[] args) {
        int playerCount = welcome();
        String temp;
        boolean game = true;

        if (playerCount == 6) {
            System.exit(0);
        }


        Player players[] = new Player[playerCount];
        
        for (int i = 0; i < playerCount; i++) {
            players[i] = new Player(JOptionPane.showInputDialog("Enter a name Player " + (i+1)));
        }


        
        while (game) {
            organizeByIndex(3, players);
            game = gameStart(players);
        }
        
    }

    public static int welcome() {
        String[] choices = {"2", "3", "4", "5", "Quit"};
        return JOptionPane.showOptionDialog(null, "Welcome to Penny Drop! How many players will be playing this time?", null, 0, 0, null, choices, null) + 2;
    }

    public static boolean gameStart(Player[] players) {
        boolean board[] = new boolean[6];
        for (int i=0; i<6;i++) {board[i] = false;}
        String choices[] = {"Roll!", "Pass"};
        String noChoice[] = {"Roll!"};
        int choice = 0;
        int roll = 0;
        String display = "";
        boolean win = false;
        int goAround = 0;




        while (!win) {
            for (Player player : players) {
                goAround = 0;
                while (choice == 0) {
                    display = displayBoard(board) + "What would you like to do " + player.getName() + "? Pennies left: " + player.getPennies();
                    if (goAround > 0) {
                        choice = JOptionPane.showOptionDialog(null, display, null, 0, 0, null, choices, null);
                    }
                    else {
                        choice = JOptionPane.showOptionDialog(null, display, null, 0, 0, null, noChoice, null);
                    }
                    goAround += 1;

                    if (choice == 0) {
                        roll = Dice.rollDice();
                        if (roll == 5) {
                            player.playPenny();
                        }
                        else if (board[roll]) {
                            JOptionPane.showInternalMessageDialog(null, "Oh no! Slot " + (roll + 1) + " already has a penny!");
                            player.addPennies(checkTheBoard(board));
                            choice = 1;
                        }
                        else {
                            board[roll] = true;
                            player.playPenny();
                        }


                        if (player.winCheck()) {
                            JOptionPane.showMessageDialog(null, player.getName().toUpperCase() + " WINS!!!\nThanks for playing!!!");
                            win = true;
                            break;
                        }
                    }
                }
                choice = 0;
                if (win) {break;}


            }
        }


        String[] playAgain = {"Sure!", "no :("};
        if (JOptionPane.showOptionDialog(null, "Want to play again?", null, 0, 0, null, playAgain, null) == 0) {
            for (Player player : players) {
                player.setPennies(12);
            }
            return true;
        }
        return false;
    }

    public static int checkTheBoard(boolean[] board) {
        int pennyPicker = 0;

        for (boolean slot : board) {
            pennyPicker += slot ? 1 : 0;
            
        }
        for (int i = 0; i < 6; i++) {
            if (board[i]) {
                board[i] = false;
            }
        }

        return pennyPicker;
    }

    public static String displayBoard (boolean[] board) {
        String out = "";
        int i = 1;
        for (boolean slot : board) {
            if (!slot) {
                out = out + i + ": Empty\n";
            }
            else {
                out = out + i + ": PENNY!\n";
            }
            i += 1;
        }
        return out;
    }

    public static int rollForStart(Player[] players) {
        int roll = 0;
        int highRoll = 0;
        int highIndex = 0;

        for (int i = 0; i < players.length; i++) {
            roll = Dice.rollDice();
            JOptionPane.showMessageDialog(null, players[i].getName() + " rolled a " + (roll+1));
            if (roll > highRoll) {
                highRoll = roll;
                highIndex = i;
            }
        }
        return highIndex;
    }

    public static void organizeByIndex(int ind, Player[] players) {
        Player buffer;
        int j = ind;

        //such a weird swap I have to make, and this is the only exception to the
        //reordering loop I made below. Any idea why? 
        //Suppose the players names are A,B,C,D, and E.
        //The for loop below swaps them to ensure whoever won the dice roll goes first and is then continous in order.
        //(I made the whole program without it and I thought this would be easier)
        //If D wins, the swap (without the if statement below) looks like,
        //ABCDE
        //DBCAE - the player who won the roll swaps to first
        //DECAB - we go up one from the beginning and swap it from one up on the index.
        //DEBAC - we increment from the beginning another time but don't increment index again since we've reached the top.
        //DEBCA - samething but now we're done and it's out of order?????

        /*
         * Now looky here,
         * 
         * ABCDE - suppose index 3 is chosen instead?
         * CBADE
         * CDABE
         * CDEBA
         * CEEAB - every other scenerio, whether it's any index with 5 people, or any index with less people all works.
        */
        buffer = players[0];
        if (ind == 3 && players.length == 5) {
            buffer = players[0];
            players[0] = players[1];
            players[1] = buffer;

            buffer = players[0];
            players[0] = players[2];
            players[2] = buffer;
        }
        
        for (int i = 0; i < players.length; i++) {
            if (j + 1 == players.length) {
                buffer = players[i];
                players[i] = players[j];
                players[j] = buffer;
            }
            else {
                buffer = players[i];
                players[i] = players[j];
                players[j] = buffer;
                j += 1;
            }
        }
    }
 }
