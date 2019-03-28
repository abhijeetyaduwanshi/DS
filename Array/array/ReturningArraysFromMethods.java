package array;

/**
 * This program is to study how arrays are returned from methods.
 * 
 * @author ayaduwanshi
 */
public class ReturningArraysFromMethods {
    public static void main(String args[]) {
        int arr[] = m1();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /**
     * This method will return the array.
     * 
     * @return {@code: array}
     */
    public static int[] m1() {
        // returning  array
        return new int[] {1, 2, 3};
    }
}
