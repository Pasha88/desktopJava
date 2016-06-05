package java_lab_5.pasha.threads;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App {
	private MyPanel panel1;
	private MyPanel2 panel2;
	private MyPanel3 panel3;
	private MyPanel4 panel4;

	private void displayGUI() {
		JFrame frame = new JFrame("SuperTask App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new CardLayout());
		panel1 = new MyPanel(contentPane);
		panel2 = new MyPanel2(contentPane);
		panel3 = new MyPanel3(contentPane);
		panel4 = new MyPanel4(contentPane);
		
		contentPane.add(panel1, "Panel 1");
		contentPane.add(panel2, "Panel 2");
		contentPane.add(panel3, "Panel 3");
		contentPane.add(panel4, "Panel 4");

		frame.setContentPane(contentPane);
		frame.pack();
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
	}

	public static void main(String... args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new App().displayGUI();
			}
		});
	}
}
