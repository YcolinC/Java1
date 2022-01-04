/**
 * @Author LinYu
 * @Date 2021/11/21
 */
public class Text01 {
    public static void method1(){
        //调用doSome(有static关键字，调用方式是类名.）
        //完整方式调用
        Text01.doSome();
        //省略方式调用
        doSome();

        //调用doOther(无static关键字，调用方式是引用. (先创建对象))
        //完整方式调用
        Text01 t = new Text01();
        t.doOther();
        //省略方式调用

        //访问i
        //完整访问方式
        System.out.println(t.i);
        //省略访问方式
    }

    public void method2(){
        //调用doSome
        //完整方式调用
        Text01.doSome();
        //省略方式调用
        doSome();

        //调用doOther
        //完整方式调用
        Text01 t = new Text01();
        t.doOther();
        //省略方式调用

        //访问i
        //完整访问方式
        System.out.println(t.i);
        //省略访问方式
    }

    public static void doSome(){
        System.out.println("do some!");
    }

    public void doOther(){
        System.out.println("do other");
    }

    public static void main(String[] args) {
        //编写程序调用method1
        //完整方式调用
        Text01.method1();
        //省略方式调用
        method1();

        //编写程序调用method2
        //完整方式调用
        Text01 t = new Text01();
        t.method2();
        //省略方式调用
    }

    int i = 10;
}
