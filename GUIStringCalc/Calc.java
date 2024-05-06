

public class Calc {
    /**
     * Adds two Strings of numbers together without a size limit.
     * @param num1 String of a number.
     * @param num2 String of a number.
     * @return String of num1 + num2.
     */
    public static String add(String num1, String num2) {
        num1 = reverse(num1);
        num2 = reverse(num2);
        String ans = "";
        int carry = 0;
        int size;
        int buffer;
        int diff = Math.abs(num1.length() - num2.length());


        if (num1.length() >= num2.length()) {
            size = num2.length();
        }
        else {
            size = num1.length();
        }



        for (int i = 0; i < size; i++) {
            buffer = 0;
            if (carry != 0) {
                buffer += carry;
            }
            buffer += num1.charAt(i) + num2.charAt(i) - 96;
            
            if (buffer > 9) {
                carry = (buffer - (buffer % 10)) / 10;
                buffer = buffer % 10;
            }
            else {
                carry = 0;
            }
            ans = ans + buffer;
        }


        if (num1.length() > num2.length()) {
            for (int i = num2.length(); i < num1.length(); i++) {
                buffer = 0;
                if (carry != 0) {
                    buffer += carry;
                }
                buffer += num1.charAt(i) - 48;
                
                if (buffer > 9) {
                    carry = (buffer - (buffer % 10)) / 10;
                    buffer = buffer % 10;
                }
                else {
                    carry = 0;
                }
                ans = ans + buffer;
            }
        }
        else if (num1.length() < num2.length()) {
            for (int i = num1.length(); i < num2.length(); i++) {
                buffer = 0;
                if (carry != 0) {
                    buffer += carry;
                }
                buffer += num2.charAt(i) - 48;
                
                if (buffer > 9) {
                    carry = (buffer - (buffer % 10)) / 10;
                    buffer = buffer % 10;
                }
                else {
                    carry = 0;
                }
                ans = ans + buffer;
            }
        }
  
        if (carry != 0) {
            ans = ans + carry;
        }

        ans = reverse(ans);
        return ans;
    }
    /**
     * Reverses a string.
     * @param str String.
     * @return Reversed String.
     */
    public static String reverse(String str) {
        String newStr = "";
        char buffer;

        for (int i = 0; i < str.length(); i++) {
            buffer = str.charAt(str.length() - 1 - i);
            newStr = newStr + buffer;
        }

        return newStr;
    }
}
