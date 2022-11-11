package LAB6.Task5;

class ChildUser extends User{
    String name;
    String getUserName(){
        this.name=super.scanner.nextLine();
        return this.name;
    }
    @Override
    void print(){
        System.out.println("Name is "+this.getUserName());
    }
}
