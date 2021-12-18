package linkedList.singlyLinkedList;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        ISingleLinkedList singleLinkedList = new SingleLinkedList();

        System.out.println(singleLinkedList.isEmpty());
        System.out.println(singleLinkedList.getSize());
        singleLinkedList.add(6);
        singleLinkedList.add(7);
        singleLinkedList.add(8);
        singleLinkedList.insertAt(2,5);
        System.out.println("after inserting data");
        singleLinkedList.insertAtBeginning(12);
        singleLinkedList.printList();
        System.out.println(singleLinkedList.delete(3));
        singleLinkedList.printList();
        singleLinkedList.reverse();
        singleLinkedList.printList();

    }
}
