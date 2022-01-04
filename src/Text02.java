/**
 * @Author LinYu
 * @Date 2021/11/21
 */
public class Text02 {
    String name;
    String number;
    static  String country = "中国";// 静态代码

    public Text02(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public static void main(String[] args) {

        Text02 t02 = new Text02("zhangsan", "123");
        System.out.println("他的名字是：" + t02.name + "," + "身份证号是：" + t02.number + "," + "国籍是：" + Text02.country);
    }
}
