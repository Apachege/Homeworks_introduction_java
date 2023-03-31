import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        System.out.println(num);
        int fact = 1;
        if (num == 0 || num == 1){
            System.out.printf("Factorial = %d", fact);
        }
        else{
            for (int i = 2; i <= num; i++) {
                fact *= i;
            }
            System.out.printf("Factorial = %d", fact);
        }
    }  
}