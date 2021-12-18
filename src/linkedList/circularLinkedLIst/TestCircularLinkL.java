package linkedList.circularLinkedLIst;

import linkedList.circularLinkedLIst.CircularLinkedList;

public class TestCircularLinkL {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.add(23);
        cll.add(22);
        cll.add(21);
        cll.add(20);
        cll.add(10);
        cll.printList();
        System.out.println("after add at beginning");
        cll.addAtBeginning(5);
        cll.printList();
        cll.rotate();
        cll.rotate();
        System.out.println("after 2 time rotate");
        cll.printList();
//        cll.insertAt(3,5);
//        System.out.println(cll.deleteFromEnd());
//        cll.printList();
//        System.out.println(cll.deleteAt(3));
//        cll.printList();
        System.out.println(cll.deleteFromEnd());
        cll.printList();
    }

}
