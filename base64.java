import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class Base64EncoderDecoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menu for the user
            System.out.println("\nBase64 Encoder/Decoder");
            System.out.println("1. Base64 Encode");
            System.out.println("2. Base64 Decode");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    base64Encode();
                    break;
                case 2:
                    base64Decode();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Method to perform Base64 encoding
    private static void base64Encode() {
        Scanner scanner = new Scanner(System.in);

        // Get the string to encode from the user
        System.out.print("Enter the string to encode: ");
        String inputString = scanner.nextLine();

        // Perform Base64 encoding
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes(StandardCharsets.UTF_8));

        // Display the result
        System.out.println("Base64 Encoded String: " + encodedString);
    }

    // Method to perform Base64 decoding
    private static void base64Decode() {
        Scanner scanner = new Scanner(System.in);

        // Get the Base64 encoded string from the user
        System.out.print("Enter the Base64 encoded string to decode: ");
        String encodedString = scanner.nextLine();

        // Perform Base64 decoding
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes, StandardCharsets.UTF_8);

        // Display the result
        System.out.println("Base64 Decoded String: " + decodedString);
    }
}
