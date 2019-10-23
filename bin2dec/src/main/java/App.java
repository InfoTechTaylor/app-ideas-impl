import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.println(prompt);
        String message = scan.nextLine();
        return message;
    }

    public static String validateInput(String input){
        while (!input.equals("1") && !input.equals("0")){
            input = getInput("Enter binary digits. Must be zero or one: ");
        }
        return input;
    }

    public static void main(String[] args) {
        String input = getInput("Enter binary digits: ");
        input = validateInput(input);
        System.out.println(input);
    }
}