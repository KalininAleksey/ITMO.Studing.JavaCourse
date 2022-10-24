package LAB4;

import java.util.Scanner;

public class Main {
    public static int[] arrayInput(boolean isCheckingTwoOrMoreElementsOn) {
        System.out.print("Введите количество элементов массива:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] arr = new int[b];
        if ((b >= 2) || (!isCheckingTwoOrMoreElementsOn)) {
            for (int i = 0; i < b; i++) {
                System.out.print("Введите " + (i) + "-й элемент массива: ");
                arr[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Количество элементов массива должно быть больше или равно 2.");
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Часть 1");
        System.out.println("Упражнение 1");
        //Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
        for (int i = 1; i < 99; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Упражнение 2");
        //Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).
        //Пример вывода:
        //Делится на 3: ….
        //Делится на 5: ….
        //Делится на 3 и на 5: ….

        for (int i = 1; i < 100; i = i + 1) {
            if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else {
                if ((i % 3) == 0) System.out.println("Делится на 3: " + i);
                if ((i % 5) == 0) System.out.println("Делится на 5: " + i);
            }
        }
        System.out.println("Упражнение 3");
        //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
        // Пример вывода:
        //Введите первое число: 5
        //Введите второе число: 10
        //Введите третье число: 15
        //Результат: true

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
        System.out.print("Введите третье число:");
        int c = scanner.nextInt();
        if (a + b == c) System.out.println("Результат: true");
        else System.out.println("Результат: false");

        System.out.println("Упражнение 4");
        //Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
        // если второе число больше первого числа, а третье число больше второго числа. Пример вывода:
        //Введите первое число: 5
        //Введите второе число: 10
        //Введите третье число: 15
        //Результат: true

        System.out.print("Введите первое число:");
        a = scanner.nextInt();
        System.out.print("Введите второе число:");
        b = scanner.nextInt();
        System.out.print("Введите третье число:");
        c = scanner.nextInt();
        System.out.println("Результат:" + (b > a && c > b));

        System.out.println("Упражнение 5");

        //Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
        // Длина массива должна быть больше или равна двум. Пример вывода:
        //array = 3, -3, 7, 4, 5, 4, 3
        //true

        int[] arr1 = arrayInput(true);
        if (arr1.length > 1) {
            boolean isResTrue = false;
            for (int i = 0; i < arr1.length; i++) {
                if ((i == 0 && arr1[i] == 3) || (i == b - 1 && arr1[i] == 3)) isResTrue = true;
            }
            System.out.println("Результат:" + isResTrue);
        }

        System.out.println("Упражнение 6");
        //Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
        int[] arr2 = arrayInput(false);
        boolean isResTrue = false;
        for (int i = 0; i < arr2.length; i++) {
            if ((arr2[i] == 1) || (arr2[i] == 3)) isResTrue = true;
        }
        System.out.println("Результат:" + isResTrue);

        System.out.println("Часть 2");
        System.out.println("Упражнение 1");

        //	Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
        // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст “Please, try again”

        int[] arr3 = arrayInput(false);
        String res = "OK";
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < arr3[i - 1]) {
                res = "Please,try again";
                break;
            }
        }
        System.out.println(res);

        System.out.println("Упражнение 2");

        //Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
        //затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
        //Array length: 4
        //Numbers of array:
        //5
        //6
        //7
        //2
        //Result: [5, 6, 7, 2]
        int[] arr4 = arrayInput(false);
        System.out.print("Результат: ");
        printArray(arr4);

        System.out.println("Упражнение 3");
        //Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
        //Array 1: [5, 6, 7, 2]
        //Array 2: [2, 6, 7, 5]
        int arr5[] = arrayInput(false);
        System.out.print("Массив до: ");
        printArray(arr5);
        if (arr5.length > 1) {
            int firstElement = arr5[0];
            arr5[0] = arr5[arr5.length - 1];
            arr5[arr5.length - 1] = firstElement;
        }
        System.out.print("Массив после: ");
        printArray(arr5);

        System.out.println("Упражнение 4");
        //Дан массив чисел. Найдите первое уникальное в этом массиве число.
        //Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
        int arr6[] = arrayInput(true);
        if (arr6.length > 1) {
            printArray(arr6);

            boolean isFirstUnique = true;
            int firstUniqueElement=0;
            for (int i = 0; i < arr6.length; i++) {
                isFirstUnique = true;
                for (int j = 0; j < arr6.length; j++) {
                    if ((arr6[i] == arr6[j]) && (j!=i)) {
                        isFirstUnique = false;
                        break;
                    }
                }
                if (isFirstUnique) {
                    firstUniqueElement=arr6[i];
                    break;
                }
            }
            if (isFirstUnique) {
                System.out.println("Первый уникальный элемент в массиве: " + firstUniqueElement);
            } else {
                System.out.println("Уникальныч элементов в массиве не найдено");
            }

                /*
                //Сортировка перестановкой

                boolean isSortActionWorkedOut = true;
                int tempElement;
                while (isSortActionWorkedOut) {
                    isSortActionWorkedOut = false;
                    for (int i = 0; i < arr6.length - 1; i++) {
                        if (arr6[i + 1] < arr6[i]) {
                            tempElement = arr6[i];
                            arr6[i] = arr6[i + 1];
                            arr6[i + 1] = tempElement;
                            isSortActionWorkedOut = true;
                        }
                    }
                }*/

        }

    }
}



