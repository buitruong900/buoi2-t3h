import java.util.Scanner;

public class GPT {
    public static void main(String[] args) {
        GPT();
    }

    private static void GPT(){
        Double a,b,x;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a :");
        a=scanner.nextDouble();
        System.out.println("Nhap b :");
        b=scanner.nextDouble();
        x=-b/a;
        if (a==0 & b==0){
            System.out.println("phuong trinh co vo so nghiem");
        }else if(a==0 & b<0){
            System.out.println("phuong trinh vo nghiem");
        }else if(a==0 & b>0){
            System.out.println("phuong trinh vo nghiem");
        }
        else {
            System.out.println("phuong trinh co nghiem duy nhat x="+x);
        }
    }
}
