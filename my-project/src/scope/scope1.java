package scope;

public class scope1 {
    public static void main(String[] args) {
        int m = 10;//m 생존 시작
        if(true) {
            int x = 20; //x 생존시작
            System.out.println("if m = " +  m);
            System.out.println("if x =" + x);
        } //x는 생존종료
        System.out.println("if m = " +  m);
//        System.out.println("if x =" + x);
    } //m은 생존종료
}
