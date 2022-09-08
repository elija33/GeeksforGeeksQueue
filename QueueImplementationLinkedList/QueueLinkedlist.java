package QueueImplementationLinkedList;

public class QueueLinkedlist {

    public class Node {
        int key;
        Node next;

        public Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public class Queue {
        Node front;
        Node rear;

        public Queue() {
            this.front = this.rear = null;
        }

        public void enqueue(int key) {
            Node temp = new Node(key);
            if (this.rear == null) {
                this.front = this.rear = temp;
                return;
            }
            this.rear.next = temp;
            this.rear = temp;
        }

        public void dequeue() {
            if (this.front == null)
                return;
            Node temp = this.front;
            this.front = this.front.next;
            if (this.front == null)
                this.rear = null;
        }
    }

    public class Test {
        public static void main(String[] args) {
            Queue number = new Queue();
            number.enqueue(10);
            number.enqueue(20);
            number.dequeue();
            number.dequeue();
            number.enqueue(30);
            number.enqueue(40);
            number.enqueue(50);
            number.dequeue();
            System.out.println("Queue Front : " + number.front.key);
            System.out.println("Queue Rear : " + number.rear.key);
        }
    }
}
