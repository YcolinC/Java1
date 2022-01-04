/**
 * @Author LinYu
 * @Date 2021/11/21
 */
public class Text03 {
    private int id;

    public Text03() {
    }

    public Text03(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        final Text03 t03 = new Text03();
        //t03 = new Text03();
        //final修饰的引用，不能指向其他的对象，
        t03.id = 320;
        System.out.println(t03.id);
        t03.setId(10);
        System.out.println(t03.getId());
    }
}
