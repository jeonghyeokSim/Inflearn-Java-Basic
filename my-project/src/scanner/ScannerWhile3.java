package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("숫자를 입력하세요");
            int num = input.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            sum = sum + num;
        }
            System.out.println("숫자들의 합은" + sum);
        }
    }
