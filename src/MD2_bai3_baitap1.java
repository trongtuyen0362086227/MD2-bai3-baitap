import java.util.Scanner;

public class MD2_bai3_baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, c;
        System.out.println("nhap chieu dai mang");
        num = scanner.nextInt();
        int[] number = new int[num];
        System.out.println("nhap phan tu cua mang");
//        System.out.println("phan tu cua mang truoc luc xoa \n");
        for (int i = 0; i < num; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu can xoa vao");
        int X = scanner.nextInt();
        System.out.println("phan tu cua mang sau khi xoa");
        int cnt = 0;
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (number[i] == X) {
            cnt++;
            }
        }
        int[] newNumber = new int[num-cnt];
        for (int i = 0; i < num; i++) {
            if (number[i] == X){
                continue;
            } else {
                newNumber[index]=number[i];
                index++;
            }
        }
        for (int i = 0; i < num-1; i++) {
            System.out.printf("%d",newNumber[i]);
        }
    }
}
