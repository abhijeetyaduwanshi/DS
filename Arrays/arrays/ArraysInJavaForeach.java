package arrays;

public class ArraysInJavaForeach {

    public static void main(String[] args) {

        // declares an Array of integers
        int[] arr;
        // declaring counter variable
        int counter;

        // allocating memory for 5 integers
        arr = new int[5];

        // initialize counter
        counter = 0;

        // initialize the first elements of the array
        arr[0] = 10;

        // initialize the second elements of the array
        arr[1] = 20;

        // so on...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int x : arr) {
            System.out.println("Element at index " + counter + " : "+ x);
            counter++;
        }
    }
}
