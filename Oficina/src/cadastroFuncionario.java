import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cadastroFuncionario extends JFrame implements ActionListener {

	private String url = "jdbc:mysql://127.0.0.1:3306/Oficina?useSSL=false",
			usuario = "root",
			senha = "85002062";
	
	private Connection conexao;
	private Statement stm;
	
	private JButton btnsalvar = new JButton("Cadastrar"),                                    					
					btncancelar = new JButton("Cancelar");  
	
	private JTextField txtnome = new JTextField(),
					   txtfone = new JTextField(),
					   txtcpf = new JTextField(),
					   txtrua = new JTextField(),
					   txtbairro = new JTextField(),
					   txtcep = new JTextField(),
					   txtcidade = new JTextField(),
					   txtnum = new JTextField();
	
	private JLabel lblnome = new JLabel("Nome:"),
			lblfone = new JLabel("Número de Telefone:"),
			lblcpf = new JLabel("Número de CPF:"),
			lblrua = new JLabel("Rua:"),
			lblbairro = new JLabel("Bairro:"),
			lblcep = new JLabel("CEP:"),
			lblcidade = new JLabel("Cidade:"),
			lblnum = new JLabel("Número"),
			lblcf = new JLabel("Cadastro de Funcionário"),
			icon = new JLabel(new ImageIcon("icon.png"));

	
	private JPanel lado1 = new JPanel(),
			       princ = new JPanel(),
			       lado2 = new JPanel(),
			       lado3 = new JPanel(),
			       endereco = new JPanel(),
			       dados = new JPanel(),
				   center = new JPanel(),
			       botoes = new JPanel();
	
	
	public cadastroFuncionario(){
		setTitle("CADASTRO DE FUNCIOÁRIO");
		dados.setLayout(new GridLayout(6, 1));
		dados.add(lblnome);
		dados.add(txtnome);
		dados.add(lblfone);
		dados.add(txtfone);
		dados.add(lblcpf);
		dados.add(txtcpf);
		endereco.setLayout(new GridLayout(10, 1));
		endereco.add(lblrua);
		endereco.add(txtrua);
		endereco.add(lblbairro);
		endereco.add(txtbairro);
		endereco.add(lblcep);
		endereco.add(txtcep);
		endereco.add(lblcidade);
		endereco.add(txtcidade);
		endereco.add(lblnum);
		endereco.add(txtnum);
		princ.setLayout(new GridLayout(1, 2, 20, 20));
		princ.add(dados);
		princ.add(endereco);
		botoes.add(btncancelar);
		botoes.add(btnsalvar);
		txtnome.setBorder(null);
		txtfone.setBorder(null);
		txtcpf.setBorder(null);
		txtrua.setBorder(null);
		txtbairro.setBorder(null);
		txtcidade.setBorder(null);
		txtnum.setBorder(null);
		txtcep.setBorder(null);
		lado1.setLayout(new FlowLayout(3));
		lado1.setBackground(new Color(28, 28, 28));
		lado1.add(icon);
		lado1.add(lblcf);
		btncancelar.setForeground(new Color(255, 99, 71));
		btnsalvar.setForeground(new Color(60, 179, 113));
		btncancelar.setBackground(Color.black);
		btnsalvar.setBackground(Color.black);
		lblcf.setFont(new Font("Century Gothic",Font.BOLD,27));
		lblcf.setForeground(Color.WHITE);
		lblcf.setLayout(new FlowLayout(1));
		this.add(princ, BorderLayout.CENTER);
		this.add(lado1, BorderLayout.NORTH);
		this.add(lado2, BorderLayout.WEST);
		this.add(lado3, BorderLayout.EAST);
		this.add(botoes, BorderLayout.SOUTH);		
		this.setBounds(300,125,700,500);
		
	}
	
	public static void main(String[]args){
		cadastroFuncionario cf = new cadastroFuncionario();
		cf.setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
			
	

}