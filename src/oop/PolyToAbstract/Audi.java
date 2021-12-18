package oop.PolyToAbstract;

public class Audi extends Car{


    public Audi(String color, String modelName, String price, int headLight) {
        super(color, modelName, price, headLight);
    }

    @Override
    public void topSpeed() {
        System.out.println("Audi top speed is 290km/h");
    }

    @Override
    public void mileage() {
        System.out.println("around 15 to 18km");
    }
}
