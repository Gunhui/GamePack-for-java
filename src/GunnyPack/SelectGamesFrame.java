package GunnyPack;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;

public class SelectGamesFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame frame = new RegisterFrame();
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
	public SelectGamesFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1019, 515); // Change your frame size and position here
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel close = new JLabel("X");
		close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("<html>Gunny<br>Pack</html>");
		lblNewLabel_1.setForeground(new Color(112, 128, 144));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(127, 187, 160, 149);
		contentPane.add(lblNewLabel_1);
		close.setForeground(new Color(255, 255, 255));
		close.setHorizontalAlignment(SwingConstants.CENTER);
		close.setFont(new Font("Tahoma", Font.BOLD, 15));
		close.setBounds(0, 0, 53, 24);
		contentPane.add(close);
		
		JLabel circle = new JLabel("");
		circle.setHorizontalTextPosition(SwingConstants.LEADING);
		circle.setIcon(new ImageIcon(RegisterFrame.class.getResource("/circle.png")));
		circle.setBounds(76, 89, 288, 341);
		contentPane.add(circle);
		lblNewLabel.setBackground(new Color(255, 165, 0));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(0, 0, 428, 515);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel("Welcome to Gunny's Game Pack !");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(540, 22, 384, 24);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setForeground(new Color(255, 165, 0));
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(184, 134, 11)));
		textField.setBounds(540, 127, 402, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setForeground(new Color(255, 165, 0));
		textField_1.setOpaque(false);
		textField_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(184, 134, 11)));
		textField_1.setColumns(10);
		textField_1.setBounds(540, 216, 402, 42);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setForeground(new Color(255, 165, 0));
		textField_2.setOpaque(false);
		textField_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(184, 134, 11)));
		textField_2.setColumns(10);
		textField_2.setBounds(540, 308, 402, 42);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setForeground(new Color(255, 165, 0));
		textField_3.setOpaque(false);
		textField_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(184, 134, 11)));
		textField_3.setColumns(10);
		textField_3.setBounds(540, 401, 402, 42);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setForeground(new Color(112, 128, 144));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(542, 102, 226, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(new Color(112, 128, 144));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(540, 191, 228, 24);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setForeground(new Color(112, 128, 144));
		lblPhone.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPhone.setBounds(542, 283, 226, 24);
		contentPane.add(lblPhone);
		
		JLabel lblHowDidYou = new JLabel("How did you find us ?");
		lblHowDidYou.setForeground(new Color(112, 128, 144));
		lblHowDidYou.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHowDidYou.setBounds(540, 376, 228, 24);
		contentPane.add(lblHowDidYou);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(112, 128, 144));
		lblNewLabel_3.setForeground(new Color(112, 128, 144));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(426, 0, 593, 61);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Game");
		lblNewLabel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBackground(new Color(112, 128, 144));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(541, 465, 175, 31);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblRank = new JLabel("Rank");
		lblRank.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblRank.setForeground(new Color(255, 255, 255));
		lblRank.setBackground(new Color(112, 128, 144));
		lblRank.setOpaque(true);
		lblRank.setHorizontalAlignment(SwingConstants.CENTER);
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRank.setBounds(769, 465, 175, 31);
		contentPane.add(lblRank);
		
		setUndecorated(true); // this removes the frame minimize maximize, and close border from the panel
	}
}
