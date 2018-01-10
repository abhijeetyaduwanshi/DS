package arrays;

public class GetValueAtIndexAndGetIndexOfAValue {
    private int[] array = {2, 5, 2, 21, 35, 47, 54, 47, 47, 91};

    public static void main(String[] args) {
        GetValueAtIndexAndGetIndexOfAValue getIndexAndValue = new GetValueAtIndexAndGetIndexOfAValue();
        System.out.println("The value at index 6 is: " + getIndexAndValue.getValueAtIndex(6));
        System.out.println("Value 47 is available at indices: " + getIndexAndValue.getIndexOfValue(47));
    }

    public int getValueAtIndex(int index) {
        if(index < array.length) {
            return array[index];
        }
        return -1;
    }

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
