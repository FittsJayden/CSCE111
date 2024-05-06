/*
Jayden Fitts
UIN: 530003798
CSCE 111-502
1/29/24
 */
import javax.swing.JOptionPane;

public class HotelRoomEx3 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Staring floor:");//input string
        int startFloor = 0;
        for (int i = 0; i < input1.length(); i++) {//converts string to int while checking for digits (assuming we can't use error generating methods or I missed one)
            if (!(Character.isDigit(input1.charAt(i)))) {
                System.out.println("Must be digit.");
                System.exit(0);
            }
        }
        startFloor = Integer.valueOf(input1);
        if (startFloor < 3 || startFloor > 6) {//checks if starting floor is between 3 and 6
            System.out.println("Starting floor must be between 3 and 6.");
            System.exit(0);
        }


        //repeats for each input
        String input2 = JOptionPane.showInputDialog("Number of floors:");
        int numFloors = 0;
        for (int i = 0; i < input2.length(); i++) {
            if (!(Character.isDigit(input2.charAt(i)))) {
                System.out.println("Must be digit.");
                System.exit(0);
            }
        }
        numFloors = Integer.valueOf(input2);
        if (startFloor + numFloors > 21) {//checks that top floor isn't above 21, if startFloor is valid then the lower bound doesn't need to be checked
            System.out.println("Top floor must be between 3 and 21.");
            System.exit(0);
        }


        //repeats again for last input
        String input3 = JOptionPane.showInputDialog("Rooms per floor:");
        int roomsPerFloor = 0;
        for (int i = 0; i < input3.length(); i++) {
            if (!(Character.isDigit(input3.charAt(i)))) {
                System.out.println("Must be digit.");
                System.exit(0);
            }
        }
        roomsPerFloor = Integer.valueOf(input3);
        if (roomsPerFloor > 999 || roomsPerFloor < 1) {//checks if roomsPerFloor is above 999
            System.out.println("Rooms per floor should be between 1 and 999.");
            System.exit(0);
        }






        System.out.println("Hotel Room Cleaning Roster\n");//print headers
        System.out.println("Room number   Cleaned");

        for (int j = startFloor; j < startFloor + numFloors; j++) {//iterate through floors
            if (j == 13) {//add one to floor counter if it is 13, also add one to upper bound of floors since we increment j
                j += 1;
                numFloors += 1;
            }
            for (int i = 1; i <= roomsPerFloor; i++) {//iterate rooms while checking for each digit place to ensure we have the right correct number of digits for each room
                if (roomsPerFloor > 99) {
                    if (i < 10) {
                        System.out.println(j+"00"+i+"\t\t"+"___\n");
                    }
                    else if (i < 100) {
                        System.out.println(j+"0"+i+"\t\t"+"___\n");
                    }
                    else {
                        System.out.println(j+""+i+"\t\t"+"___\n");
                    }

                }
                else {
                    if (i < 10) {
                        System.out.println(j+"0"+i+"\t\t"+"___\n");
                    }
                    else {
                        System.out.println(j+""+i+"\t\t"+"___\n");
                    }
                }
            }
        }

    }
}
