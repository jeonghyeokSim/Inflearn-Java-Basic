package method;

public class OverLoading2 {
    public static void main(String[] args) {
        mtMethod(1,1.2);
        myMethod(1.2,1);
    }
    public static void mtMethod(int a, double b) {
        System.out.println("int a,double b");
    }
    public static void myMethod(double a, int b){
        System.out.println("double a, int b");
    }
}
