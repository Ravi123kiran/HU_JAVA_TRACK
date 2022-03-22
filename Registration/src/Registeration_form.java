import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registeration_form {

    public class RegistrationForm implements ActionListener {
        JFrame frame;

        JTextField UsernameTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JPasswordField confirmPasswordField = new JPasswordField();
        JButton registerButton = new JButton("REGISTER");


        RegistrationForm() {
            //Calling methods from constructor
            createWindow();
            setLocationAndSize();
            addComponentsToFrame();
        }

        public void createWindow() {
            frame = new JFrame();
            frame.setTitle("Registration Form");
            frame.setBounds(40, 40, 380, 600);
            frame.getContentPane().setBackground(Color.pink);
            frame.getContentPane().setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
        }

        public void setLocationAndSize() {

            UsernameTextField.setBounds(180, 43, 165, 23);
            passwordField.setBounds(180, 193, 165, 23);
            confirmPasswordField.setBounds(180, 243, 165, 23);
            registerButton.setBounds(70, 400, 100, 35);

        }

        public void addComponentsToFrame() {
            //Adding components to Frame

            frame.add(UsernameTextField);
            frame.add(passwordField);
            frame.add(confirmPasswordField);
            frame.add(registerButton);

        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }


    }
}
