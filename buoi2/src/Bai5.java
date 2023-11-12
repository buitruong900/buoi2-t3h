import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int a,b,dt,cv;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a =");
        a=scanner.nextInt();
        System.out.println("Nhap b=");
        b=scanner.nextInt();
        dt=a*b;
        System.out.println("Dien tich ="+dt);
        cv=(a+b)*2;
        System.out.println("Chu vi="+cv);
    }
}
