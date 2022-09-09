package ImplementingStackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackQueue {

    public static class Stack {

        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int curr_size;

        Stack() {
            curr_size = 0;
        }

        static void push(int x) {
            curr_size++;

            q2.add(x);

            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }

            Queue<Integer> q = q1;
            q1 = q2;
            q2 = q;
        }

        static void pop() {

            if (q1.isEmpty())
                return;
            q1.remove();
            curr_size--;
        }

        static int top() {
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }

        static int size() {
            return curr_size;
        }
    }

    public static void main(String[] args) {
        Stack numb = new Stack();
        numb.push(10);
        numb.push(5);
        numb.push(15);
        numb.push(20);

        System.out.println("current size: " + numb.size());
        System.out.println(numb.top());
        numb.pop();
        System.out.println(numb.top());
        numb.pop();
        System.out.println(numb.top());

        System.out.println("current size: " + numb.size());
    }
}
