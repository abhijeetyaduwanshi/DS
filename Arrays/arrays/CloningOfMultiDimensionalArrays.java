package arrays;

/**
 * This program is to maka a duplicate of the multidimensional array.
 * 
 * @author ayaduwanshi
 */
public class CloningOfMultiDimensionalArrays {
    public static void main(String args[]) {
        int intArray[][] = {{1, 2, 3}, {4, 5}};
        int cloneArray[][] = intArray.clone();

        // will print false
        System.out.println(intArray == cloneArray);
        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }
}
