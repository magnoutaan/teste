package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	public Layout() {
		getContentPane().add(new JButton("Bot�o centralizado"));
		getContentPane().add(new JButton("Bot�o centralizado2"));
		getContentPane().add(new JButton("Bot�o centralizado3"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Layout();
	}

}
