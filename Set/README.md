# Set

### Points to remember

- Set is an interface which extends Collection
- It is an unordered collection of objects in which duplicate values cannot be stored
- Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation)
- Set has various methods to add, remove clear, size, etc to enhance the usage of this interface
- Set is used to deal with any type of collections that is having one element to save with no duplicates

### Declaring a new Set

```
Set<String> mySet = new HashSet<String>();
```

### Add data to set

```
mySet.add("apple");
mySet.add("banana");
```

In this case apple will be saved at spot 1 and banana will be saved at spot 2

### Printing a set `System.out.println`

```
System.out.println(mySet);
```

#### Output:

```
[apple, banana]
```

We do not have to iterate over a set, just throw the set in `System.out.println` statement and the set will be printed. Also set will be printed in between square brackets

## Methods in Set

### size()

This method is used to get the count of data stored in set. Since this is a collection length or length() will not be used but size will be used

```
mySet.size();
```

No matter what dataType data is stored in the set. This will `return int` value

#### returns

```
int value
```

#### Implementation:

```
public class setsInJava {
	public static void main(String[] args) {
		Set<String> newSet = new HashSet<String>();

		newSet.add("one");
		newSet.add("two");
		newSet.add("three");
		newSet.add("four");

		System.out.println(newSet.size());
	}
}
```

#### Output:

```
4
```

### isEmpty()

This method is used to check if the set is empty

```
mySet.isEmpty();
```

No matter what dataType data is stored in the set. This will `return boolean` value; true if the set is empty, false if the set is not empty

#### returns

```
boolean value
```

#### Implementation:

```
public class setsInJava {
	public static void main(String[] args) {
		Set<String> newSet = new HashSet<String>();

		newSet.add("one");
		newSet.add("two");
		newSet.add("three");
		newSet.add("four");

		System.out.println(newSet.isEmpty());
	}
}
```

#### Output:

```
false
```

### contains()

This method is used to check if the set contains any specified element

```
mySet.contains(element);
```

No matter what dataType data is stored in the set. This will `return boolean` value; true if element is present in the set, false if element is not present in the set

#### returns

```
boolean value
```

#### Implementation:

```
public class setsInJava {
	public static void main(String[] args) {
		Set<String> newSet = new HashSet<String>();

		newSet.add("one");
		newSet.add("two");
		newSet.add("three");
		newSet.add("four");

		System.out.println(newSet.contains("asdfasdfl"));
		System.out.println(newSet.contains("three"));
		System.out.println(newSet.contains(4));
		System.out.println(newSet.contains(true));
	}
}
```

#### Output:

```
false
true
false
false
```

We check if any element of different dataType is present in the set. This will not throw us any error since this is a collection, it will simply check the dataType first. If the dataType is not compatible it will return false else if the dataType is compatible it will go and check if the matching element is present or not and accordingly return true if the matching element is present else will return false

If the set is empty, it will return false but will not throw any error
