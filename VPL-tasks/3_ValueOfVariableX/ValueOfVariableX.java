// Modify the given class so that in the program output the value of the variable x is 9 and the value of the variable y is 6.

// Note - DO NOT set the values 9 and 6 directly as arguments to the println method (line 8) so do not hard-code the values.

public class ValueOfVariableX {
    
    public static void main(String [] args) {
        
        int x = 2;
        x = x + 7;

        int y = x - 3;
        
        System.out.println("x: " + x + ", y: " + y);
    }
}