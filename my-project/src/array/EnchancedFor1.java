package array;

public class EnchancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        for (int number : numbers) {
            System.out.println(number);
        }
        //for-each문을 사용하지 못하는 경우, index값이 필요한 경우
        for (int i =0;i< numbers.length;i++) {
            System.out.println("number" + i + "번의 결과는:" + numbers[i]);
        }

        //일반 for문
        for (int i = 0;i<numbers.length;i++) {
            int number = numbers[i];
            System.out.print(number);
        }
        System.out.println();
        //향산된 for문, for-each문
        for (int number : numbers) {
            System.out.print(number);
        }

        }

    }
