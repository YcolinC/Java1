import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字a:");
        int num = sc.nextInt();
        System.out.print("请输入数字n：");
        int b = sc.nextInt();
        int s = 1;
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= b; i++) {
            sum = sum + num * s;
            s = s * 10;
            sum2 += sum;
        }
        System.out.println(sum2);
    }
}
