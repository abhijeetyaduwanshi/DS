package array;

/**
 * This program is to study passing arrays in methods.
 * 
 * @author ayaduwanshi
 */
public class PassingArraysToMethods {
    public static void main(String args[]) {
        int[] arr = {3, 1, 2, 5, 4};
        System.out.println(sum(arr));
    }

    /**
     * This method is to add all the values in the array.
     * 
     * @param arr; to add all the values
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
