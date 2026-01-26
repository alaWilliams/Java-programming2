import java.time.Year;
public class Person {

  //Attributes always private unless you have a very good reason otherwise
    private String name;
    private int birthYear;
    private double height;


    public double getHeight() {
      return height;
    }

    //names of the params are hiding the attributes
    public Person(String name, int birthYear, double height) {
        this.name = name;
        this.birthYear = birthYear;
        this.height = height;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
      if ((name != null && name.length() > 0 ))
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
      if ((birthYear > 150 && birthYear <= Year.now().getValue()))
      this.birthYear = birthYear;
    }

    public double height() {
      return height;
    }
    public void setHeight(double height) {
      this.height = height;
    }

    @Override
    public String toString() {
      return "I tried overriding";
    }

}
