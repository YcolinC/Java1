import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        for (int j = 2; j <= 1000; j++) {
            int sum = 0;
            for (int i = 1; i < j; i++) {
                if (j % i == 0) {
                    sum += i;
                }
            }
            if (j == sum) {
                System.out.println(j);
            }
            sum = 0;
        }
    }
}




