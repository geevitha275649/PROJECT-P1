import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MainGUITRAVEL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUITRAVEL frame = new MainGUITRAVEL();
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
	public MainGUITRAVEL() {
		setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1386, 749);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTourGuide = new JButton("Tour Guide");
		btnTourGuide.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTourGuide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTourGuide.setBounds(107, 193, 263, 59);
		contentPane.add(btnTourGuide);
		
		JButton btnTravelAgent = new JButton("Travel Agent");
		btnTravelAgent.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTravelAgent.setBounds(107, 384, 263, 59);
		contentPane.add(btnTravelAgent);
		
		JButton btnCruiseConsultant = new JButton("Cruise Consultant");
		btnCruiseConsultant.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnCruiseConsultant.setBounds(544, 265, 263, 59);
		contentPane.add(btnCruiseConsultant);
		
		JButton btnTravelwb = new JButton("Travel Writer / Blogger");
		btnTravelwb.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTravelwb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTravelwb.setBounds(980, 193, 286, 59);
		contentPane.add(btnTravelwb);
		
		JButton btnEventCoordinator = new JButton("Event Coordinator");
		btnEventCoordinator.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnEventCoordinator.setBounds(980, 384, 286, 59);
		contentPane.add(btnEventCoordinator);
	}
}
