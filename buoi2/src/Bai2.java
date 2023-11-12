import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        String ho;
        String name;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ho :");
        ho=scanner.next();
        System.out.println("Nhap name :");
        name=scanner.next();
        System.out.printf("ho ten vua nhap la :"+ho+name);
    }
}
