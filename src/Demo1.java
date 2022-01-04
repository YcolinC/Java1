import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入数字：");
        int sum = sc.nextInt();
        System.out.print("请输入运算符：");
        String operator = sc.next();
        System.out.print("请输入第二个数：");
        int sum1 = sc.nextInt();
        int result = 0;
        switch (operator) {
            case "+":
                System.out.println(result = sum + sum1);
                break;
            case "-":
                System.out.println(result = sum - sum1);
                break;
            case "*":
                System.out.println(result = sum * sum1);
                break;
            case "/":
                System.out.println(result = sum / sum1);
                break;
            case "%":
                System.out.println(result = sum % sum1);
                break;
            default:
                System.out.println("输入错误！");
        }
        System.out.println(+sum + operator + sum1 + "=" + result);
    }
}
