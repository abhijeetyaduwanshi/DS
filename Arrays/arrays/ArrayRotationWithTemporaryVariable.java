package arrays;

/**
 * This program is to rotate the given array with the help of a temporary variable.
 * 
 * @author ayaduwanshi
 */
public class ArrayRotationWithTemporaryVariable {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotateBy = 4;

        System.out.print("Initial array : ");
        printArray(initialArray);

        arrayRotation(initialArray, rotateBy);

        System.out.print("Initial array after rotation: ");
        printArray(initialArray);
    }

    /**
     * This method is to print the given array.
     * 
     * @param array; to print
     */
    public static void printArray(int[] array) {
        for (int arrayValue : array) {
            System.out.print(arrayValue + " ");
        }
        System.out.println();
    }

    /**
     * This method is to rotate the original array.
     * 
     * @param array; original array to rotate
     * @param index; offset by which the array is to be rotated
     * @return {@code: rotated original array}
     */
    public static int[] arrayRotation(int[] array, int index) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            if (index == 0) {
                break;
            }
            temp = array[0];
            for (int j = 0; j < (array.length - 1); j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
            index--;
        }
        return array;
    }
}
