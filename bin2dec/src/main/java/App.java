import java.util.Scanner;
import java.lang.Math;

public class App {

    public static Scanner scan = new Scanner(System.in);

    private static final String ONE = "1";
    private static final String ZERO = "0";

    public static String getInput(String prompt){
        String input;

        System.out.println(prompt);
        input = scan.nextLine();

        return input;
    }

    public static int convertBinaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int length = binaryInput.length();
        for(int i = length - 1; i >= 0; i--){
            char digitChar = binaryInput.charAt(i);

            int digit = Character.getNumericValue(digitChar);

            if (digit == 1){
                decimalResult += Math.pow(2,i);
            }
        }

        return decimalResult;
    }

    public static void main(String[] args) {
        String input = getInput("Enter binary digits: ");
        System.out.println(input);
        int result = convertBinaryToDecimal(input);
        System.out.println("Your binary number of " + input + " is " + result);
    }
}