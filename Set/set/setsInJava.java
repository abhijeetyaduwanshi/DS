package set;

import java.util.HashSet;
import java.util.Set;

public class setsInJava {
    public static void main(String[] args) {
        Set<String> newSet = new HashSet<String>();

        newSet.add("one");
        newSet.add("two");
        newSet.add("three");
        newSet.add("four");

        System.out.println(newSet.iterator());
    }
}
