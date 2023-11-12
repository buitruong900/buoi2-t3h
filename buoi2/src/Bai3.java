import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Que quan vua nhap la :"+ country("").equals(""));
    }
    static String country(String name){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi b nhap ten quê quán :");
        name=scanner.next();

        return name;
    }
}
