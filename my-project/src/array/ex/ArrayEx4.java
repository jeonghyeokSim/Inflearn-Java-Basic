package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]numbers = new int[5];
        System.out.println("정수를 입력하세요");
        for (int i =0;i< numbers.length;i++) {
            numbers[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i =0;i< numbers.length;i++) {
            total += numbers[i];
        }
        double average = (double) total / numbers.length;
        System.out.println("입력한 정수의 합계:" + total);
        System.out.println("입력한 정수의 평균:" + average);

    }
}
