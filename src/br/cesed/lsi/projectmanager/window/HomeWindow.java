package br.cesed.lsi.projectmanager.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.cesed.lsi.projectmanager.Projeto;
import javax.swing.JTextField;

public class HomeWindow {

	private JFrame frmTeste;
	private JTextField lblLogin_1;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeWindow window = new HomeWindow();
					window.frmTeste.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTeste = new JFrame();
		frmTeste.setTitle("Teste");
		frmTeste.setBounds(100, 100, 450, 300);
		frmTeste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnTeste = new JButton("Teste");
		btnTeste.setBounds(141, 198, 148, 23);
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Projeto name = new Projeto();
				System.out.println("acionado");
			}
		});
		frmTeste.getContentPane().setLayout(null);
		frmTeste.getContentPane().add(btnTeste);
		
		JLabel lblNewLabel = new JLabel("Clique aqui que aparece algo");
		lblNewLabel.setBounds(121, 37, 180, 75);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmTeste.getContentPane().add(lblNewLabel);
		
		lblLogin_1 = new JTextField();
		lblLogin_1.setBounds(203, 107, 86, 20);
		frmTeste.getContentPane().add(lblLogin_1);
		lblLogin_1.setColumns(10);
		
		JLabel label = new JLabel("Login");
		label.setBounds(131, 110, 46, 17);
		frmTeste.getContentPane().add(label);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(131, 135, 46, 14);
		frmTeste.getContentPane().add(lblSenha);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(203, 132, 86, 20);
		frmTeste.getContentPane().add(textField_1);
	}
}
