package LAB7;

class Main {
    public static void main(String[] args) {
        Plane boeing=new Plane();
        Plane.Wing leftWing=boeing.new Wing();
        leftWing.setWeight(230.2f);
        leftWing.printWeight();
        Plane.Wing rightWing=boeing.new Wing();
        rightWing.setWeight(225.9f);
        rightWing.printWeight();
    }
}
