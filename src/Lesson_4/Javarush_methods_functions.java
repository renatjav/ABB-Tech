package Lesson_4;

public class Javarush_methods_functions {
    public void main(String[] args) {

        printLines("Привет", 5);
        printLines("Пока", 3);
    }

    public static void printLines (String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

}




