package Homework_3;

public class Task1 {
    public static void main(String[] args) {
//        1. Write a Java program to get the index of all the characters of the alphabet.



        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.println("Word "+ letter + " index is: " + (int)letter);
        }

        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.println("Word "+ letter + " index is: " + (int)letter);
        }

    }
}
