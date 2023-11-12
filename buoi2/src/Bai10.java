import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap a:");
        a=scanner.nextInt();
        System.out.println("nhap b:");
        b=scanner.nextInt();
        if (a==100 || b==50){
            System.out.println("la so chẵn");
        }else {
            System.out.println("so khong hop le");
        }
    }
}
