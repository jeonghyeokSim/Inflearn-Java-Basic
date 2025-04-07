package loop;

public class ForEx2 {
    public static void main(String[] args) {
//        for (int num = 2;num<=20;num++) {  //if 문을 쓰고 짝수만 뽑아낸 코드
//            if (num%2 == 0) {
//                System.out.println(num);
//            }
//        }
//        for (int num = 2, count = 1;count <= 10;num += 2, count++) {
//            System.out.println(num); // 이 코드에서 안것: 여러변수를 선언 할떄는 타입 선언은 한번만 한다.
//        }
        int num = 2;
        for (int count =1;count<=10;count++) { //위의 코드와 같지만 좀더 깔끔한느낌
            System.out.println(num);
            num+=2;
        }
    }
}
