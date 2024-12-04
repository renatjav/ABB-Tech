package Homework_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Write a sentence: ");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();


        int mySentenceLenght = sentence.length();

        int firstPartIndex = mySentenceLenght / 2;

        int secondPartIndex = mySentenceLenght - firstPartIndex;


        for (int i = 0; i < secondPartIndex; i++) {
            System.out.print(sentence.charAt(i));
        }
        System.out.println();

        for (int i = firstPartIndex ; i < mySentenceLenght; i++) {
            System.out.print(sentence.charAt(i));
        }

    }
}
