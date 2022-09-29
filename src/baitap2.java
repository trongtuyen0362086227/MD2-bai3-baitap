import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, c;
        System.out.println("nhap chieu dai mang");
        num = scanner.nextInt();
        int[] number = new int[num];
        System.out.println("nhap phan tu cua mang");
        for (int i = 0; i < num; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("nhap phan tu can  them");
        int X = scanner.nextInt();
        System.out.println("nhap vi tri can  them");
        int index = scanner.nextInt();
        System.out.println("phan tu cua mang sau khi them");
        int[] newNumber = new int[num+1];
        for (int i = 0; i < num+1; i++) {
            if (i<index){
                newNumber[i]=number[i];
            } else if (i==index){
                newNumber[index]=X;
            } else {
                newNumber[i]=number[i-1];
            }
        }
        for (int i = 0; i < num+1; i++) {
            System.out.printf("%d",newNumber[i]);
        }
    }
}
