package arrays;

public class ArrayRotation {
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

    public static int[] initializingTemporaryArray(int[] firstArray, int[] secondArray) {
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = firstArray[i];
        }
        return secondArray;
    }

    public static void printArray(int[] array) {
        for (int arrayValue : array) {
            System.out.print(arrayValue);
        }
        System.out.println();
    }

    public static int[] shiftingArray(int[] arrayToShift, int index) {
        for (int j = 0; j < (arrayToShift.length - index); j++) {
            arrayToShift[j] = arrayToShift[j + index];
        }
        return arrayToShift;
    }

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
