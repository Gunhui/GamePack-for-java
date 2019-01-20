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

public class RankFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("");

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
	public RankFrame() {
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
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(112, 128, 144));
		lblNewLabel_3.setForeground(new Color(112, 128, 144));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(426, 0, 593, 61);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblRank = new JLabel("Back");
		lblRank.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblRank.setForeground(new Color(255, 255, 255));
		lblRank.setBackground(new Color(112, 128, 144));
		lblRank.setOpaque(true);
		lblRank.setHorizontalAlignment(SwingConstants.CENTER);
		lblRank.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRank.setBounds(638, 451, 175, 31);
		contentPane.add(lblRank);
		
		setUndecorated(true); // this removes the frame minimize maximize, and close border from the panel
	}
}
