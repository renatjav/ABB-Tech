package Homework_7;

import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            GenericStorage<Student> studentStorage = new GenericStorage<>();
            studentStorage.addItem("Alice", 20);
            studentStorage.addItem("Bob", 22);


            GenericStorage<Teacher> teacherStorage = new GenericStorage<>();
            teacherStorage.addItem("Dr. Smith", 45);
            teacherStorage.addItem("Mrs. Johnson", 40);
//asd

            System.out.println("Students:");
            studentStorage.displayAllItems();


            System.out.println("\nTeachers:");
            teacherStorage.displayAllItems();


            System.out.println("\nSearching for student with ID 1:");
            Person student = studentStorage.searchItem(1);
            System.out.println(student != null ? student : "Student not found.");


            System.out.println("\nRemoving teacher with ID 3:");
            boolean removed = teacherStorage.removeItem(3);
            System.out.println(removed ? "Teacher removed." : "Teacher not found.");


            System.out.println("\nTeachers after removal:");
            teacherStorage.displayAllItems();
        }
    }
