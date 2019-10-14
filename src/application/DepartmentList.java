package application;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import gui.DepartmentListController;

public class DepartmentList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepartmentList frame = new DepartmentList();
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
	public DepartmentList() {
		DepartmentListController DPC = new DepartmentListController();
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension tela = kit.getScreenSize();
		double larg = tela.getWidth();
		double alt = tela.getHeight();
		
		double minhaL = larg * 0.7;
		double minhaA = alt*0.7;
		
		setSize((int)minhaL,(int) minhaA);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDepartmentRegistration = new JLabel("Department Registration");
		lblDepartmentRegistration.setFont(new Font("Arial", Font.BOLD, 14));
		lblDepartmentRegistration.setBounds(0, 0, 185, 17);
		contentPane.add(lblDepartmentRegistration);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 75, 434, 175);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"ID", "Name"
			}
		));
		scrollPane.setViewportView(table);
		
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DPC.allCellEditable(table);
			}
		});
		btnNew.setBounds(0, 51, 89, 23);
		contentPane.add(btnNew);
	}
}
