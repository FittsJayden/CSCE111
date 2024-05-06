/*
Jayden Fitts
UIN: 530003798
CSCE 111-502
1/29/24
 */

public class CalendarEx1 {

  public static void main(String[] args) {
    String name = "Jayden Fitts";
    int day = 0; //make days easier to c/p with the spaces


    System.out.print("________          __        ___.                 \r\n" + //title
      "\\_____  \\   _____/  |_  ____\\_ |__   ___________ \r\n" +
      " /   |   \\_/ ___\\   __\\/  _ \\| __ \\_/ __ \\_  __ \\\r\n" +
      "/    |    \\  \\___|  | (  <_> ) \\_\\ \\  ___/|  | \\/\r\n" +
      "\\_______  /\\___  >__|  \\____/|___  /\\___  >__|   \r\n" +
      "        \\/     \\/                \\/     \\/       \n\n");
    //https://patorjk.com/software/taag/#p=display&f=Graffiti&t=October
    


    System.err.print( " Sunday\t\t\t Monday\t\t\t Tuesday\t\t  Wednesday\t\t Thursday\t\t  Friday\t\t Saturday\n" + //days of the week spaced out
      "_________________________________________________________________________________________________________________________________________________________________________\n" +//top line
      "|\t\t\t|\t\t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|\n" + // 1 tab = 8 spaces
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|\n" +//row lines
      "|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|"+name+"'s Birthday|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|\n" +
      "|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|\n" +
      "|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------|\n" +
      "|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|"+ ++day +"       \t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|       Halloween!      |\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\t\t\t|\n" +
      "|_______________________________________________________________________________________________________________________________________________________________________|\n\n"
      + "\u00A9 " + name);// "?" keeps showing in my console output?


  }
}