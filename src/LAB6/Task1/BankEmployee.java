package LAB6.Task1;

public class BankEmployee extends Human {
    public BankEmployee(String name, String firstName, String bankName) {
        super(name, firstName);
        this.bankName = bankName;
    }

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    @Override
    public void printInfo() {
        System.out.println(super.getName() + " " + super.getFirstname() + " " + this.bankName);
    }
}
