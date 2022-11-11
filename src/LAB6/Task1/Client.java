package LAB6.Task1;

public class Client extends Human {
    public Client(String name, String firstName, String bankName){
        super(name,firstName);
        this.bankName=bankName;
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
