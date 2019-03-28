package array;

/**
 * This program will use the student object,
 * assign the value and print the values.
 * 
 * @author ayaduwanshi
 */
public class StudentsArray {
    public static void main(String[] args) {

        // declaring an array of object
        Student[] arr;

        // allocating memory of 5 to the array
        arr = new Student[5];

        // initializing the value
        arr[0] = new Student(1, "Adam");
        arr[1] = new Student(2, "Bryce");
        arr[2] = new Student(3, "Chandler");
        arr[3] = new Student(4, "Joe");
        arr[4] = new Student(5, "Ross");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " + arr[i].rollNumber +" "+ arr[i].studentName);
        }
    }
}
