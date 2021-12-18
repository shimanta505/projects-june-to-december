package dataStructure.stack;

public interface IStack {

    boolean isEmpty();

    void push(int data);

    int pop();

    int top();

    int size();

    int minStack();

    int maxStack();
}
