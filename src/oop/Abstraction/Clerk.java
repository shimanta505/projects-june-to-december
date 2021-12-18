package oop.Abstraction;

public class Clerk extends Employee {

    public Clerk(String name,String email,String address,int salary){
        super(name,email,address,salary);
    }

    @Override
    public void name() {

    }

    @Override
    public void calculateSalary(){
        System.out.println("calculate salary for clerk");
    }
}