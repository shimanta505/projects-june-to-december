package oop.PolyToAbstract;

public class Bmw extends Car{

    public Bmw(String color, String modelName, String price, int headLight) {
        super(color, modelName, price, headLight);
    }

    @Override
    public void topSpeed() {
        System.out.println("BMW top speed is 300km/h");
    }

    @Override
    public void mileage() {
        System.out.println("around 18 to 20km");
    }
}
