package Lesson_3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

//        Exercise 1: Extract a Substring
//        Write a program that extracts a substring from a
//        given string. Ask the user for the starting and ending indices and print the substring.
//
//                String text = "Hello, World!"

        System.out.println("Write the sentences: ");
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        System.out.println("Begining index: ");
        int beginIndex = sc.nextInt();

        System.out.println("End index: ");
        int endIndex = sc.nextInt();

        System.out.println(sentence.substring(beginIndex, endIndex));





    }
}
