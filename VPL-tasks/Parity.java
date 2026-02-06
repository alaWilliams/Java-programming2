// Write a Java method...

// void printParity(int v)
// ... which displays (without quotation marks) either "Odd" or "Even" (without quotation marks) based on the given integer value.

import java.util.Scanner;

public class Parity {

    static void printParity(int v) {

        if (v % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

     public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Enter number");

        a = sc.nextInt();
        
        printParity(a);

        sc.close();
    }
}