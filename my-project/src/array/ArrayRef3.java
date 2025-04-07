package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
         students = new int[]{90,80,70,60,50}; //배열 생성과 초기화

        //변수 값 사용
        for (int i =0;i<students.length;i++){
            System.out.println("학생" + (i+1) +"의 점수:" +students[i]);
        }
//        System.out.println("학생 1의 점수 :" +students[0]);
//        System.out.println("학생 2의 점수 :" +students[1]);
//        System.out.println("학생 3의 점수 :" +students[2]);
//        System.out.println("학생 4의 점수 :" +students[3]);
//        System.out.println("학생 5의 점수 :" +students[4]);
    }
}
