package conditionals;

import java.util.Scanner;

public class Grades {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Give points: ");
    int points = sc.nextInt();
    
    String grade = null;

    if (points >= 90) {
      grade = "5";
    } else if (points >= 80) {
      grade = "4";
    } else if (points >= 70) {
      grade = "3";
    } else if (points >= 60) {
      grade = "2";
    } else {
      grade = "F";
    }

    System.out.print("Grade " + grade);

    sc.close();

  };


  
}
