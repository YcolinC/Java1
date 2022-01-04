import com.sun.org.apache.xpath.internal.objects.XNumber;

/**
 * @Author LinYu
 * @Date 2021/11/20
 */
public class Student {
    private int number;
    private String name;

    public Student() {

    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;

    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student st = new Student(123,"234");
        st.setName("123");
        st.setNumber(234);
        System.out.println(st.getName());
        System.out.println(st.getNumber());
    }
}
