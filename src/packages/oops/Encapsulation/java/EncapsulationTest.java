package packages.oops.Encapsulation.java;
public class EncapsulationTest {
    private String name;
    private int age;
    private int reg;
    private int roll;
//    private boolean right;
//    private double number;
//    private int result;



    public void setAge(int age) {
        if (age>17){
            System.out.println("you are old enough for admission");
        }
        else {
            System.out.println("you aren't enough");
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setReg(int reg){
        this.reg=reg;
    }
    public int getReg(){
        return this.reg;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public int getRoll(){
        return this.roll;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
         return this.name;
    }

    public static void main(String[] args) {
        EncapsulationTest test =new EncapsulationTest();
    }
}
