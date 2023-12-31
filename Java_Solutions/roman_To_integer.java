// 1. B). Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

//solution:
import java.util.Scanner;

public class RomanToInteger_Converter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//scanner object to read user input

        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine(); // Read the input from user

        
        int result = romanToInteger(roman);// calling romanToInteger function to convert 

        if (result != -1) {
           
            System.out.println("Integer value: " + result);
        } else {
            
            System.out.println("Invalid Roman numeral.");// Print an error message for invalid Roman numerals
        }

        scanner.close();
    }

    public static int romanToInteger(String s) {
        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = getValue(s.charAt(i));

           
            if (currentValue == -1) { // Check for invalid Roman numerals
                return -1; // Return -1 for invalid Roman numerals
            }

            
            if (currentValue < prevValue) {// Calculate the result based on Roman numeral values
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static int getValue(char c) {
       
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;

        // Return -1 for invalid Roman numerals
        return -1;
    }
}
