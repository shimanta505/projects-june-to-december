package oop.Abstraction;

public abstract class Employee extends Test{
    private String name;
    private String email;
    private String address;
    private int salary;

    public Employee(String name,String email,String address,int salary){
        this.name=name;
        this.email=email;
        this.address=address;
        this.salary=salary;
    }
    public abstract void name();

    public abstract void calculateSalary();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}