import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter operation(+, -, *, /): ");
        String oper = in.next();
        char operation = oper.charAt(0);
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        if (operation == '+'){
            System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        }
        if (operation == '-'){
            System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        }
        if (operation == '*'){
            System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        }
        if (operation == '/'){
            System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        }
    }   
}

