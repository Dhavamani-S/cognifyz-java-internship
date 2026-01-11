import java.util.Scanner;
import java.io.*;

public class FileEncryptionDecryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you want to (E)ncrypt or (D)ecrypt? ");
        String choice = sc.nextLine().toUpperCase();

        System.out.print("Enter input file name (with path if needed): ");
        String inputFile = sc.nextLine();

        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        int key = 3; // simple shift for Caesar cipher

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = "";
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (choice.equals("E")) {
                        processedLine += (char)(ch + key);
                    } else if (choice.equals("D")) {
                        processedLine += (char)(ch - key);
                    }
                }
                writer.write(processedLine);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("Operation completed. Output saved to " + outputFile);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
