import java.util.*;
public class QueueStackUsingPriorityQueue {
    static class MyQueue {
        private PriorityQueue<int[]> pq;
        private int order = 0;
        public MyQueue() {
            pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        }
        public void enqueue(int value) {
            pq.add(new int[]{order++, value});
        }

        public int dequeue() {
            return pq.poll()[1];
        }
    }
    static class MyStack {
        private PriorityQueue<int[]> pq;
        private int order = 0;

        public MyStack() {
            pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        }

        public void push(int value) {
            pq.add(new int[]{order++, value});
        }

        public int pop() {
            return pq.poll()[1];
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue Dequeue: " + queue.dequeue());

        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        System.out.println("Stack Pop: " + stack.pop());
    }
}
