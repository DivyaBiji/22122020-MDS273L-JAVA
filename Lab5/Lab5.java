import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message, result;
        int choice;
        do {
            System.out.println("\n1. Encrypt");
            System.out.println("2. Decrypt");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume the newline character
            switch (choice) {
                case 1:
                    System.out.print("\nEnter message to encrypt: ");
                    message = sc.nextLine();
                    result = encrypt(message);
                    System.out.println("Encrypted message: " + result);
                    break;
                case 2:
                    System.out.print("\nEnter message to decrypt: ");
                    message = sc.nextLine();
                    result = decrypt(message);
                    System.out.println("Decrypted message: " + result);
                    break;
                case 3:
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice! Please choose again.");
            }
        } while (choice != 3);
        sc.close();
    }
    
    public static String encrypt(String message) {
        String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String encryptedMessage = "";
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                int index = plain.indexOf(c);
                encryptedMessage += cypher.charAt(index);
            } else {
                encryptedMessage += c;
            }
        }
        return encryptedMessage;
    }
    
    public static String decrypt(String encryptedMessage) {
        String plain = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cypher = "XYZABCDEFGHIJKLMNOPQRSTUVW";
        String decryptedMessage = "";
        encryptedMessage = encryptedMessage.toUpperCase();
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char c = encryptedMessage.charAt(i);
            if (Character.isLetter(c)) {
                int index = cypher.indexOf(c);
                decryptedMessage += plain.charAt(index);
            } else {
                decryptedMessage += c;
            }
        }
        return decryptedMessage;
    }
}