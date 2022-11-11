package LAB6.Task1;

import LAB6.Task1.BankEmployee;
import LAB6.Task1.Client;

public class HumanMain {
    public static void main(String[] args) {
        Client bankClient = new Client("Oleg", "Petrov", "New Bank");
        BankEmployee employee = new BankEmployee("Petr", "Ivanov", "New Bank");
        bankClient.printInfo();
        employee.printInfo();
    }
}
