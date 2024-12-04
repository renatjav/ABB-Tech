package Lesson_8;

import java.util.PriorityQueue;

public class Task2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.offer(3);
        pq.offer(4);


        pq.peek();
        pq.poll();
        pq.remove(2);

        for (pq.poll(); pq.peek() != null; pq.poll()) {
            System.out.println(pq.poll());
        }
    }
}
