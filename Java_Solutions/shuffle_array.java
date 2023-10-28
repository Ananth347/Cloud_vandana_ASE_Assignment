// 1. A). A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

//Solution:

import java.util.Random; // i'm Importing  the Random class

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7}; // I'm Declared and initialized the given array
        
        
        shuffle_Array(array); // shuffle the array

        
        for (int value : array) {
            System.out.print(value + " "); //printing the shuffled array
        }
    }

    
    public static void shuffle_Array(int[] array) {
        int n = array.length;          // Getting the length of the array
        Random random = new Random();  // Create a random number generator

        
        for (int i = 0; i < n - 1; i++) {   //Iterate through the array
            
            int j = random.nextInt(n);

           
            int temp = array[i];
            array[i] = array[j];  //swapping array[i] and array[j]
            array[j] = temp;
        }
    }
}