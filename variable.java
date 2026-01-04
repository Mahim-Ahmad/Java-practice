public class variable {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;   // Floating point number
        char myLetter = 'D';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String

        System.out.println("Integer: " + myNum);
        System.out.println("Float: " + myFloatNum);
        System.out.println("Character: " + myLetter);
        System.out.println("Boolean: " + myBool);
        System.out.println("String: " + myText);

        System.out.printf("Integer: %d\n, Float: %f\n, Character: %c\n, Boolean: %b\n, String: %s", myNum, myFloatNum, myLetter, myBool, myText);
    }
    
}