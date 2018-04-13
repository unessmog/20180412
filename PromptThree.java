import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromptThree extends JFrame {
    private JTextField inputText = new JTextField();
    private JButton verifyBtn = new JButton();
    private JButton cancelBtn = new JButton();
    
    public PromptThree() {
        super();
        this.setTitle("PromptThree");
        this.getContentPane().setLayout(null);
        this.setBounds(300, 300, 280, 300);
        this.add(makeInputArea());
        this.add(makeVerifyBtn());
        this.add(makeCancelBtn());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    //listeners
    private ActionListener fieldListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String text = inputText.getText();
            text = text + "\n";
            inputText.selectAll();
        }
    };
    
    private ActionListener verifyListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(verifyBtn, "OK");
        }
    };
    
    private ActionListener cancelListener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showConfirmDialog(cancelBtn, "closing");
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
    
    private JButton makeCancelBtn() {
        cancelBtn.setText("Cancel");
        cancelBtn.setBounds(80, 120, 100, 30);
        cancelBtn.addActionListener(cancelListener);
        return cancelBtn;
    }
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeAndWait(() -> new PromptThree());
    }
}