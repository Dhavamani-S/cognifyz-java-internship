import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word or phrase : ");
        String word = in.nextLine();
       
        String sentance = word.replaceAll("\\s+","").toLowerCase();
        sentance = sentance.replaceAll("[^a-zA-Z0-9]","");
        String reversed = "";

        for(int i = sentance.length() - 1 ;i >= 0;i--) {
            reversed += sentance.charAt(i);
        }

        if(sentance.equals(reversed)) {
            System.out.println("The given word or phrase is palindrome.");
        }
        else {
            System.out.println("The given word or phrase is not a palindrome.");
        }
        in.close();
    }
}