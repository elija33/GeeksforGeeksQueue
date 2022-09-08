import java.beans.beancontext.BeanContext;
import java.util.function.ObjDoubleConsumer;

public class Queue {
    int size;
    int Front;
    int Rear;
    int capacity;
    int array[];

    public Queue(int capacity, int size, int Front, int Rear) {
        this.capacity = capacity;
        Front = this.size = 0;
        this.Rear = Rear;
        array = new int[this.capacity];
    }

    public boolean isFull(Queue queue) {
        return (queue.size == queue.capacity);
    }

    public boolean isEmpty(Queue queue) {
        return (queue.size == 0);
    }

    public int Front() {
        if (isEmpty(this)) {
            return -1;
        } else {
            return 0;
        }
    }

    public int Rear() {
        if (isEmpty(this)) {
            return -1;
        } else {
            return size - 1;
        }
    }

    public void enque(int data){
        if(isFull(this)){
            return;
        }
        else{
            array[size] == Rear;
            size++;
        }
    }

    public void deque() {
        if (isEmpty(this)) {
            return;
        } else {
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
                size--;
            }
        }
    }

    public static void main(String[] args) {

    }
}