package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다");
        printfooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        return;
    }

    public static void printfooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
