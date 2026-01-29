package conditionals;
import java.util.Random;

public class LoginAttempts {
  public static void main(String[] args) {
    Random rand = new Random();

    int attempts = rand.nextInt(0, 10) + 1;

    System.out.println("Attempts: " + attempts);
  }

}
