import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Math();
    }
    private static void Math(){
        int a,soDu;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a :");
        a=scanner.nextInt();
        soDu=a%2;
        System.out.println("So Dư ="+soDu);
    }
}
