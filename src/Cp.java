import java.util.Scanner;

public class Cp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int random = (int) (Math.random() * 90 + 10);
        System.out.println(random);
        System.out.println("请输入一个两位数：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a1 = a / 10;
        int a2 = a % 10;
        int random1 = random / 10;
        int random2 = random % 10;
        if (a == random) {
            System.out.println("恭喜中奖10000美金");
        } else if (a1 == random2 && a2 == random1) {
            System.out.println("恭喜中奖3000美金");
        } else if (a1 == random1 || a2 == random2) {
            System.out.println("恭喜中奖1000美金");
        } else if (a1 == random2 || a2 == random1) {
            System.out.println("恭喜中奖500美金");
        } else {
            System.out.println("彩票作废");
        }
        if( a >=100 || a <= 9 )
            System.out.println("彩票作废");
    }
}