package operator;

public class operator2 {
    public static void main(String[] args) {

        //문자열과 문자열 더하기1
        String result1 = "hello" + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        //자바에서 문자와 숫자를 더하면 숫자를 문자로 바꾸고 더한다


        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
        //자바의 문자열인 String타입에 다른 타입을 더하는경우 다른 타입을 문자열로 변경 한다.고로  문자열에 더하는 것은 전부 문자열이 된다




    }
}
