import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    private static final String ONE = "1";
    private static final String ZERO = "0";

    public static String getInput(String prompt){
        String input;
        do {
            System.out.println(prompt);
            input = scan.nextLine();
        } while (!input.equals(ONE) && !input.equals(ZERO));
        return input;
    }

    public static void main(String[] args) {
        String input = getInput("Enter binary digits: ");
        System.out.println(input);
    }
}