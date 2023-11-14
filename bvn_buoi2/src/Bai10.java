import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int a,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so co 4 chu so :");
        a=scanner.nextInt();
        if (a<999){
            System.out.println("Số không hợp lệ");
        }
        c=(a%1000)%100/10;//9876%1000=876%100=76/10
        System.out.printf("Số %d có chữ số hàng chục là: %d",a,c);
    }
}
