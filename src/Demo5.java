public class Demo5 {
    Student student;
    Computer computer;
    //定义一个学生类
   public static class Student {
        String name;
        int number;
        String com;
    }
    //定义一个电脑类
    public static class Computer {
        String model;//型号
        String brand;//品牌
        String color;
    }

    public static void main(String[] args) {
        //创建一个电脑的对象
        Computer co = new Computer();
        //给电脑的属性赋值
        co.model = "";
        co.brand = "荣耀Magic";
        co.color = "blue";
        //创建一个学生的对象
        Student student1 = new Student();
        //给学生的属性赋值
        student1.name = "小林";
        student1.number = 123;
        student1.com = co.brand;
        //小林的笔记本是什么品牌
        System.out.println(student1.com);

    }
}
