package dataStructure.queue;

public class TestQue {
    public static void main(String[] args) {

        IQueue queue = new LinkedQueue();
        queue.enQueue(15);
        queue.enQueue(20);
        queue.enQueue(25);
        queue.enQueue(30);
        queue.enQueue(35);
        queue.printQueue();
        System.out.println(queue.deQueue());
        queue.printQueue();
        System.out.println(queue.first());
    }
}
