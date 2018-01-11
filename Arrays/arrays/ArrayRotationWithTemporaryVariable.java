package arrays;

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

    public static void printArray(int[] array) {
        for (int arrayValue : array) {
            System.out.print(arrayValue + " ");
        }
        System.out.println();
    }

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
