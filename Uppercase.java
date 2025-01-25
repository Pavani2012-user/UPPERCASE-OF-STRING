import java.util.Scanner;public class Uppercase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String upperString = inputString.toUpperCase();
        System.out.println("Uppercase String: " + upperString);
        scanner.close();
    }
}
    

