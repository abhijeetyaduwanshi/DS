Arrays
===

Points to remember
---

- An array is a group of like-typed variables that are referred to by a common name
- In Java all arrays are dynamically allocated
- Since arrays are objects in Java, we can find their length using member length
- In C/C++, we can find their length using sizeof
- A Java array variable can also be declared like other variables with [] after the data type
- The variables in the array are ordered and each have an index beginning from 0
- Java array can be also be used as a static field, a local variable or a method parameter
- The size of an array must be specified by an int value and not long or short
- The direct superclass of an array type is Object
- Array can contains primitives data types as well as objects of a class depending on the definition of array. In case of primitives data types, the actual values are stored in contiguous memory locations. In case of objects of a class, the actual objects are stored in heap segment

One-Dimensional Arrays
===

example of one dimentional array:

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | <- Array Indices
| 40 | 55 | 63 | 17 | 22 | 68 | 89 | 97 | 89 | <- Values Stored

Array length = 9
First index = 0, associated value = 40
Fourth index = 3, associated value = 17
Last index = 8, associated value = 89
nth index = (n-1), associated value = n-1's value

Creating, Initializing, and Accessing an Array
---

The general form of array declaration is

```
type var-name[];
int intArray[];

OR

type[] var-name;
int[] intArray;
```

An array declaration has two components:
- Data type and its name
- Data type declares the element type of the array
- The element type determines the data type of each element that comprises the array
- Like array of int type, we can also create an array of other primitive data types like char, float, double..etc or user defined data type(objects of a class)
- Thus, the element type for the array determines what type of data the array will hold

```
// both are valid declarations
int intArray[];
OR
int[] intArray; (preferred)

example of array declaration with different datatypes:

byte[] byteArray;
short[] shortsArray;
boolean[] booleanArray;
long[] longArray;
float[] floatArray;
double[] doubleArray;
char[] charArray;

// an array of references to objects of the class MyClass (a class created by user)

MyClass[] myClassArray;

Object[]  ao,	// array of Object
Collection[] ca;	// array of Collection of unknown type
```

Although the above first declaration establishes the fact that intArray is an array variable, no array actually exists
It simply tells to the compiler that this(intArray) variable will hold an array of the integer type
To link intArray with an actual, physical array of integers, you must allocate one using new and assign it to intArray

Instantiating an Array in Java
---

When an array is declared, only a reference of array is created
To actually create or give memory to array, you create an array like this:
The general form of new as it applies to one-dimensional arrays appears as follows:

```
array-var-name = new dataType [size];
```

Here, type specifies the data type of data being allocated
Size specifies the number of elements in the array
And var-name is the name of array variable that is linked to the array
That is, to use new to allocate an array, you must specify the type and number of elements to allocate

```
int intArray[];	//declaring array
intArray = new int[20];	// allocating memory to array
```

OR

```
int[] intArray = new int[20]; // combining both declaring and allocating statements in one
```

The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for boolean), or null (for reference types)

Obtaining an array is a two-step process
First, you must declare a variable of the desired array type
Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable
Thus, in Java all arrays are dynamically allocated

Array Literal
---

In a situation, where the size of the array and variables of array are already known, array literals can be used

```
int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	// Declaring array literal
```

The length of this array determines the length of the created array
There is no need to write the new int[] part in the latest versions of Java

```
int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};	// Declaring array literal
```

Accessing Java Array Elements using for Loop
---

Each element in the array is accessed via its index
The index begins with 0 and ends at (total array size)-1
All the elements of array can be accessed using Java for Loop

```
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++) {
	System.out.println("Element at index " + i + " : "+ arr[i]);
}
```

Implementation:
---

```
// Java program to illustrate creating an array of integers, puts some values in the array, and prints each value to standard output using for loop
 
public class PrintArray {
	public static void main (String[] args) {

		// declares an Array of integers
		int[] arr;

		// allocating memory for 5 integers
		arr = new int[5];

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element at index " + i + " : "+ arr[i]);
		}
	}
}
```

Output:
---

```
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
```

You can also access java arrays using foreach loops

```
// Java program to illustrate creating an array of integers, puts some values in the array, and prints each value to standard output using foreach loop
 
public class PrintArray {
	public static void main (String[] args) {

		// declares an Array of integers
		int[] arr;
		// declaring counter variable
		int counter;

		// allocating memory for 5 integers
		arr = new int[5];

		// initialize counter
		counter = 0;

		// initialize the first elements of the array
		arr[0] = 10;

		// initialize the second elements of the array
		arr[1] = 20;

		// so on...
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// accessing the elements of the specified array
		for (int x : arr) {
			System.out.println("Element at index " + counter + " : "+ x);
			counter++;
		}
	}
}
```

Output:
---

```
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
```

Arrays of Objects
---

An array of objects is created just like an array of primitive type data items in the following way

```
Student[] arr = new Student[7];	//student is a user-defined class
```

The studentArray contains seven memory spaces each of size of student class in which the address of seven Student objects can be stored
The Student objects have to be instantiated using the constructor of the Student class and their references should be assigned to the array elements in the following way

```
Student arr = new Student[5];
```

```
// Java program to illustrate creating an array of objects

public class Student {
	public int rollNumber;
	public String studentName;

	Student(int rollNumber, String studentName) {
		this.rollNumber = rollNumber;
        this.studentName = studentName;
    }
}

// Elements of array are objects of a class Student
public class StudentsArray {
	public static void main (String[] args) {

		// declares an Array of object
		Student[] arr;

		// allocating memory for 5 objects of type Student
		arr = new Student[5];

		// initialize the first elements of the array
		arr[0] = new Student(1, "Adam");

		// initialize the second elements of the array
		arr[1] = new Student(2, "Bryce");

		// so on...
        arr[2] = new Student(3, "Chandler");
        arr[3] = new Student(4, "Joe");
        arr[4] = new Student(5, "Ross");

		// accessing the elements of the specified array
		for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at " + i + " : " + arr[i].rollNumber +" "+ arr[i].studentName);
        }
	}
}
```

Output:
---

```
Element at 0 : 1 Adam
Element at 1 : 2 Bryce
Element at 2 : 3 Chandler
Element at 3 : 4 Joe
Element at 4 : 5 Ross
```

What happens if we try to access element outside the array size?
---

Compiler throws ArrayIndexOutOfBoundsException to indicate that array has been accessed with an illegal index
The index is either negative or greater than or equal to size of array

```
public class ArraysInJava {
	public static void main (String[] args) {

		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
}
```

Runtime error:
---

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at arrays.ArraysInJava.main(ArraysInJava.java:11)
```

Output:
---

```
10
20
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
	at arrays.ArraysInJava.main(ArraysInJava.java:11)
```

Multidimensional Arrays
===

Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other array
These are also known as Jagged Arrays
A multidimensional array is created by appending one set of square brackets ([]) per dimension

example of 2 dimentional array:

| | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| 0 | value[0] [0] | value[0] [1] | value[0] [2] | value[0] [3] | value[0] [4] | value[0] [5] | value[0] [6] | value[0] [7] | value[0] [8] | value[0] [9] |
| 1 | value[1] [0] | value[1] [1] | value[1] [2] | value[1] [3] | value[1] [4] | value[1] [5] | value[1] [6] | value[1] [7] | value[1] [8] | value[1] [9] |
| 2 | value[2] [0] | value[2] [1] | value[2] [2] | value[2] [3] | value[2] [4] | value[2] [5] | value[2] [6] | value[2] [7] | value[2] [8] | value[2] [9] |
| 3 | value[3] [0] | value[3] [1] | value[3] [2] | value[3] [3] | value[3] [4] | value[3] [5] | value[3] [6] | value[3] [7] | value[3] [8] | value[3] [9] |
| 4 | value[4] [0] | value[4] [1] | value[4] [2] | value[4] [3] | value[4] [4] | value[4] [5] | value[4] [6] | value[4] [7] | value[4] [8] | value[4] [9] |
| 5 | value[5] [0] | value[5] [1] | value[5] [2] | value[5] [3] | value[5] [4] | value[5] [5] | value[5] [6] | value[5] [7] | value[5] [8] | value[5] [9] |
| 6 | value[6] [0] | value[6] [1] | value[6] [2] | value[6] [3] | value[6] [4] | value[6] [5] | value[6] [6] | value[6] [7] | value[6] [8] | value[6] [9] |
| 7 | value[7] [0] | value[7] [1] | value[7] [2] | value[7] [3] | value[7] [4] | value[7] [5] | value[7] [6] | value[7] [7] | value[7] [8] | value[7] [9] |
| 8 | value[8] [0] | value[8] [1] | value[8] [2] | value[8] [3] | value[8] [4] | value[8] [5] | value[8] [6] | value[8] [7] | value[8] [8] | value[8] [9] |
| 9 | value[9] [0] | value[9] [1] | value[9] [2] | value[9] [3] | value[9] [4] | value[9] [5] | value[9] [6] | value[9] [7] | value[9] [8] | value[9] [9] |


Array row length = 10
Array column length = 10

Creating, Initializing, and Accessing an Array
---

The general form of array declaration is

```
int[][] intArray = new int[10][20];	//a 2D array or matrix
int[][][] intArray = new int[10][20][10];	//a 3D array
```

```
public class MultiDimensionalArrayInJava {
	public static void main(String args[]) {

		// declaring and initializing 2D array
        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
 
        // printing 2D array
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
            	System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

Output:
---

```
2 7 9 
3 6 1 
7 4 2 
```

Passing Arrays to Methods
---

Like variables, we can also pass arrays to methods
For example, below program pass array to method sum for calculating sum of array's values

```
// Java program to demonstrate passing of array to method

public class Test {

	// driver method
	public static void main(String args[]) {
		int[] arr = {3, 1, 2, 5, 4};

		// passing array to method m1
		sum(arr);
	}

	public static void sum(int[] arr) {
		// getting sum of array values
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Sum of array values : " + sum);
	}
}
```

Output:
---

```
sum of array values : 15
```

Returning Arrays from Methods
---

As usual, a method can also return an array
For example, below program returns an array from method m1

```
// Java program to demonstrate return of array from method

public class Test {
	// driver method
	public static void main(String args[]) {
		int arr[] = m1();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int[] m1() {
		// returning  array
		return new int[]{1,2,3};
    }
}
```

Output:
```
1 2 3
```

Class Objects for Arrays
---

Every array has an associated Class object, shared with all other arrays with the same component type

```
// Java program to demonstrate Class Objects for Arrays

public class Test {
	public static void main(String args[]) {
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];

		// array of Strings
		String[] strArray = new String[3];

		System.out.println(intArray.getClass());
		System.out.println(intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortsArray.getClass());
		System.out.println(strArray.getClass());
	}
}
```

Output:
---

```
class [I
class java.lang.Object
class [B
class [S
class [Ljava.lang.String;
```

Explanantion:
---
The string "[I" is the run-time type signature for the class object "array with component type int", the only direct superclass of any array type is java.lang.Object
The string "[B" is the run-time type signature for the class object "array with component type byte"
The string "[S" is the run-time type signature for the class object "array with component type short"
The string "[L" is the run-time type signature for the class object "array with component type of a Class", the Class name is then followed

Array Members
---

Now as we know that arrays are object of a class and direct superclass of arrays is class Object.The members of an array type are all of the following:
The public final field length, which contains the number of components of the array, length may be positive or zero
All the members inherited from class Object; the only method of Object that is not inherited is its clone method
The public method clone(), which overrides clone method in class Object and throws no checked exceptions

Cloning of arrays
---

When you clone a single dimensional array, such as Object[], a "deep copy" is performed with the new array containing copies of the original array's elements as opposed to references

```
// Java program to demonstrate cloning of one-dimensional arrays

public class Test {
	public static void main(String args[]) {
		int intArray[] = {1,2,3};
		int cloneArray[] = intArray.clone();
        
        // will print false as deep copy is created
        // for one-dimensional array
        System.out.println(intArray == cloneArray);
        
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }
    }
}
```

Output:
---

```
false
1 2 3
```

A clone of a multidimensional array (like Object[][]) is a "shallow copy" however, which is to say that it creates only a single new array with each element array a reference to an original element array but subarrays are shared

```
// Java program to demonstrate cloning of multi-dimensional arrays

public class Test {
	public static void main(String args[]) {
		int intArray[][] = {{1,2,3},{4,5}};
        int cloneArray[][] = intArray.clone();

        // will print false
        System.out.println(intArray == cloneArray);

        // will print true as shallow copy is created
        // i.e. sub-arrays are shared
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }
}
```

Output:
---

```
false
true
true
```
