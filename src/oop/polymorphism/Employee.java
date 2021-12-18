package oop.polymorphism;

public class Employee {

    public void calculateSalary(){
        System.out.println("calculateing salary for Employee");
    }
    public void calculateSalary(String s){
        System.out.println("calculateing salary for Employee name is "+s);
    }

}
class Manager extends Employee{
    @Override
    public void calculateSalary(){
        System.out.println("calculateing salary for manager");
    }
    @Override
    public void calculateSalary(String s){
        System.out.println("calculateing salary for manager name is "+s);
    }



}
