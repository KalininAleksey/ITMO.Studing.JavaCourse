package LAB9.Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> userScoresMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        List<String> userNames = Arrays.asList("John", "Fred", "Ivan", "Oleg", "Petr");
        Random r = new Random();
        int i = 0;
        for (String name : userNames
        ) {
            i = r.nextInt(100);
            userScoresMap.put(new User(name), i);
            System.out.printf("{%s,%d}\n", name, i);
        }
        System.out.println("Input username to see scores");
        String name = scanner.nextLine();
        boolean isFind = false;
        for (Map.Entry<User, Integer> item : userScoresMap.entrySet()) {
            if (Objects.equals(item.getKey().getName(), name)) {
                System.out.println("User with name " + item.getKey().getName() + " has " + item.getValue() + " scores");
                isFind = true;
                break;
            }
        }
        if (!isFind) {
            System.out.println("User is not find");
        }
    }
}
