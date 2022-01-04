import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        System.out.print(sum + "=");
        int a = 2;
        while (a <= sum) {
            if (sum == a) {
                System.out.print(a);
                break;
            } else if (sum % a == 0) {
                System.out.print(a + "*");
                sum = sum / a;
            } else {
                a++;
            }
        }
    }
}
