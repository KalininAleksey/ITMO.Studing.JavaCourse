package LAB5.Task2;

import java.util.Scanner;

//Написать метод, который проверяет является ли слово палиндромом.
public class Lab5Task2 {
    public static boolean palindromeWordCheck(String word) {
        word = word.trim();
        word = word.replaceAll("\\p{P}", "");
        char[] symbols = word.toCharArray();
        boolean result=true;
        if (symbols.length>1){
            for (int i = 0; i < symbols.length / 2; i++) {
                if (symbols[i]!=symbols[symbols.length-1-i]){
                    result=false;
                }
            }
        }
        else{
            result=false;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Введите слово для проверки");
        Scanner scanner = new Scanner(System.in);
        String checkingWord = scanner.next();
        System.out.println("Проверяемое слово: "+checkingWord);
        System.out.println("Результат проверки, что слово палиндром: "+palindromeWordCheck(checkingWord));
    }
}
