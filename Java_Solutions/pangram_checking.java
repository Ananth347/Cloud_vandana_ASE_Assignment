// 1. C).  Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a to z
 
//Solution:

import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); //scanner object to read user input

        System.out.print("Enter sentence: ");
        String input = scanner.nextLine(); // Read the input from user

        
        boolean isPangram=isPangram(input);//here calling the function isPangram

        System.out.println("Output: ");//printing the output

        
        if (isPangram) { //using conditional statement
            System.out.println("The input is a pangram."); //print it for true condition
        } else {
            System.out.println("The input is not a pangram.");// print it for false condition
        }

        scanner.close();
    }


    public static boolean isPangram(String input) {//Function to check the input
        
        input = input.replaceAll(" ", "").toLowerCase(); //Removing all spaces and convert the input to lowercase for case insensitive checking
        
        
        boolean[] isPresent = new boolean[26];// Create an array to mark the presence of each letter( a to z)
        
        
        for (int i = 0; i < input.length(); i++) { // Iterate through the characters in the input
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                isPresent[index] = true;
            }
        }

        for (boolean letterPresent : isPresent) { // Check if all letters(a to z) are present
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        
        return true; // All letters are present, it's a pangram
    }
}
