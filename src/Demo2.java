import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        System.out.println("斐波那契数列总和：" + num(number));
    }

    public static int num(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return (num(a - 1) + num(a - 2));
        }
    }
}