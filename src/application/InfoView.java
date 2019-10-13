package application;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InfoView extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			InfoView dialog = new InfoView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public InfoView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						InfoView.this.dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		{	
			String text = "Programa desenvolvido por João Gabriel Moreira Monteiro\n"+
					"Estudante de Ciência da Computação na UNIJORGE, 2018.2\n"+
					"Programa que foi proposto como parte de um projeto em um curso da Udemy ministrado pelo professor Nélio Alves\n"+
					"Originalmente o programa deveria ter sido feito com JavaFX\n"+
					"Porém, decidi utilizar do SWING\n"; 
			JTextArea textArea = new JTextArea(text);
			textArea.setBounds(10, 11, 414, 214);
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
			getContentPane().add(textArea);
		}
	}

}
