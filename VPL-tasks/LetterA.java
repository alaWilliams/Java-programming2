// Write a Java method...

// void printLetterA(int n)
// ... which outputs n times letter "A" (without quotation marks, to one line, one after another).

// If the value of n is less or equal to 0, the program must output...

// "The number must be greater than 0!"
// ... without quotation marks.

import java.util.Scanner;

public class LetterA {

    static void printLetterA(int n) {
        
       if (n <= 0) {
        System.out.println("The number must be greater than 0!");
       } else {
        for (int i = 0; i < n; i++) {
            System.out.print("A");
        }
       }
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.print("Give integer: ");
        a = sc.nextInt();

        printLetterA(a);

        sc.close();
    }
}