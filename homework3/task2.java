package homework3;

import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(1, 10));
        }
        System.out.println(array);
        listEven(array);
        System.out.println(array);
    }
    public static void listEven(ArrayList<Integer> array) {
        int i = 0;
        while (i < array.size()) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
            } else i ++;
        }
    }
}


// Пусть дан произвольный список целых чисел, удалить из него чётные числа