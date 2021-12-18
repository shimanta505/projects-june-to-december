package dataStructure.queue;

public class LinkedQueue implements IQueue {

   private Node head;
   private Node tail;
   private int size = 0;


    @Override
    public void enQueue(int data) {
        Node newNode = new Node(data,null);

        if (head==null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    @Override
    public int deQueue() {
        int output = head.data;
        head = head.next;
        size--;
        System.out.println();
        return output;
    }

    @Override
    public int first() {
        System.out.println();
        return head.data;
    }

    @Override
    public void printQueue() {
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }

    private class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
