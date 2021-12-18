package linkedList.singlyLinkedList;

public interface ISingleLinkedList {

    int getSize();

    boolean isEmpty();

    void add(int data);

    int first();

    int last();

    void insertAtBeginning(int data);

    void insertAtEnd(int data);

    void reverse();


    void insertAt(int index,int data);

    int deleteFromBeginning();

    int deleteFromEnd();

    int delete(int index);


    void printList();
}
