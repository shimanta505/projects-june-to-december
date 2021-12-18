package oop.methods.Overriding;
public class MethodOverridingTest2 extends MethodOverridingTest {
    int reg;

    @Override
    protected void part1() {

        System.out.println("name : "+name);
        System.out.println("roll : "+roll);
        System.out.println("reg : "+reg);
    }

    public static void main(String[] args) {
        MethodOverridingTest first =new MethodOverridingTest();
        first.name="oni";
        first.roll=23;
        first.part1();

        MethodOverridingTest2 second =new MethodOverridingTest2();
        second.name="ovi";
        second.roll=24;
        second.reg=1223;
        second.part1();
    }
}
