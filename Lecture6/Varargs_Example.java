public class Varargs_Example {
  public static void main (String[] args) {
    double [] d_values = {1.2, 2.4, 3.6, 4.3, 5.4};
    int [] i_values = {1,2,3,4,5 };

    System.out.println(calculateSum(d_values));
    System.out.println(calculateSum(i_values));

  }

  private static double calculateSum(double [] array) {
    double sum = 0.0;
    for (double d : array){
      sum += d;
    }
    return sum;
  }
  // private static int calculateSum(int [] array) {
  //   int sum = 0;
  //   for (double i : array){
  //     sum += i;
  //   }
  //   return sum;
  // }

    private static int calculateSum(int ... array) {
    int sum = 0;
    for (double i : array){
      sum += i;
    }
    return sum;
  }
  }

