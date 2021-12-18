package linkedList.circularLinkedLIst;

public class CircularLinkedList {


   private Node tail;
   private int size =0;

   void add(int data){

           if (tail==null){
               Node newestNode = new Node(data,null);
               tail = newestNode;
               tail.next = tail;
           }else{
               Node n = new Node(data,tail.next);
               tail.next = n;
               tail = n;
           }
           size++;
   }

   public void insertAt(int position,int data){
       if (size == 0 || position == size){
           add(data);
       }else {
           Node temp = tail.next;
           int i =1;
           while( i < position){
               temp = temp.next;
               i++;
           }
           Node node = new Node(data,temp.next);
           temp.next = node;
           size++;
       }
   }

   public void addAtBeginning(int data){
       if (size==0){
           add(data);
       }else {
           Node n = new Node(data,tail.next);
           tail.next = n;
           size++;
       }
   }

   public int deleteFromBeginning(){
       if (size==0){
           return Integer.MIN_VALUE;
       }
       int data = tail.data;
       if(size==1){
           tail = null;
       }else {
           tail.next = tail.next.next;
       }
       size--;
       return data;
   }

   public int deleteFromEnd(){
       if (size==0){
           return Integer.MIN_VALUE;
       }
       if (size==1){
           return deleteFromBeginning();
       }
       else{
           Node head = tail.next;
           Node temp = head;

           while (temp.next != tail){
               temp = temp.next;
           }
           int data = temp.next.data;
           temp.next=temp.next.next;
           return data;
       }

   }

   public int deleteAt(int position){
       if (position>size){
           return Integer.MIN_VALUE;
       }
       if (position==1){
           return deleteFromBeginning();
       }
       if (position == size){
           return deleteFromEnd();
       }
       Node head = tail.next;
       int i =1;

       while (i<position-1){
           head = head.next;i++;
       }
       int data = head.next.data;
       head.next = head.next.next;



       return data;
   }

   public void rotate(){
       tail = tail.next;
   }

   void printList(){
       Node head = tail.next;
       Node temp = head;

       while (temp.next!=head){
           System.out.print(temp.data+"  ");
           temp = temp.next;
       }
       System.out.print(temp.data+"  ");
       System.out.println();
   }

    private class Node {
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
