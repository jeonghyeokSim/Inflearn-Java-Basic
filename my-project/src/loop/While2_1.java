package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 10;
        sum = sum + i;
        System.out.println("i = " + i + "sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + "sum = " + sum);
        i++;
        sum = sum + i;
        System.out.println("i = " + i + "sum = " + sum);
        //좋은 코드는 변경사항이 적은 코드
    }
}
