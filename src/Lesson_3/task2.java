package Lesson_3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

//        Exercise 2: Replace Characters in a String
//        Write a program that replaces all occurrences of one character with another in a given string.
//
//        String text = "banana";


        System.out.println("Write the Word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();


        System.out.println("Write the number of index to replace the word: ");
        String before = sc.nextLine();

        System.out.println("Replace to which word: ");
        String after = sc.nextLine();

        String result = word.replace(before, after);
        System.out.println(result);



    }
}
