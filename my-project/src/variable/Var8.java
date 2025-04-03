package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte x = 127; //-128~127
        //byte 타입을 직접 선언하고 여기에 숫자를 적는일은 거의없다
        //대신의 파일을 바이트 단위로 다루기 떄문 파일 전송, 복사등에 사용된다.
        short y = 32767; //-32768~32767
        int i = 2147483647; //  약 20억 *주로 사용
        long l = 9223372036854775807L;// 20억이 넘으면 사용


        //실수

        float f = 10.0f;
        double d = 10.0;//더블이 좀더 큰 숫자 범위 플룻보다는 주로 더블 사용

        boolean g = true; //조건문에서 자주사용
        String n = "ABCDE"; /*문자를 다룰떄는 문자 하나든 문자열이든 모두
        스트링 사용이 편하다*/






    }
}
