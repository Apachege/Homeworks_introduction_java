package homework3;

import java.util.ArrayList;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(1, 10));
        }
        System.out.println(array);
        int min = minValueList(array);
        System.out.printf("Минимальное значение : %d\n", min);
        int max = maxValueList(array);
        System.out.printf("Максимальное значение : %d\n", max);
        int mid = midValueList(array);
        System.out.printf("Среднее значение : %d\n", mid);
    }
    public static int minValueList (ArrayList<Integer> array) {
        int min = array.get(0);
        for (int elem: array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }
    public static int maxValueList (ArrayList<Integer> array) {
        int max = array.get(0);
        for (int elem: array) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }
    public static int midValueList (ArrayList<Integer> array) {
        int mid = 0;
        int sum = 0;
        for (int elem: array) {
            sum += elem;
        }
        mid = sum / array.size();
        return mid;
    }
}


// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.