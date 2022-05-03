package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex01_pane extends JFrame {

	private JPanel contentPane;
	public int count = 20;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex01_pane frame = new Ex01_pane();
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
	public Ex01_pane() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HELLO WORLD!");
		lblNewLabel.setBounds(190, 76, 288, 133);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Aumentar tamaño");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, count++));				
			}
		});
		btnNewButton.setBounds(69, 70, 115, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Disminuir tamaño");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, count--));	
			}
		});
		btnNewButton_1.setBounds(274, 70, 113, 21);
		contentPane.add(btnNewButton_1);
	}
}
