public class operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        //assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = a; // Simple assignment
        System.out.println("c = a: " + c);
        c += b;    // c = c + b 
        System.out.println("c += b: " + c);
        c -= b;    // c = c - b
        System.out.println("c -= b: " + c);
        c *= b;    // c = c * b
        System.out.println("c *= b: " + c);
        c /= b;    // c = c / b
        System.out.println("c /= b: " + c);
        c %= b;    // c = c % b
        System.out.println("c %= b: " + c);
        

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Greater than or equal to: " + (a >= b));
        System.out.println("Less than or equal to: " + (a <= b));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT: " + (!x));
    }
}
