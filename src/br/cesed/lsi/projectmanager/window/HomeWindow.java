package br.cesed.lsi.projectmanager.window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class HomeWindow {

	private JFrame frmTeste;

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
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmTeste.getContentPane().setLayout(new BorderLayout(0, 0));
		frmTeste.getContentPane().add(btnTeste, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Clique aqui que aparece algo");
		frmTeste.getContentPane().add(lblNewLabel, BorderLayout.EAST);
	}

}
