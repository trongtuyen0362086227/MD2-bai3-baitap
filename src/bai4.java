import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so hang");
        int a = scanner.nextInt();
        System.out.println("nhap so cot");
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("nhap phan tu mang 2 chieu");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j]= scanner.nextInt();
            }
        }
        System.out.println("max cua mang 2 chieu la");
        int max= arr[0][0];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.printf("%d",max);
    }
}
