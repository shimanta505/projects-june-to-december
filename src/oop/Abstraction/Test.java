package oop.Abstraction;

public class Test {


    public void name(){
        System.out.println("name of a test");
    }
    public static void main(String[] args) {

        Clerk clerk = new Clerk("demo clerk","@clerk.gmail","Dhaka",5000);
        System.out.println(clerk.getName());
        clerk.calculateSalary();


        System.out.println("-----------");



        Manager manager = new Manager("demo manager","@manager","Dhaka",6000);
        System.out.println(manager.getName());
        manager.calculateSalary();

    }

}
