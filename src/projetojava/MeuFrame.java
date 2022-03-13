package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame{
//criar um public MeuFrame
	public MeuFrame() {
		//instancia a classe
		JButton botao = new JButton("Clique"); 
		JButton botao1 = new JButton("Clique"); 
		//definir os valores 
		setLayout(null);
		botao.setBounds(100,60, 100, 100);
		botao1.setBounds(100,200, 100, 100);
		getContentPane().add(botao);
		getContentPane().add(botao1);
		setTitle("SGA_ALLAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MeuFrame();
	}

}
