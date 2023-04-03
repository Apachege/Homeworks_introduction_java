package homework2;

import java.io.IOException;
import java.util.logging.*;


public class task2 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 5, 543, 63, 235, 4, 23, 54};

        int[] newArray = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
        public static int[] sort(int[] array) throws IOException {
            int temp = 0;
            Logger logger = Logger.getLogger(task2.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter sFormat = new SimpleFormatter();
            fh.setFormatter(sFormat);
            logger.info("Сортировка пузырьком");
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                        logger.log(Level.INFO, "Поменяли местами " + array[j-1] + " и " + array[j]);
                    }
                }
            }
            return array;
        }
    }

