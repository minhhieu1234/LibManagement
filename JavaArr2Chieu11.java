import java.util.Scanner;

public class JavaArr2Chieu11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = mangHaiChieu(m,n);
        hienThiMang(arr);
    }
    private static int[][] mangHaiChieu(int m, int n){
        int[][] arr = new int[m][n];
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                arr[i][j] = (i+j)%2;
            }
        }
        return arr;
    }
    private static void hienThiMang(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
