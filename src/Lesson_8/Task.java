package Lesson_8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Task {
    public static void main(String[] args) {

        // Define LinkedList with the type of Integer
        // Define ArrayList with the type of String
        // Print results by "for each" and while

        System.out.println("Task-1:");
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
        list.forEach(System.out::println);

        System.out.println();
//        System.out.println("Task-2:");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
//        for (String s : list1) {
//            System.out.println(s);
//        }


    }
}
