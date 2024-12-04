package Homework_3;

import java.util.Scanner;
import java.util.SortedMap;

public class Task2 {
    public static void main(String[] args) {


//    2. Write a Java program to replace each substring of a given string that
//    matches the given regular expression with the given replacement.
//
//    Sample string: "The quick brown fox jumps over the lazy dog."
//    In the above string replace all the fox with cat.
//
//    Sample Output:
//    Original string: The quick brown fox jumps over the lazy dog.
//    New String: The quick brown cat jumps over the lazy dog.

        String word = "The quick brown fox jumps over the lazy dog.";

        word =  word.replace("fox","cat");
        System.out.println(word);







    }
}
