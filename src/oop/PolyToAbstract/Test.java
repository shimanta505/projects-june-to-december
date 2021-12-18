package oop.PolyToAbstract;

public class Test {

    public static void main(String[] args) {

        Car i8 =new Bmw("black","x7","50000$",6);
        i8.topSpeed();
        i8.mileage();
        Car a8 =new Audi("black","A8","70000$",5);
        a8.topSpeed();
        a8.mileage();
    }

}
