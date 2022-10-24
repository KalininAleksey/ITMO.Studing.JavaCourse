package LAB3;
import java.time.LocalDate;

public class House {
    private int floorsNumber;
    private int buildYear;
    private String name;

    public int yearFromBuilding ()
    {
        int year=this.buildYear;
        LocalDate dt=LocalDate.now();
        int yearNow=dt.getYear();
        return yearNow-year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public int getFloorsNumber() {
        return floorsNumber;
    }
    public String getHouseInfo()
    {
       return ("For house with name '"+this.getName()+"\' that has " + this.getFloorsNumber()+" floor(s) is passed "+this.yearFromBuilding()+" year(s) from building in "+this.getBuildYear()+" year(s)");
    }
}
    class HouseMain {
        public static void main(String[] args) {
            //TODO
            House house1=new House();
            house1.setFloorsNumber(1);
            house1.setBuildYear(1995);
            house1.setName("Shop");
            House house2=new House();
            house2.setFloorsNumber(6);
            house2.setBuildYear(1975);
            house2.setName("Hospital");
            System.out.println(house1.getHouseInfo());
            System.out.println(house2.getHouseInfo());
        }
    }

