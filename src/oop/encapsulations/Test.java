package oop.encapsulations;

public class Test {

    public static void main(String[] args) {

        Student std = new Student();
        std.setName("saccha");
        std.setRoll(123);
        std.setReg(2566);
        System.out.println("name :"+std.getName());
        System.out.println("roll :"+std.getRoll());
        System.out.println("reg :"+std.getReg());


    }
}
