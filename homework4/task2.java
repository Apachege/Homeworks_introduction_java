import java.util.LinkedList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(1, 10));
        }   
        System.out.println(linkedList); 
        enqueue(linkedList, 7);
        dequeue(linkedList);
        first(linkedList);
    }
    public static void enqueue(LinkedList<Integer> linkedList, int elem) {
        linkedList.addLast(elem);
        System.out.println(linkedList);
    }
    public static void dequeue(LinkedList<Integer> linkedList) {
        linkedList.getFirst();
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
    public static void first(LinkedList<Integer> linkedList) {
        System.out.println(linkedList.getFirst());
    }
}

// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.