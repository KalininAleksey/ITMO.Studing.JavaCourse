package LAB6.Task4;

import java.util.Scanner;

class Parent {
    protected int field;

    void setField() {
        Scanner scanner=new Scanner(System.in);
        this.field= scanner.nextInt();
    }
}
