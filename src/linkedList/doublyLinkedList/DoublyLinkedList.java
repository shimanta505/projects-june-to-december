package linkedList.doublyLinkedList;

public class DoublyLinkedList{
    private int size =0;
    private Node head;
    private Node tail;


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size==0;
    }


    public void add(int data) {
        Node newNode = new Node(data,null,null);

        if (head==null){
            head = newNode;
        }else {
            tail.next= newNode;
        }
        Node temp = tail;
        tail = newNode;
        tail.prev=temp;

        size++;
    }


    public int first() {
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }


    public int last() {
        if (isEmpty()){
            return -1;
        }
        return tail.data;
    }


    public void addFirst(int data) {
        if (head!=null){
            Node node = new Node(data,null,null);
            Node temp = head;
            head = node;
            node.next=temp;
            temp.prev = node;
            node.prev=null;
        }
    }


    public void reverse() {


        while (head!=null){
            Node temp = head;
        }
    }


    public void insertAt(int index, int data) {

    }


    public void delete(int index) {

    }


    public void printList() {

    }
    private class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}
