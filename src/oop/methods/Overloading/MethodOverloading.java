package oop.methods.Overloading;

public class MethodOverloading {

    protected void abs(int a){
        System.out.println("int number");
    }
    protected void abs(int a, int b){
        System.out.println("first int second int");
    }
    protected void abs(double a){
        System.out.println("double number");
    }
    protected void abs(){
        System.out.println("no parameter");
    }

    public static void main(String[] args) {
        MethodOverloading test =new MethodOverloading();
        test.abs(45);
        test.abs(34,45);
        test.abs(30.5);
        test.abs();
    }

}
