import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap so a :");
        a=scanner.nextInt();
        if (a%2==0){
            System.out.println("La so chan");
        }else {
            System.out.println("La so le");
        }
    }
}
