

public class CalculateArea {
  public static void main(String[] args) {
    //area of circle
    //Class Math - methods and constant values

    double number = 5.5;

    double area =  calculateCircleArea(number);

    System.out.println(area);
  }

  private static double calculateCircleArea(double r) {
    return Math.PI * Math.pow(r, 2.0);
  }
}
