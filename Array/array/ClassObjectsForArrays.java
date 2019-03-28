package arrays;

/**
 * This program is to show how arrays class works in Java.
 * 
 * @author ayaduwanshi
 */
public class ClassObjectsForArrays {
    public static void main(String args[]) {
        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
        String[] strArray = new String[3];

        // The string "[I" is the run-time type signature for the class object "array with component type int", the only direct superclass of any array type is java.lang.Object
        // output: class [I
        System.out.println(intArray.getClass());
        // output: class java.lang.Object
        System.out.println(intArray.getClass().getSuperclass());

        // The string "[B" is the run-time type signature for the class object "array with component type byte"
        // output: class [B
        System.out.println(byteArray.getClass());

        // The string "[S" is the run-time type signature for the class object "array with component type short"
        // output: class [S
        System.out.println(shortsArray.getClass());

        // The string "[L" is the run-time type signature for the class object "array with component type of a Class", the Class name is then followed
        // output: class [Ljava.lang.String;
        System.out.println(strArray.getClass());
    }
}
