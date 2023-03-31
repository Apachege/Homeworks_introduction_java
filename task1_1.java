// Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int sum = 0;
        for (int i = 0; i < num + 1; i++) {
            sum += i;
        }
        System.out.printf("n-ое треугольное число = %d", sum);
    }
}