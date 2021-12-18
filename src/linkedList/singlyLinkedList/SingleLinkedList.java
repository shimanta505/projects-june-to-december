package linkedList.singlyLinkedList;

public class SingleLinkedList implements ISingleLinkedList{

    private int size = 0;
    private Node head;
    private Node tail;


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int data) {
        Node newestNode = new Node(data,null);

        if (head==null){
           head = newestNode;

        }else{
            tail.next = newestNode;
        }
        tail = newestNode;

        size++;
    }

    @Override
    public int first() {
        if (isEmpty()){
            return -1;
        }
        return head.data;
    }

    @Override
    public int last() {
        if (isEmpty()){
            return -1;
        }
        return tail.data;
    }

    @Override
    public void insertAtBeginning(int data) {
       if (isEmpty()){
           add(data);
       }else{
           Node n = head;
           head = new Node(data,null);size++;
           head.next = n;
       }
    }

    @Override
    public void insertAtEnd(int data) {
        add(data);
    }

    @Override
    public void reverse() {
//        Node prev = null;
//        while (head != null){
//           Node next =head.next;
//           head.next = prev;
//            prev = head;
//            head = next;
//        }
//        head = prev;

        Node prev =null;
        Node next =null;
        Node temp = head;

        while (temp!=null){
            next = temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;

    }


    @Override
    public void insertAt(int position, int data) {
        if (position>size){
            System.out.println("invalid insertion position");
            return;
        }else if(position==0){
            insertAtBeginning(data);
        }else{
            int i =0;
            Node temp = head;

            while (i<position){
                temp = temp.next;i++;
            }
            Node node = new Node(data,temp.next);
            temp.next=node;size++;
        }

    }

    @Override
    public int deleteFromBeginning() {
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        if (size==1){
            tail = null;
        }
        size--;
        return data;
    }

    @Override
    public int deleteFromEnd() {
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }
        if (size==1){
            return deleteFromBeginning();
        }
        else {
            Node prev = null;
            Node temp = head;

            while (temp.next!=null){
                prev = temp;
                temp = temp.next;
            }
            int data = temp.data;
            prev.next = null;
            tail = prev;
            size--;
            return data;
        }
    }

    @Override
    public int delete(int position) {
        if (position>size){
            return Integer.MIN_VALUE;
        }
        if (position==1){
            return deleteFromBeginning();
        }
        if (position==size){
            return deleteFromEnd();
        }
        int i =1;
        Node temp= head;
        while (i<position-1){
            temp = temp.next;i++;
        }
        int data = temp.next.data;
        temp.next = temp.next.next;
        size--;
        return data;
    }

    public void printList(){
        Node temp = head;
        Node prevTemp = tail;

        while (temp!= null){
            System.out.print(temp.data+" ,");
            temp=temp.next;
        }
        System.out.println();
    }

    private class Node {
        int data;
        Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
}
