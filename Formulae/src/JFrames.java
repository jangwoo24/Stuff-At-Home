import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrames {
	JFrame window;
	JPanel panel;
	JTextField jtf;
	JButton button;
	public static void main(String[] args) {
		JFrames JF = new JFrames();
	}
	JFrames() {
		window = new JFrame();
		window.setVisible(true);
		window.setSize(200, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		jtf = new JTextField();
		jtf.setText("Type here");
		panel.add(jtf);
		button = new JButton("Press here");
		panel.add(button);
		button.setBounds(100, 100, 15, 5);
		window.add(panel);
	}
}
