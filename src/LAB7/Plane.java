package LAB7;

public class Plane {
    String name;

    public class Wing {
        float weight;

        void setWeight(float weight) {
            this.weight = weight;
        }

        public void printWeight() {
            System.out.println("Weight of wing is " + this.weight);
        }
    }
}

