package homework3;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(1, 10));
        }
        System.out.println(array);
        mergeSort(array);
        System.out.println(array);
    }
        public static void mergeSort(ArrayList<Integer> array) {
            if (array.size() > 1) {
                ArrayList<Integer> lList = new ArrayList<>();
                ArrayList<Integer> rList = new ArrayList<>();
                int mid = array.size() / 2;
                for (int i = 0; i < mid; i++) {
                    lList.add(array.get(i));
                }
                for (int j = mid; j < array.size(); j++) {
                    rList.add(array.get(j));
                }
                mergeSort(lList);
                mergeSort(rList);
                merge(array, lList, rList);
            }
            
        }    
        public static void merge(ArrayList<Integer> array, ArrayList<Integer> lList, ArrayList<Integer> rList) {
            int i = 0;
            int l = 0;
            int r = 0;
            while (l < lList.size() && r < rList.size()) {
                if (lList.get(l) <= rList.get(r)) {
                    array.set(i, lList.get(l));
                    i++;
                    l++;
                } else {
                    array.set(i, rList.get(r));
                    i++;
                    r++;
                }

            }
            while (l < lList.size()) {
                array.set(i, lList.get(l));
                i++;
                l++;
            }
            while (r < rList.size()) {
                array.set(i, rList.get(r));
                i++;
                r++;
            }
        }
    
}

// Реализовать алгоритм сортировки слиянием