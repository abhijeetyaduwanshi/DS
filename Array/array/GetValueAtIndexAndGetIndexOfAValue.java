package array;

/**
 * This program is to get the value at a given index.
 * Also this program is to find the index of a given value.
 * 
 * @author ayaduwanshi
 */
public class GetValueAtIndexAndGetIndexOfAValue {
    private int[] array = {2, 5, 2, 21, 35, 47, 54, 47, 47, 91};

    public static void main(String[] args) {
        GetValueAtIndexAndGetIndexOfAValue getIndexAndValue = new GetValueAtIndexAndGetIndexOfAValue();
        System.out.println("The value at index 6 is: " + getIndexAndValue.getValueAtIndex(6));
        System.out.println("Value 47 is available at indices: " + getIndexAndValue.getIndexOfValue(47));
    }

    /**
     * This method is to get the value at a given index.
     * 
     * @param index; at which the value is to be found
     * @return {@code: value}
     */
    public int getValueAtIndex(int index) {
        if(index < array.length) {
            return array[index];
        }
        return -1;
    }

    /**
     * This method is to get the index of the given value.
     * 
     * @param value; of the given index
     * @return {@code: index}
     */
    public String getIndexOfValue(int value) {
        String valueAtIndex = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                valueAtIndex = valueAtIndex + " " + i;
            }
        }
        return valueAtIndex;
    }
}
