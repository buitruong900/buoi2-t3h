import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        double a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so a :");
        a=scanner.nextInt();
        a=Math.pow(a,8);
        System.out.println("a="+a);
    }
}
