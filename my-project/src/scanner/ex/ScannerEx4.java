package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("출려하고 싶은 구구단의 단수를 입력하세요");
        int num = scanner.nextInt();
        for (int i = 1;i<=9;i ++) {
            System.out.println(num + "X" + i +"=" + num * i);
        }
    }
}
