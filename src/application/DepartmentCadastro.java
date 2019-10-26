package application;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ProgressBarUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DepartmentCadastro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtDigiteSeuNovo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DepartmentCadastro dialog = new DepartmentCadastro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DepartmentCadastro() {
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNovoId = new JLabel("Novo ID");
		lblNovoId.setBounds(10, 37, 46, 14);
		contentPanel.add(lblNovoId);
		
		txtDigiteSeuNovo = new JTextField();
		txtDigiteSeuNovo.setToolTipText("Digite o novo ID");
		txtDigiteSeuNovo.setBounds(10, 62, 86, 20);
		contentPanel.add(txtDigiteSeuNovo);
		txtDigiteSeuNovo.setColumns(10);
		
		JLabel lblNovoDepartamento = new JLabel("Novo Departamento");
		lblNovoDepartamento.setBounds(10, 103, 116, 27);
		contentPanel.add(lblNovoDepartamento);
		
		textField = new JTextField();
		textField.setBounds(10, 141, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(10, 213, 414, 14);
		contentPanel.add(progressBar);
		progressBar.setStringPainted(true);
		progressBar.setValue(0);
		progressBar.setForeground(Color.GREEN);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(progressBar.getValue()<100) {
					progressBar.setValue(progressBar.getValue()+10);
				}
				
			}
		});
		btnInserir.setBounds(10, 179, 89, 23);
		contentPanel.add(btnInserir);
		
		 		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
		
		

	}
	
	
}


