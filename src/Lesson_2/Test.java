package Lesson_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Insert your age: ");
//        Scanner sc = new Scanner(System.in);
//        int salary = sc.nextInt();

//        if (30 > age && age  > 18) {
//            System.out.println("Your age greater than 18 and less than 30");
//
//        } else if (40 > age && age > 30) {
//            System.out.println("Your age in range 30-40");
//
//        } else
//            System.out.println("Your age grather than 40");


//        while (salary <= 10) {
//            System.out.println(salary++);
//        }
//
//
//        do {
//            System.out.println("Salary is" + salary);
//        } while (salary < 10);

//        while (salary <= 100) {
//            System.out.println(salary++);
//        }
//
//
//
//        do {
//              System.out.println("Salary is" + salary);
//         } while (salary < 100);

        int x = 0;
        int y = 0;

        for (; x < 50 && y < 70; x++, y+=2) {
            System.out.println("x= " + x);
            System.out.println("y= " + y);
        }


    }
}
