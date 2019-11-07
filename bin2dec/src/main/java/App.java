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

    public static void main(String[] args) {
        String input = getInput("Enter binary digits: ");
        System.out.println(input);
        int result = convertBinaryToDecimal(input);
        System.out.println("Your binary number of " + input + " is " + result);
    }
}