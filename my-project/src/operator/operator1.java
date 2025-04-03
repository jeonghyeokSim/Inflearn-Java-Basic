package operator;

public class operator1 {

    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b =" + sum);

        //뺼셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈
        int div = a / b;
        System.out.println("a + b = " + div); //int형끼리의 계산은 int만 나온다.정수만 표현가능하기 떄문

        //나머지
        int mod = a % b; // 5/2 몫2 나머지 1
        System.out.println("a % b = " + mod);

        



    }
}
