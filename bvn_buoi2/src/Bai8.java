import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n,dem=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi vao nhap so n :");
        n=scanner.nextInt();
        if(n<=1){
            System.out.println("Số n vừa nhập không phải là số nguyên tố");
        }
        for (int i=1;i<=n;i++){
            if (n % i==0){
                dem++;
            }
        }
        if (dem==2){
            System.out.println("Đây là số nguyên tố :"+n);
        }else {
            System.out.println("Đây không phải là số nguyên tố :"+n);
        }
    }
}
