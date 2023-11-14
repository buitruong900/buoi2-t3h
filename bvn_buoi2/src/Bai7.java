import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao số nguyên n:");
        n=scanner.nextInt();
        if(n%2==0){
            System.out.println("Đây là số chẵn");
        }else {
            System.out.println("Đây là số lẻ");
        }
    }
}
