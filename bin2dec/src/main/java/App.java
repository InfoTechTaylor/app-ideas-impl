import java.util.Scanner;
import java.lang.Math;

public class App {

    public static Scanner scan = new Scanner(System.in);


    public static String getInput(String prompt){
        String input;

        System.out.println(prompt);
        input = scan.nextLine();

        return input;
    }

    public static int convertBinaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int length = binaryInput.length();
        int count = 0;
        for(int i = length - 1; i >= 0; i--){
            char digitChar = binaryInput.charAt(count);

            int digit = Character.getNumericValue(digitChar);

            if (digit == 1){
                decimalResult += Math.pow(2,i);
            }
            count++;
        }

        return decimalResult;
    }

    public static boolean isValidInput(String input) {
        int length = input.length();
        for(int i = 0; i <= length -1; i++){
            char digitChar = input.charAt(i);

            int digit = Character.getNumericValue(digitChar);

            if (!isZeroOrOne(digit)){
                return false;
            }
        }
        return true;
    };

    public static boolean isZeroOrOne(int digit) {
        if (digit != 1 && digit != 0){
            return false;
        }
        return true;
    };

    public static void validateInput(String input) {
        while (!isValidInput(input)){
            input = getInput("Input must consist of only 0's and 1's. Enter binary digits: ");
        };
    };

    public static void main(String[] args) {
        String input = getInput("Enter binary digits: ");
        validateInput(input);
        int result = convertBinaryToDecimal(input);
        System.out.println("Your binary number of " + input + " is " + result);
    }
}