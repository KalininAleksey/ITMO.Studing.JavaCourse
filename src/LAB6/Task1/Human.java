package LAB6.Task1;

public abstract class Human {
    private String name;
    private String firstname;

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public abstract void printInfo();

    public Human(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
    }
}
