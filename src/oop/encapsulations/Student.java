package oop.encapsulations;

public class Student {

    private String name;
    private int roll;
    private int reg;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setRoll(int roll){
        if(roll>0) {
            this.roll = roll;
        }else{
            System.out.println("this is invalid");
        }
    }
    public int getRoll(){
        return roll;
    }
    public void setReg(int reg){
        this.reg=reg;
    }
    public int getReg(){
        return reg;
    }
}