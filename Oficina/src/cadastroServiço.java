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
	
public class cadastroServiço extends JFrame implements ActionListener {

		private String url = "jdbc:mysql://127.0.0.1:3306/Oficina?useSSL=false",
				usuario = "root",
				senha = "85002062";
		
		private Connection conexao;
		private Statement stm;
		
		private JButton btnsalvar = new JButton("Cadastrar"),                                    					
						btncancelar = new JButton("Cancelar");
		
		private JTextField txtnomeservico = new JTextField(),
						   txtvalor = new JTextField();
		
		private JLabel lblnomeservico = new JLabel("Nome do Serviço:"),
					   lblvalor = new JLabel("Valor do Serviço:"),
					   lblcs = new JLabel("Cadastro de Serviço"),
					   icon = new JLabel(new ImageIcon("icon.png"));
		
		private JPanel lado1 = new JPanel(),
			       princ = new JPanel(),
			       lado2 = new JPanel(),
			       lado3 = new JPanel(),	
			       dados = new JPanel(),
				   center = new JPanel(),
			       botoes = new JPanel();
				
		public cadastroServiço() {
			setTitle("CADASTRO DE SERVIÇO");
			dados.setLayout(new GridLayout(6, 1));
			dados.add(lblnomeservico);
			dados.add(txtnomeservico);
			dados.add(lblvalor);
			dados.add(txtvalor);
			princ.setLayout(new GridLayout(1, 2, 20, 20 ));
			princ.add(dados);
			botoes.add(btncancelar);
			botoes.add(btnsalvar);
			txtnomeservico.setBorder(null);
			txtvalor.setBorder(null);
			lado1.setLayout(new FlowLayout(3));
			lado1.setBackground(new Color(28, 28, 28));
			lado1.add(icon);
			lado1.add(lblcs);
			btncancelar.setForeground(new Color(255, 99, 71));
			btnsalvar.setForeground(new Color(60, 179, 113));
			btncancelar.setBackground(Color.black);
			btnsalvar.setBackground(Color.black);
			lblcs.setFont(new Font("Century Gothic",Font.BOLD,27));
			lblcs.setForeground(Color.WHITE);
			lblcs.setLayout(new FlowLayout(1));
			this.add(princ, BorderLayout.CENTER);
			this.add(lado1, BorderLayout.NORTH);
			this.add(lado2, BorderLayout.WEST);
			this.add(lado3, BorderLayout.EAST);
			this.add(botoes, BorderLayout.SOUTH);		
			this.setBounds(300,125,700,500);
			

			
		}
		
		
		
		public static void main(String[]args){
			cadastroServiço cs = new cadastroServiço();
			cs.setVisible(true);
		}

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

