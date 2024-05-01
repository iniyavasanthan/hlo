import java.util.Scanner;

public class hlo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        if (scanner.hasNextLine()) { // Check if input is available
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } else {
            System.out.println("No input provided.");
        }
        
        scanner.close(); // Close the scanner
    }
}
