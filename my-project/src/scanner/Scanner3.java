package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요");
        int num1 = scanner.nextInt();

        System.out.print("두번쨰 정수를 입력하세요");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("두 정수중 더 큰수는 " + num1);
        } else if (num1 == num2) {
            System.out.println("두 정수가 같습니다");
        } else {
            System.out.println("두 정수중 더 큰수는 " + num2);
        }
    }
}
