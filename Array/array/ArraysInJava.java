package array;

/**
 * This program is to study how arrays works in Java.
 * This has examples of Creating, Initializing array by regular way,
 * Creating, Initializing array by array literal way,
 * Printing array with for loop and for each loop.
 * 
 * @author ayaduwanshi
 */
public class ArraysInJava {
    public static void main (String[] args) {

        // declares an Array of integers
        int[] arr;

        // allocating memory for 2 integers
        arr = new int[2];

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // this is the short form of combining the above 3 steps
        // called the array literal
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};

        // printing the first array with the for loop
        System.out.print("This is the first array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // printing the second array with for each
        System.out.print("This is the second array: ");
        for(int arrayValue: intArray) {
            System.out.print(arrayValue + " ");
        }
        System.out.println();
    }
}
