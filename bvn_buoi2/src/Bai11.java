import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        double a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so thuc a:");
        a=scanner.nextDouble();
        System.out.println("Nhap so thuc b :");
        b=scanner.nextDouble();
        double numberOne= a - (int) a;
        double numberTwo=b -(int) b;
        System.out.println("Phan sau dau phay cua "+a+"la :"+numberOne);
        System.out.println("Phan sau dau phay cua "+b+"la :"+numberTwo);
    }

}
