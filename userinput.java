import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.print("Enter a floating point number: ");
        float userFloat = scanner.nextFloat();

        System.out.print("Enter a character: ");
        char userChar = scanner.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean userBool = scanner.nextBoolean();

        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println("Integer: " + userInt);
        System.out.println("Float: " + userFloat);
        System.out.println("Character: " + userChar);
        System.out.println("Boolean: " + userBool);
        System.out.println("String: " + userString);

        scanner.close();
    }
}
