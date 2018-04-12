import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromptThree extends JFrame {
    private JButton inputBtn = new JButton();
    private JButton verifyBtn = new JButton();
    private JButton cancelBtn = new JButton();
    
    public PromptThree() {
        super();
        this.setTitle("PromptThree");
		this.getContentPane().setLayout(null);
        this.add(makeInputArea());
        this.add(makeVerifyBtn());
        this.add(makeCancelBtn());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private JButton makeInputArea() {
		inputBtn.setBounds(40, 40, 100, 30);
		inputBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(inputBtn, "input an integer");
			}
		});
		return inputBtn;
	}
    
    private JButton makeVerifyBtn() {
		verifyBtn.setText("Verify");
		verifyBtn.setBounds(40, 40, 100, 30);
		verifyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(verifyBtn, "OK");
			}
		});
		return verifyBtn;
	}
    
    private JButton makeCancelBtn() {
		cancelBtn.setText("Click me!");
		cancelBtn.setBounds(40, 40, 100, 30);
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(cancelBtn, "Hello World!");
			}
		});
		return cancelBtn;
	}
    
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeAndWait(() -> new PromptThree());
    }
}