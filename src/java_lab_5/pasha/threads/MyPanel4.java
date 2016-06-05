package java_lab_5.pasha.threads;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java_lab_5.pasha.class_interface.Lab3;
import java_lab_5.pasha.threads2.Lab4;
import java_lab_5.pasha.triangle.Lab_1;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyPanel4 extends JPanel {

	private static final long serialVersionUID = 5467656642737323296L;

	private JPanel contentPane;
	public static JTextPane textPane;
	public static JTextArea textArea_1;

	public MyPanel4(JPanel panel) {
		contentPane = panel;
		setOpaque(true);
		setBackground(Color.YELLOW.darker().darker());
		setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(2, 5, 43, 21);
		add(menuBar);

		JMenu mnNewMenu = new JMenu("����");
		menuBar.add(mnNewMenu);

		JMenuItem lab1 = new JMenuItem("�������� �� �����������");
		JMenuItem lab2 = new JMenuItem("������ � ����������");
		JMenuItem lab3 = new JMenuItem("������");
		JMenuItem lab4 = new JMenuItem("������ - 2");

		mnNewMenu.add(lab1);
		mnNewMenu.addSeparator();// �����������
		mnNewMenu.add(lab2);
		mnNewMenu.addSeparator();// �����������
		mnNewMenu.add(lab3);
		mnNewMenu.addSeparator();// �����������
		mnNewMenu.add(lab4);
		
//		textPane = new JTextPane();
//		textPane.setBounds(27, 58, 309, 150);
//		add(textPane);

		JLabel label_1 = new JLabel("���������");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(91, 12, 86, 14);
		add(label_1);

		JButton button = new JButton("������");
		button.setBounds(220, 5, 89, 23);
		add(button);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(71, 99, 162, 40);
		add(textArea_1);
		
		JScrollPane scrollPane = new JScrollPane(textArea_1, 
				   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(25, 58, 288, 162);
		add(scrollPane);
		
		//JFrame frame = new JFrame ("Test");
//		JTextArea textArea = new JTextArea ("Test");
//		textArea.setBounds(27, 58, 309, 150);
//
//		JScrollPane scroll = new JScrollPane (textArea, 
//		   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//
//		add(scroll);
//		setVisible (true);
//		JFrame frame = new JFrame ("Test");
//		JTextArea textArea = new JTextArea ("Test");
//
//		JScrollPane scroll = new JScrollPane (textArea, 
//		   JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//
//		frame.getContentPane().add(scroll);
//		frame.setVisible (true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Lab4.start();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		lab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "Panel 1");
			}
		});

		lab2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "Panel 2");
			}
		});

		lab3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "Panel 3");
			}
		});

		lab4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
				cardLayout.show(contentPane, "Panel 4");
			}
		});

	}

	@Override
	public Dimension getPreferredSize() {
		return (new Dimension(500, 500));
	}
}
