package collections.list;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                }
                if (o1 < o2) {
                    return 1;
                }
                return 0;
            }
        };

        Queue<Integer> priority = new PriorityQueue<>();
        priority.add(7);
        priority.add(10);
        priority.add(14);
        priority.add(4);
        priority.offer(80);
        System.out.println(priority);
        System.out.println(priority.poll());
        System.out.println(priority.peek());
        System.out.println(priority);
    }
}
