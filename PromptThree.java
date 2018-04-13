import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromptThree extends JFrame {
    private JTextField inputText = new JTextField();
    private JButton verifyBtn = new JButton();
    private JButton closeBtn = new JButton();
    
    public PromptThree() {
        super();
        this.setTitle("PromptThree");
        this.getContentPane().setLayout(null);
        this.setBounds(300, 300, 280, 300);
        this.add(makeInputArea());
        this.add(makeVerifyBtn());
        this.add(makeCloseBtn());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //listeners
    private ActionListener fieldListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            //ignore
        }
    };
    
    private ActionListener verifyListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String fieldText = inputText.getText();
            //code: test if fieldText is an integer
            JOptionPane.showMessageDialog(verifyBtn, "OK");
        }
    };
    
    private ActionListener exitListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
    
    //widgets
    private JTextField makeInputArea() {
        inputText.setBounds(80, 40, 100, 30);
        inputText.addActionListener(fieldListener);
        return inputText;
    }
    
    private JButton makeVerifyBtn() {
        verifyBtn.setText("Verify");
        verifyBtn.setBounds(80, 80, 100, 30);
        verifyBtn.addActionListener(verifyListener);
        return verifyBtn;
    }
    
    private JButton makeCloseBtn() {
        closeBtn.setText("Close");
        closeBtn.setBounds(80, 120, 100, 30);
        closeBtn.addActionListener(exitListener);
        return closeBtn;
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeAndWait(() -> new PromptThree());
    }
}