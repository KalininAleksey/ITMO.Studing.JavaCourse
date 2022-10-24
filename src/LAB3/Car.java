package LAB3;

class Car {
    private Color color;
    private String name;
    private int weight;

    public Car() {
    }


    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", Name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

class CarMain {
    public static void main(String[] args) {
        //TODO
        Car car1 = new Car(Color.White, 1100);
        car1.setName("Lada");
        Car car2 = new Car(Color.Red);
        car2.setName("Mazda");
        car2.setWeight(1400);
        System.out.println(car1);
        System.out.println(car2);
    }
}
