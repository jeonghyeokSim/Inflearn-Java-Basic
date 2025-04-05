package loop;

public class For2_2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;; i++) {
            sum = sum + i;
            if (sum>10) {
                System.out.println("i=" + i + "sum=" + sum);
                break;
            }
        }
    }
}
