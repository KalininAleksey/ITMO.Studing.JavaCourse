package LAB6.Task3;

import LAB6.Task3.Car;

public class Truck extends Car {
    private byte wheelsNumber;
    public int maxWeight;

    public Truck(int w, String m, char c, float s, byte wheelsN, int maxW) {
        super(w, m, c, s);
        this.wheelsNumber = wheelsN;
        this.maxWeight = maxW;
    }

    public void setMaxWeight(int maxW) {
        this.maxWeight = maxW;
        System.out.println("Max weight = " + this.maxWeight);
    }

}
