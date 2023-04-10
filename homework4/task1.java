import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(1, 10));
        }   
        System.out.println(linkedList);
        LinkedList<Integer> revList = new LinkedList<>();
        for (int i = 0; i < linkedList.size(); i++) {
            revList.addFirst(linkedList.get(i));
        }
        System.out.println(revList); 
    }
}