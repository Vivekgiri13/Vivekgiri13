 public class lab_5dOOAD extends JFrame implements ActionListener

 {
 JPanel panel;
 JLabel user_label, password_label, message;
 JTextField userName_text;
 JPasswordField password_text;
 JButton submit, cancel;
 lab_5dOOAD()
 {
 user_label = new JLabel();
 user_label.setText("User Name :");
 userName_text = new JTextField();
 password_label = new JLabel();
 password_label.setText("Password :");
 password_text = new JPasswordField();
 submit = new JButton("SUBMIT");
 panel = new JPanel(new GridLayout(3, 1));
 panel.add(user_label);
 panel.add(userName_text);
 panel.add(password_label);
 panel.add(password_text);
 message = new JLabel();
 panel.add(message);
 panel.add(submit);

 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 submit.addActionListener(this);
 add(panel, BorderLayout.CENTER);
 setTitle("Please Login Here !");
 setSize(300,300);

 setVisible(true);
 }
 public static void main(String[] args)
 {
 new lab_5dOOAD();
 }
 public void actionPerformed(ActionEvent ae)
 {
 String userName = userName_text.getText();
 String password = password_text.getText();
 if (userName.trim().equals("Vivek") && password.trim().equals("v@13"))
 {
 message.setText(" Hello " + userName + "");
 }
 else if (userName.trim().equals("Vivek") && password.trim().equals("v@13"))

 {
 message.setText(" Hello, " + userName + "");
 }
 else
 {
 message.setText(" Invalid user.. ");
 }
 }
}
