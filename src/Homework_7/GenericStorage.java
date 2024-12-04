package Homework_7;

import java.util.ArrayList;
import java.util.List;

class GenericStorage<T extends Person> {
    private List<T> items = new ArrayList<>();
    private static int idCounter = 1;



    public void addItem(String name, int age) {
        T item = (T) (items instanceof List<Student>
                ? new Student(name, age, idCounter)
                : new Teacher(name, age, idCounter));
        items.add(item);
        idCounter++;
    }


    public boolean removeItem(int id) {
        return items.removeIf(item -> item.getId() == id);
    }


    public T searchItem(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


    public void displayAllItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the storage.");
        } else {
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}