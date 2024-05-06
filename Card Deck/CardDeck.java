/* Jayden Fitts
 * 530003798
 * Section 510
 * 2/23/2024
 */


public class CardDeck {
    public static void main(String[] args) {
        String deck[] = new String[54];
        String suit[] = {"C", "S", "H", "D"};

        for (int i = 0; i < 4; i++) {// Clubs: 0, Spades: 1, Hearts: 2, Diamonds: 3
            for (int j = 0; j < 13; j++) {
                switch (j) {
                    case 0:
                        deck[(i*13) + j] = "A" + suit[i];
                        break;
                    case 9:
                        deck[(i*13) + j] = "T" + suit[i];
                        break;
                    case 10:
                        deck[(i*13) + j] = "J" + suit[i];
                        break;
                    case 11:
                        deck[(i*13) + j] = "Q" + suit[i];
                        break;
                    case 12:
                        deck[(i*13) + j] = "K" + suit[i];
                        break;
                    default:
                        deck[(i*13) + j] = (j+1) + suit[i];
                        break;
                }
            }
        }
        deck[52] = "j-0";
        deck[53] = "j-1";

        System.out.println("Jayden's Neat Deck of Cards\n");

        for (int i = 0; i < 13; i ++) {
            System.out.println(deck[i] + "\t" + deck[i + 13] + "\t" + deck[i + 26] + "\t" + deck[i + 39]+ "\n");
        }
        System.out.println(deck[52] + "\t" + deck[53]);


    }
}