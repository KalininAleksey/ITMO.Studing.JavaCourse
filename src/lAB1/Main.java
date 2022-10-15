package lAB1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Я\n"+"хорошо\n"+"знаю\n"+"Java\n");
        System.out.println((46+10)*(10/3d));
        System.out.println(29*4*(-15));
        int number=10500;
        double result=(number/10)/10d;
        System.out.println(result);
        result=3.6*4.1*5.9;
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        System.out.println(a);
        int b=scanner.nextInt();
        System.out.println(b);
        int c=scanner.nextInt();
        System.out.println(c);
        if (b%2==0)  {
            if (b>100) System.out.println("выход за пределы диапазона");
            else
            System.out.println("Четное");
        }
        else
            System.out.println("Нечетное");
    scanner.close();
    }
}