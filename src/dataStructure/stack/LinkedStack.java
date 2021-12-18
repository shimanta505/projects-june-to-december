package dataStructure.stack;


public class LinkedStack implements IStack{
    int size =0;
    Node head;
    Node tail;
    int minvalue;
    int maxValue;

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void push(int data) {
        Node newestNode = new Node(data,null,data,data);


        if (head==null){
            head = newestNode;
            head.min=newestNode.data;
            minvalue =newestNode.data;
            maxValue= newestNode.data;
            head.next =null;
        }else {
            tail = head;
            Node temp = tail;
            tail = newestNode;
            tail.next = temp;
            head = tail;
            if (head.data<= minvalue){
               head.min=head.data;
               minvalue = head.data;
            }else{
                head.min= minvalue;
            }
            if (head.data>= maxValue){
                head.max = head.data;
                maxValue = head.data;
            }else{
                head.max=maxValue;
            }
        }

        size++;
    }

    @Override
    public int pop() {
        int output = head.data;
        head = head.next;
        size--;
        return output;
    }

    @Override
    public int top() {
        return head.data;
    }

    @Override
    public int size() {
        return size;
    }

    public int minStack(){
        return head.min;
    }

    @Override
    public int maxStack() {
        return head.max;
    }

    private class Node {
        int data;
        Node next;
        int min;
        int max;

        public Node(int data, Node next, int min, int max) {
            this.data = data;
            this.next = next;
            this.min = min;
            this.max = max;
        }
    }
}
