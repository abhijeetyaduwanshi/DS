package arrays;

/**
 * This program is to make a duplicate of the given array.
 * 
 * @author ayaduwanshi
 */
public class CloningOfArrays {
    public static void main(String args[]) {
        int[] intArray = {1, 2, 3};
        int[] cloneArray = intArray.clone();

        // a deep copy is created for one-dimensional array
        // this will print false
        System.out.println(intArray == cloneArray);

        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
