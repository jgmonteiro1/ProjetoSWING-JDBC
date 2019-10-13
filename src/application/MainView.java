package application;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.MainViewController;

public class MainView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		//Instancia da classe controle que define os métodos que serão chamadas com determinada ações
		MainViewController mvc = new MainViewController();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);
		
		JMenu mnEdit = new JMenu("Editar");
		menuBar.add(mnEdit);
		
		JMenu mnRegistrar = new JMenu("Registrar");
		menuBar.add(mnRegistrar);
		
		JMenuItem mntmDepartamentos = new JMenuItem("Departamentos");
		mntmDepartamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DepartmentList().setVisible(true);
			}
		});
		mnRegistrar.add(mntmDepartamentos);
		
		JMenuItem menuItemVendedores = new JMenuItem("Vendedores");
		//Método chamado da classe controller ao clicar no Menu de vendedores.
		menuItemVendedores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mvc.onMenuItemVendedoresAction();
			}
		});
		
		
		mnRegistrar.add(menuItemVendedores);
		
		JMenu mnInfo = new JMenu("Info");
		mnInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new InfoView().setVisible(true);
							}
		});
		
		menuBar.add(mnInfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
