// Write a Java method...

// int bitLen(int n)
// ... which counts the number of bits in an integer n given as an argument. The program must output the number of bits in the main program. Note however, if the given integer n is not positive, the program must output (without quotation marks)...

// "Invalid value!"

import java.util.Scanner;

public class Bitlen {

    static int bitLen(int n) {
        int bits = 1;
       
        if (n <= 0) {
            return -1;
        }

        while (n > 1) {
            n = n / 2;
            bits++;
        }
       
        return bits;
    }

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int bits = 0;

        System.out.print("Give integer: ");

        a = sc.nextInt();
        
        bits = bitLen(a);

        if (bits == -1) {
            System.out.println("Invalid value!");
        } else {
            System.out.println(bits);
        }
        
        sc.close();
    }
}
