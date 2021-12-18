package dataStructure.stack;

public class TestStack {
    public static void main(String[] args) {

       IStack minStack = new LinkedStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        minStack.push(10);
        minStack.push(50);
        minStack.push(3);
        minStack.push(5);
        minStack.push(3);

        System.out.println(minStack.minStack());

        System.out.println("Here goes the min stack");
        minStack.minStack();
        System.out.println("After popping....");
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.pop();
        minStack.push(5);
        minStack.push(10);
        minStack.pop();
        minStack.pop();

        System.out.println(minStack.minStack());





    }
}
