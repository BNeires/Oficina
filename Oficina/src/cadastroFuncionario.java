import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JFrame;

public class cadastroFuncionario extends JFrame implements ActionListener {

	private String url = "jdbc:mysql://127.0.0.1:3306/Oficina?useSSL=false",
			usuario = "root",
			senha = "85002062";
	
	private Connection conexao;
	private Statement stm;

}