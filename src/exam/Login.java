package exam;

import javax.swing.*;

/**
 * @Author LinYu
 * @Date 2022/1/3
 */
public class Login extends JFrame {
    public Login() {
        Init();
    }

    private void Init() {
        JLabel lbTitle = new JLabel("用户登陆");
        lbTitle.setBounds(170,58,60,24);
        this.add(lbTitle);

        JLabel lbUser = new JLabel("用户名：");
        lbUser.setBounds(20,92,60,24);
        this.add(lbUser);
        JTextField txtUser = new JTextField();
        txtUser.setBounds(80,92,280,24);
        this.add(txtUser);

        JLabel lbPwd = new JLabel("密码：");
        lbPwd.setBounds(20,126,60,24);
        this.add(lbPwd);
        JTextField txtPWd = new JTextField();
        txtPWd.setBounds(80,126,280,24);
        this.add(txtPWd);

        JButton btnOk = new JButton("登 陆");
        btnOk.setBounds(100,160,80,24);
        this.add(btnOk);

        JButton btnCancel = new JButton("取 消");
        btnCancel.setBounds(200,160,80,24);
        this.add(btnCancel);

        this.setLayout(null);
        this.setTitle("登陆界面");
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame jFrame = new Login();
                jFrame.setVisible(true);
            }
        });
    }
}
