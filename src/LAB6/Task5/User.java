package LAB6.Task5;

import java.util.Scanner;

class User {
    protected byte age;
    Scanner scanner = new Scanner(System.in);

    void inputAge() {
        System.out.println("Input the age");
        this.age = scanner.nextByte();
    }

    void print() {
        System.out.println("User age is " + this.age);
    }
}
