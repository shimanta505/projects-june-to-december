package oop.PolyToAbstract;

public abstract class Car {
    private String color;
    private String modelName;
    private String price;
    private int headLight;

    public Car(String color, String modelName, String price, int headLight) {
        this.color = color;
        this.modelName = modelName;
        this.price = price;
        this.headLight = headLight;
    }
    public abstract void topSpeed();
    public abstract void mileage();

    public String getColor() {
        return color;
    }

    public String getModelName() {
        return modelName;
    }

    public String getPrice() {
        return price;
    }

    public int getHeadLight() {
        return headLight;
    }


}
