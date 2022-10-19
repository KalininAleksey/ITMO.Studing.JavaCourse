package LAB2;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private Country country;
    public  Person()
    {};
    public Person(String FName, String LName) {
        this.firstName = FName;
        this.lastName = LName;
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country=" + country +
                '}';
    }

}
