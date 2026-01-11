import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()_+";

        String characters = "";

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include lowercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characters += lowercase;
        }

        System.out.print("Include uppercase letters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characters += uppercase;
        }

        System.out.print("Include numbers? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characters += numbers;
        }

        System.out.print("Include special characters? (y/n): ");
        if (sc.next().equalsIgnoreCase("y")) {
            characters += special;
        }

        if (characters.isEmpty()) {
            System.out.println("No character set selected. Password cannot be generated.");
            return;
        }
        String password = "";
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
