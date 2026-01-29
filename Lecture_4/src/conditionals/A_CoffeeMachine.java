package conditionals;

import java.util.Scanner;

public class A_CoffeeMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of water: ");

        int waterLevel = sc.nextInt();

        if (waterLevel > 0) {
            brewCoffee();
        } else {
            System.out.println("Error: No water!");
        }

        sc.close();
    }

    private static void brewCoffee() {
        System.out.println("Have a cup of coffee!");
    }
}
