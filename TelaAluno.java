package Aluno;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import CadastrarUsuario.Usuario;


@SuppressWarnings("serial")
public class TelaAluno extends JFrame implements ActionListener  {
	
	protected static JTextField jtNome = new JTextField(15);
	protected static JTextField jtCurso = new JTextField(15);
	
	private static String [] professor = {"Adriano","Bruno","Jemerson","Evertom"};
	private static int[] mes = {1,2,3,4,5,6,7,8,9,10,11,12};
	private static int[] dia = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
	private static int[] hora = {8,9,10,11,12,13,14,15,16,17,18,19,20,21};
	
	@SuppressWarnings("unchecked")
	protected static JComboBox jcProfessor = new JComboBox(professor);
	@SuppressWarnings("unchecked")
	//protected static JComboBox jcMes = new JComboBox(mes);
	//@SuppressWarnings("unchecked")
	//protected static JComboBox jcDia = new JComboBox(dia);
	//protected static JComboBox jcHora = new JComboBox(hora);
	
	protected static JButton jbSalvar = new JButton("Salvar");
	
	
	private JLabel jlNome = new JLabel("Nome");
	private JLabel jlCurso = new JLabel("Curso");
	private JLabel jlProfessor = new JLabel("Professor");
	private JLabel jlop1 = new JLabel("Escolher Horário:");
	private JLabel jlMes = new JLabel("Mês");
	private JLabel jlDia = new JLabel("Dia");
	private JLabel jlHora = new JLabel("Horario");

	
     public TelaAluno(){
		
		super("TCC");	
		setLayout(new GridLayout (11,1));
		

		add(jlNome);
		add(jtNome);
		add(jlCurso);
		add(jtCurso);
        add(jlProfessor);
        add(jcProfessor);
		add(jlop1);
		add(jlMes);
		//add(jcMes);
		add(jlDia);
		//add(jcDia);
		add(jlHora);
		add(jbSalvar);
		pack();
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		((AbstractButton) jbSalvar).addActionListener(this);
		
		
		
		jtNome.setEnabled(false);
		jtCurso.setEnabled(false);
		jlDia.setEnabled(false);
		jlMes.setEnabled(false);
		jbSalvar.setEnabled(false);
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		

		if (e.getSource() == jbSalvar) {
			boolean Prosseguir = false;
			Usuario usuario = new Usuario();
			usuario.setNome(jtNome.getText());
			usuario.setCurso(jtCurso.getText());
			
			  if(Prosseguir == false) {
				  Prosseguir = true;
			  }else {
				  JOptionPane.showMessageDialog(null, "Verifique");
			   }
			
			if (Prosseguir) {
				try {
					Aluno.cadastrarTcc();
					JOptionPane.showMessageDialog(null, "Horario marcado");
					System.out.println(1);
					jtNome.setText("");
					jtCurso.setText("");

					jtNome.setEnabled(false);
					jtCurso.setEnabled(false);
					jbSalvar.setEnabled(false);
				} catch(Exception em) {
					JOptionPane.showMessageDialog(null, "Verifique o horario");
				}

			}
		
		}
		
	}

}
