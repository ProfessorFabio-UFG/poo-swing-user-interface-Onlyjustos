
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class MinhaTela extends JFrame {

	
	protected  JTextField codTextField;
	protected  JTextField nomeTextField;
	
	
	public MinhaTela() {
		setVisible(true);
        setBounds(100, 100, 600, 600);
		setResizable(false);
		setPreferredSize(new Dimension(600, 600));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu arquivosMenu = new JMenu("Arquivos");
		menuBar.add(arquivosMenu);
		
		JMenu jmiAbrir = new JMenu("Abrir");
		arquivosMenu.add(jmiAbrir);
		
		JMenuItem emailMenuItem = new JMenuItem("Email");
		jmiAbrir.add(emailMenuItem);
		
		JMenuItem impressoraMenuItem = new JMenuItem("Impressora");
		jmiAbrir.add(impressoraMenuItem);
		
		JMenuItem jmiSalvar = new JMenuItem("Salvar");
		arquivosMenu.add(jmiSalvar);
		
		JMenuItem jmiSair = new JMenuItem("Sair");
		arquivosMenu.add(jmiSair);
		
		JMenu editarMenu = new JMenu("Editar");
		
		menuBar.add(editarMenu);
		
		JLabel fichaLabel = new JLabel("Ficha de Avaliação");
		fichaLabel.setForeground(new Color(255, 0, 0));
		
		fichaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(fichaLabel, BorderLayout.NORTH);
		
		JDesktopPane desktopPane = new JDesktopPane();
		
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		TextArea textArea = new TextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(22, 145, 540, 160);
		desktopPane.add(textArea);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(new Color(225, 225, 225));
		desktopPane_1.setBounds(10, 11, 563, 106);
		desktopPane.add(desktopPane_1);
		
		JLabel codLabel = new JLabel("Codigo :");
		codLabel.setToolTipText("Codigo : ");
		codLabel.setBounds(10, 11, 46, 14);
		desktopPane_1.add(codLabel);
		
		JLabel nameLabel = new JLabel("Nome:");
		nameLabel.setBounds(10, 36, 46, 14);
		desktopPane_1.add(nameLabel);
		
		JLabel sexoLabel = new JLabel("Sexo : ");
		sexoLabel.setBounds(10, 65, 46, 14);
		desktopPane_1.add(sexoLabel);
		
		codTextField = new JTextField();
		codTextField.setBounds(295, 8, 206, 20);
		desktopPane_1.add(codTextField);
		codTextField.setColumns(10);
		
		nomeTextField = new JTextField();
		nomeTextField.setBounds(295, 33, 206, 20);
		desktopPane_1.add(nomeTextField);
		nomeTextField.setColumns(10);
		
		JRadioButtonMenuItem masculinoButton = new JRadioButtonMenuItem("Masculino");
		
		masculinoButton.setBounds(295, 65, 97, 26);
		desktopPane_1.add(masculinoButton);
		JRadioButtonMenuItem femininoButton = new JRadioButtonMenuItem("Feminino");
		femininoButton.setBounds(394, 65, 107, 26);	
		desktopPane_1.add(femininoButton);	
		ButtonGroup grupo = new ButtonGroup();
        grupo.add(masculinoButton);
        grupo.add(femininoButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(225, 225, 225));
		panel.setBounds(10, 128, 563, 199);
		desktopPane.add(panel);
		
		JLabel curriculumLabel = new JLabel("Curriculum Vitae");
		curriculumLabel.setForeground(Color.BLACK);
		curriculumLabel.setBackground(Color.LIGHT_GRAY);
		desktopPane.setLayer(curriculumLabel, 2);
		curriculumLabel.setBounds(20, 122, 99, 13);
		desktopPane.add(curriculumLabel);
		
		JPanel panel_1 = new JPanel();
		desktopPane.setLayer(panel_1, 0);
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(0, 490, 594, 35);
		desktopPane.add(panel_1);
		
		JButton anteriorButton = new JButton("Anterior");
		panel_1.add(anteriorButton);
		anteriorButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		
		JButton proximoButton = new JButton("Proximo");
		panel_1.add(proximoButton);
		proximoButton.setInheritsPopupMenu(true);
		
		JButton novoButton = new JButton("Novo");
		panel_1.add(novoButton);
		novoButton.setDefaultCapable(false);
		
		JButton cancelarButton = new JButton("Cancelar");
		panel_1.add(cancelarButton);
		
		JLabel areaLabel = new JLabel("Áreas");
		desktopPane.setLayer(areaLabel, 1);
		areaLabel.setBounds(20, 329, 53, 23);
		desktopPane.add(areaLabel);
		
		
		String[] interesses = {"Desenvolvedor", "Engenheiro de software", "Estágio", "Gerente de projetos"};
		JComboBox interesseComboBox = new JComboBox(interesses);
		interesseComboBox.setName("Desenvolvedor");
		interesseComboBox.setMaximumRowCount(5);
		interesseComboBox.setBounds(22, 426, 251, 29);
		desktopPane.add(interesseComboBox);
		
		String[] atuacoes = {"Desenvolvedor","Programação", "Design", "Projetista"};
		JComboBox atuacaoComboBox = new JComboBox(atuacoes);
		
		atuacaoComboBox.setBounds(283, 426, 251, 29);
		desktopPane.add(atuacaoComboBox);
		
		JLabel interessesLabel = new JLabel("Interesse :");
		interessesLabel.setToolTipText("interessesLabel");
		interessesLabel.setBounds(21, 387, 70, 28);
		desktopPane.add(interessesLabel);
		
		JLabel atuacaoLabel = new JLabel("Atuação :");
		atuacaoLabel.setToolTipText("interessesLabel");
		atuacaoLabel.setBounds(283, 387, 87, 28);
		desktopPane.add(atuacaoLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(225, 225, 225));
		panel_2.setBounds(10, 342, 563, 113);
		desktopPane.add(panel_2);
		jmiSalvar.addActionListener((ActionEvent e) -> {
					

					
					File diretorio = new File("D:\\programacao\\POO-UFG\\Swinggit");
       				diretorio.mkdir();
					File arquivo = new File(diretorio , "arquivoCurriculo.txt");
					try (FileWriter f = new FileWriter(arquivo);){
						PrintWriter pw = new PrintWriter(f);
						if("".equals(codTextField.getText())){
							pw.println("Cod: NULL");
							pw.flush();
						}
						else {
							String CodDigitado = codTextField.getText(); 
							pw.println("Cod: " + CodDigitado); 
							pw.flush();
						}
						if("".equals(nomeTextField.getText())){
							pw.println("Nome: NULL");
							pw.flush();
						}
						else{
							String nomeDigitado = nomeTextField.getText();
							pw.println("Nome: "+ nomeDigitado);
							pw.flush();
						}
						if(masculinoButton.isSelected()){
							pw.println("Sexo: Masculino");
							pw.flush();
						}
						else if(femininoButton.isSelected()){
							pw.println("Sexo: Feminino");
							pw.flush();
						}
						else{
							pw.println("Sexo: NULL");
							pw.flush();
						}
						pw.println("Atuação: "+atuacaoComboBox.getSelectedItem()); 
						pw.flush();
						pw.println("Interesse: "+interesseComboBox.getSelectedItem()); 
						pw.flush();
						pw.println(textArea.getText());
						pw.flush();
						
					} catch (IOException io) {
						System.out.println("Erro ao escrever no arquivo");
					}
                });
		
	}
	
}
