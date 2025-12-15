import java.util.Scanner;

class Main {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = in.nextDouble();
        System.out.println("Enter unit(F/C) : ");
        char unit = in.next().charAt(0);
        double result;
        
        if(Character.toLowerCase(unit) == 'f'){
            result = (temp - 32) * 5/9;
             System.out.printf("Final Temperature is : %.2f C",result);
        }
        else if(Character.toLowerCase(unit) == 'c'){
            result = (temp * 9/5) + 32;
             System.out.printf("Final Temperature is : %.2f F",result);
        }
        else{
            System.out.printf("Invalid input");
            return;
        }

    }
}