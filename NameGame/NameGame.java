/*
Jayden Fitts
UIN: 530003798
CSCE 111-502
2/6/24
 */
import java.util.Scanner;


public class NameGame {
    public static void main(String[] args) {
        System.out.print("The Name Game!\n\n\n"+
        "Come on everybody, I said now lets play a game.\n"+
        "I bet'cha I could make a rhyme\n"+
        "Out of anybody's name...\n\n\n");

        System.out.println("What is your name?");
        Scanner nameScan = new Scanner(System.in);

        String name = nameScan.next();

        System.out.println("\nHowdy "+ name +"!");
        String upperName = name.toUpperCase();


        if (upperName.contains("ITCH") || upperName.contains("UCK")) {
            System.out.println("\n\nSorry "+ upperName +", but you can't play this game.");
            System.out.println("\u0007");
            System.exit(0);
        }

        if (upperName.contains("ART")) {
            System.out.println("\n\nHowdy, this name can be embarrassing for some users, would you like to continue? Type yes or no");
            String valid = nameScan.next();

            if (valid.contains("no")) {
                System.exit(0);
            }
        }


        String rhymeName = "";

        if (upperName.startsWith("A") || upperName.startsWith("E") || upperName.startsWith("I") || upperName.startsWith("O") || upperName.startsWith("U")) {
            if (upperName.startsWith("A", 1) || upperName.startsWith("E", 1) || upperName.startsWith("I", 1) || upperName.startsWith("O", 1) || upperName.startsWith("U", 1)) {
                rhymeName = upperName.substring(1);
            }
            else {
                rhymeName = upperName;
            }
        }  
        else if (upperName.startsWith("A", 1) || upperName.startsWith("E", 1) || upperName.startsWith("I", 1) || upperName.startsWith("O", 1) || upperName.startsWith("U", 1)) {
            rhymeName = upperName.substring(1);
        }
        else {
            rhymeName = upperName.substring(2);
        }


        System.out.print("\n\nOkay "+ upperName +", here is your rhyme:\n\n"+
        upperName+" "+upperName+" bo-");
        if (upperName.startsWith("B")) {
            System.out.print(rhymeName);
        }
        else {
            System.out.print("B"+rhymeName);
        }

        System.out.print("\nBanana fana fo-");
        if (upperName.startsWith("F")) {
            System.out.print(rhymeName);
        }
        else {
            System.out.print("F"+rhymeName);
        }

        System.out.print("\nfe fi mo-");
        if (upperName.startsWith("M")) {
            System.out.print(rhymeName);
        }
        else {
            System.out.print("M"+rhymeName);
        }

        System.out.print("\n"+upperName+"!\n\n\nThank you for playing, "+ upperName+"!");






    }
}
