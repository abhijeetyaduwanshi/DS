package array;

/**
 * This program is to rotate the given array with the help of a temporary array.
 * 
 * @author ayaduwanshi
 */
public class ArrayRotationWithTemporaryArray {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int rotateBy = 4;

        System.out.print("Initial array : ");
        printArray(initialArray);

        int[] tempArray = new int[rotateBy];
        initializingTemporaryArray(initialArray, tempArray);

        System.out.print("Temporary array : ");
        printArray(tempArray);

        shiftingArray(initialArray, rotateBy);

        System.out.print("Initial array shifted : ");
        printArray(initialArray);

        rotatingArray(initialArray, tempArray, rotateBy);

        System.out.print("Initial array rotated : ");
        printArray(initialArray);
    }

    /**
     * This method is to print the given array.
     * 
     * @param array; to print
     */
    public static void printArray(int[] array) {
        for (int arrayValue : array) {
            System.out.print(arrayValue);
        }
        System.out.println();
    }

    /**
     * This method is to initialize temporary array.
     * 
     * @param firstArray; is the original array
     * @param secondArray; is the temporary array
     * @return {@code: temporary array}
     */
    public static int[] initializingTemporaryArray(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        return secondArray;
    }

    /**
     * This method is to shift the original array.
     * 
     * @param arrayToShift; is the original array
     * @param index; offset by which the array is to be shifted 
     * @return {@code: shifted original array}
     */
    public static int[] shiftingArray(int[] arrayToShift, int index) {
        for (int j = 0; j < (arrayToShift.length - index); j++) {
            arrayToShift[j] = arrayToShift[j + index];
        }
        return arrayToShift;
    }

    /**
     * This method is to finally rotate the original array.
     * 
     * @param arrayToRotate; original shifted array
     * @param helperArray; temporary array
     * @param rotatingIndex; end offset for putting in the temporary array after the original array 
     * @return {@code: rotated original array}
     */
    public static int[] rotatingArray(int[] arrayToRotate, int[] helperArray, int rotatingIndex) {
        for (int k = 0; k < arrayToRotate.length; k++) {
            if (rotatingIndex == 0) {
                break;
            }
            arrayToRotate[arrayToRotate.length - rotatingIndex] = helperArray[k];
            rotatingIndex--;
        }
        return arrayToRotate;
    }
}
