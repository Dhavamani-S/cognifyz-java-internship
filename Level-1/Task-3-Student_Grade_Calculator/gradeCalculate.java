import java.util.*;

class GradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of grades : ");
        int num = sc.nextInt();
        int[] grade = new int[num];
        int count= 0,sum=0;

        for(int i = 0;i<num;i++) {
            System.out.print("Enter grade "+ (i+1)+" : ");
            grade[i] = sc.nextInt();
            sum += grade[i];
            count++;
        }

        sc.close();
        System.out.println();
        System.out.println("Average grade : "+(sum / count));

    }
}