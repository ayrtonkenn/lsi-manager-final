package CadastrarUsuario;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;


public class LoginUsuario extends JFrame implements ActionListener  {
	
	protected static JTextField jtNome = new JTextField(15);
	protected static JTextField jtEmail = new JTextField(15);
	protected static JTextField jtCod = new JTextField(15);
	
	private static String [] tipo = {"Professor","Aluno"};
	
	@SuppressWarnings("unchecked")
	protected static JComboBox jcTipo = new JComboBox(tipo);
	
	protected static JButton jbSalvar = new JButton("Salvar");
	protected static JButton jbNovo = new JButton("Novo");
	
	private JLabel jlNome = new JLabel("Nome");
	private JLabel jlEmail = new JLabel("Email");
	private JLabel jlTipo = new JLabel("Tipo");
	private JLabel jlCod = new JLabel("Codigo");
	


	public LoginUsuario(){
		
		super("Cadastro e consulta");	
		setLayout(new GridLayout (6,1));
		
		add(jlCod);
		add(jtCod);
		add(jlNome);
		add(jtNome);
		add(jlTipo);
		add(jcTipo);
		add(jbNovo);
		add(jbSalvar);
		pack();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		((AbstractButton) jbSalvar).addActionListener(this);
		((AbstractButton) jbNovo).addActionListener(this);
		jtCod.addActionListener(this);
		
		
		jtNome.setEnabled(false);
		jtEmail.setEnabled(false);
		jcTipo.setEnabled(false);
		jbSalvar.setEnabled(false);
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbNovo) {
			jtNome.setEnabled(true);
			jtEmail.setEnabled(true);
			jcTipo.setEnabled(true);
			jbSalvar.setEnabled(true);
			jtCod.setEnabled(false);
			jtCod.setText("AUTOMATICO");
			jtNome.requestFocus();
			jbNovo.setEnabled(false);
		}

		if (e.getSource() == jbSalvar) {
			boolean Prosseguir = false;
			Usuario usuario = new Usuario();
			usuario.setNome(jtNome.getText());
			usuario.setTipo(jcTipo.getSelectedItem().toString());
			usuario.setEmail(jtEmail.getText());
			

			if (Prosseguir) {
				usuario.cadastrarCliente();
				JOptionPane.showMessageDialog(null, "Cliente cadastrado");
				jtNome.setText("");
				jtEmail.setText("");
				jtCod.setText("");

				jtNome.setEnabled(false);
				jtEmail.setEnabled(false);
				jcTipo.setEnabled(false);
				jbSalvar.setEnabled(false);
				jbNovo.setEnabled(false);
				jtCod.setEnabled(false);
				

			}
		}
		if (e.getSource() == jtCod) {
			int cod = 0;
			boolean p = false;
			try {
				cod = Integer.parseInt(jtCod.getText());
				p = true;
			} catch (Exception f) {
				JOptionPane.showMessageDialog(null, "Verifique a senha");
			}
			if (p) {
				Usuario v = Usuario.pegaClientePelaSenha(cod);
				if (v != null) {
					jtNome.setText(v.getNome());
					jtEmail.setText(v.getNome());
					jtCod.setText(v.getNome());
				} else {
					JOptionPane.showMessageDialog(null, "Senha n encontrada");

				}
			}
		}



	}}