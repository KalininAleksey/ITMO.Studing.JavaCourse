package lAB4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Часть 1");
        System.out.println("Упражнение 1");
        for(int i = 1; i < 99; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Упражнение 2");
        for(int i = 1; i < 100; i=i+1) {
            if ((i % 3)==0 && (i % 5)==0)
            {
                System.out.println("Делится на 3 и на 5: "+i);
            }
            else
            {
                if ((i % 3)==0) System.out.println("Делится на 3: "+i);
                if ((i % 5)==0) System.out.println("Делится на 5: "+i);
            }
        }
        System.out.println("Упражнение 3");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a=scanner.nextInt();
        System.out.print("Введите второе число:");
        int b=scanner.nextInt();
        System.out.print("Введите третье число:");
        int c=scanner.nextInt();
        if (a+b==c) System.out.println("Результат: true"); else System.out.println("Результат: false");

        System.out.println("Упражнение 4");
        System.out.print("Введите первое число:");
        a=scanner.nextInt();
        System.out.print("Введите второе число:");
        b=scanner.nextInt();
        System.out.print("Введите третье число:");
        c=scanner.nextInt();
        //if (b > a && c > b) System.out.println("Результат: true"); else System.out.println("Результат: false");
        System.out.println("Результат:"+(b > a && c > b));
        System.out.println("Упражнение 5");
        System.out.print("Введите количество элементов массива(должно быть больше или равно 2):");
        b=scanner.nextInt();
        if (b>=2){
        int[] arr = new int[b];
        boolean isResTrue=false;
        for (int i=0;i<b;i++)
        {
            System.out.print("Введите " + (i) + "-й элемент массива: ");
            arr[i] = scanner.nextInt();
            if ((i==0 && arr[i]==3) || (i==b-1 && arr[i]==3)) isResTrue=true;
        }
            System.out.println("Результат:"+isResTrue);
        }
        else  System.out.print("Количество элементов массива должно быть больше или равно 2.");

        System.out.println("Упражнение 6");
        System.out.print("Введите количество элементов массива:");
        b=scanner.nextInt();
            int[] arr2 = new int[b];
            boolean isResTrue=false;
            for (int i=0;i<b;i++)
            {
                System.out.print("Введите " + (i) + "-й элемент массива: ");
                arr2[i] = scanner.nextInt();
                if ((arr2[i]==1) || (arr2[i]==3)) isResTrue=true;
            }
            System.out.println("Результат:"+isResTrue);

        System.out.println("Часть 2");
        System.out.println("Упражнение 1");
        System.out.print("Введите количество элементов массива:");
        b=scanner.nextInt();
        int[] arr3 = new int[b];
        isResTrue=false;
        for (int i=0;i<b;i++)
        {
            System.out.print("Введите " + (i) + "-й элемент массива: ");
            arr2[i] = scanner.nextInt();
            if ((arr3[i]==1) || (arr3[i]==3)) isResTrue=true;
        }

        if (isResTrue==true) System.out.println("OK");

    }

}
