import java.awt.*;
import javax.swing.*;

public class AuthGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}

class LoginFrame extends JFrame {
    LoginFrame() {
        setTitle("Login");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        JLabel titleLabel = new JLabel("LOGIN");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(50, 50, 50));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);
        
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(emailLabel, gbc);
        
        JTextField emailField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(emailField, gbc);
        
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(passwordLabel, gbc);
        
        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);
        
        JButton loginButton = createStyledButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(loginButton, gbc);
        
        JButton signupButton = createStyledButton("Sign Up");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(signupButton, gbc);
        
        loginButton.addActionListener(event -> 
            System.out.println("Login clicked: " + emailField.getText())
        );
        
        signupButton.addActionListener(event -> {
            dispose();
            System.err.println("Sign Up clickeddddd");  
            SwingUtilities.invokeLater(SignupFrame::new);
        });
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(100, 150, 255));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}

class SignupFrame extends JFrame {
    SignupFrame() {
        setTitle("Sign Up");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(245, 245, 245));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        JLabel titleLabel = new JLabel("SIGN UP");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(titleLabel, gbc);
        
        JLabel nameLabel = new JLabel("Full Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nameLabel, gbc);
        
        JTextField nameField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(nameField, gbc);
        
        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(emailLabel, gbc);
        
        JTextField emailField = new JTextField(15);
        gbc.gridx = 1;
        panel.add(emailField, gbc);
        
        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(passwordLabel, gbc);
        
        JPasswordField passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        panel.add(passwordField, gbc);
        
        JButton signupButton = createStyledButton("Sign Up");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(signupButton, gbc);
        
        JButton loginButton = createStyledButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 5;
        panel.add(loginButton, gbc);
        
        signupButton.addActionListener(event -> 
            System.out.println("Signup clicked: " + nameField.getText())
        );
        
        loginButton.addActionListener(event -> {
            System.out.println("Login clickedd");
            dispose();
            SwingUtilities.invokeLater(LoginFrame::new);
        });
        
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }
    
    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFocusPainted(false);
        button.setBackground(new Color(100, 150, 255));
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        return button;
    }
}
