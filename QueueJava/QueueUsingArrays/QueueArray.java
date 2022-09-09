package QueueJava.QueueUsingArrays;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArray {
    public static void main(String[] args) {
        Queue<Integer> number = new ArrayDeque<Integer>();

        number.offer(10);
        number.offer(15);
        number.offer(20);
        number.offer(25);
        number.offer(30);

        // Getting the size of Queue using Array
        System.out.println(number.size());

        // Cheching if the queue is empty or not
        System.out.println(number.isEmpty());

        // printing out all the element in queue.
        System.out.println(number);
    }
}
