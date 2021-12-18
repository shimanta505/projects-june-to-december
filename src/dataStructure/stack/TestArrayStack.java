package dataStructure.stack;

public class TestArrayStack {
    public static void main(String[] args) {
        ArrayBasedStack stack = new ArrayBasedStack(2);
        stack.push(1);
        stack.push(2);
        stack.printStack();
        stack.push(3);
        stack.push(4);
        stack.printStack();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.printStack();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();stack.printStack();
        stack.pop();
        stack.pop();
        stack.printStack();
    }
}
