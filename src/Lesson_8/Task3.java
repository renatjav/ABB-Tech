package Lesson_8;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("A");

        System.out.println(set);

        System.out.println();

        for (String s : set) {
            System.out.println(s);
        }
    }
}
