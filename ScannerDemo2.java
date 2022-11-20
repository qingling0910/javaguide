//使用Scanner计算两数之和
import java.util.Scanner;
public class ScannerDemo2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int num_1 = sc.nextInt();

        System.out.println("请输入第二个整数");
        int num_2 = sc.nextInt();

        System.out.println(num_1 + num_2);
    }
    
}
