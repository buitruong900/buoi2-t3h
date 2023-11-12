import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo2 {
    static int number;
    static String name="hello";
    static String[] myClass={"2","hello","3"};
    static Double[] numbers={4.2,1.23};
    public static void main(String[] args) {
        int number=1;
        System.out.println(number);
        System.out.println(Demo2.number);//tham chiếu biến + tên class.tên biến
// vd kiểu khác, array, string
        System.out.println(name);//null hoặc rỗng
        System.out.println(Arrays.toString(myClass));//rỗng
        System.out.println(Arrays.toString(numbers));//rỗng
    }
}
