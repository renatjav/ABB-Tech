package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Box newbox = new Box("Renat",20);
        Box newbox2 = new Box("Renat",201);
        Box newbox3 = new Box("Renat",20);

        System.out.println(newbox.equals(newbox2));
        System.out.println(newbox.equals(newbox3));
        System.out.println(newbox.hashCode());
    }


}
