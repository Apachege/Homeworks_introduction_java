public class task2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j ==0){
                    count += 1;
                }
            }
            if (count <= 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
