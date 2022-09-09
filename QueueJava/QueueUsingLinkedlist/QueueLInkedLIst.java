package QueueJava.QueueUsingLinkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueLInkedLIst {
    public static void main(String[] args) {
        Queue<Integer> number = new ArrayDeque<Integer>();

        number.offer(10);
        number.offer(15);
        number.offer(20);
        number.offer(25);
        number.offer(30);
        number.offer(35);
        number.offer(40);

        // Cheching for the first element in the queue
        System.out.println(number.peek());

        // Removing the first element in the queue
        System.out.println(number.poll());

        // Cheching for the first element in the queue.
        System.out.println(number.peek());
    }
}
