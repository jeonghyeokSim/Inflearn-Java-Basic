package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        //2x3 2차원 배열을 만든다.
        int[][] arr = new int[3][4];
        int i =1;
        for (int row = 0;row <arr.length;row++) {
            for (int column =0;column<arr[row].length;column++) {
                arr[row][column] = i++;
            }
        }


        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();

        }

//        //0열 출력
//        System.out.print(arr[0][0] + " ");//0열 출력
//        System.out.print(arr[0][1] + " ");//0열 출력
//        System.out.print(arr[0][2] + " ");//0열 출력
//        System.out.println();//한 행이 끝나면 라인을 변경한다.
//
//        //1열 출력
//        System.out.print(arr [1][0] + " ");//1열 출력
//        System.out.print(arr [1][1] + " ");//1열 출력
//        System.out.print(arr [1][2] + " ");//1열 출력

    }
}
