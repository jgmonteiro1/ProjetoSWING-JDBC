package application;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.entities.MyTableModel;
import model.services.DepartmentService;

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
		
		DepartmentService service = new DepartmentService();
		MyTableModel modelo = new MyTableModel(service.findAll());
		
		
		
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
		
		
		
		
		
		JTable table = new JTable(modelo);
		
			
		
		scrollPane.setViewportView(table);
		
		
				
		
		
		
	}
}
