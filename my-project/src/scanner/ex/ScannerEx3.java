package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요");

        String foodname = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요");

        int foodprice = scanner.nextInt();
        System.out.print("음식의 수령을 입력해주세요");

        int foodQuantity = scanner.nextInt();
        int totalPrice = foodprice * foodQuantity;
        System.out.println(foodname + foodQuantity + "개를 주문하셨습니다." + "총 가격은" + totalPrice + "입니다");
    }
}
