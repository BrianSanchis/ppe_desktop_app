package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HomeFenetre extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFenetre frame = new HomeFenetre();
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
	public HomeFenetre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 671);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(98, 160, 234));
		panel.setBounds(0, 0, 223, 637);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblSwissGalaxyRh = new JLabel("Swiss Galaxy RH");
		lblSwissGalaxyRh.setFont(new Font("Montserrat Medium", Font.BOLD, 22));
		lblSwissGalaxyRh.setForeground(new Color(255, 255, 255));
		lblSwissGalaxyRh.setBounds(12, 81, 201, 97);
		panel.add(lblSwissGalaxyRh);
		
		JButton btnDeconnexion = new JButton("Deconnexion");
		btnDeconnexion.setBounds(52, 308, 119, 27);
		panel.add(btnDeconnexion);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(154, 153, 150));
		panel_1.setBounds(233, 0, 600, 36);
		contentPane.add(panel_1);
		
		JLabel lblRechercherUnEmploy = new JLabel("Rechercher un employé par le nom");
		panel_1.add(lblRechercherUnEmploy);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnRechercher = new JButton("Rechercher");
		panel_1.add(btnRechercher);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(154, 153, 150));
		panel_1_1.setBounds(233, 601, 600, 36);
		contentPane.add(panel_1_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(234, 44, 600, 550);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
					"Nom", "Prenom", "Date d'embauche", "Poste"
				}
			));
	}
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public JTable getTable() {
		return table;
	}
}
