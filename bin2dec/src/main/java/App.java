import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    public static void getBinaryDigits() {
        System.out.println("Enter binary digit:");
        String message = scan.nextLine();
        System.out.println(message);
    }
    public static void main(String[] args) {
        getBinaryDigits();
    }
}