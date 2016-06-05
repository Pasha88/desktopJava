package java_lab_5.pasha.threads;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

import java_lab_5.pasha.class_interface.Lab3;
import java_lab_5.pasha.main.B;
import java_lab_5.pasha.triangle.Lab_1;

public class MyPanel3 extends JPanel {

	private static final long serialVersionUID = -5077698915211518222L;

	private JPanel contentPane;
	public static JTextPane textPane;

	public MyPanel3(JPanel panel) {
		contentPane = panel;
		setOpaque(true);
		setBackground(Color.GRAY.darker().darker());
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
		
		textPane = new JTextPane();
		textPane.setBounds(10, 154, 309, 150);
		add(textPane);

		JLabel label_1 = new JLabel("���������");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(136, 129, 86, 14);
		add(label_1);

		JButton button = new JButton("������");
		button.setBounds(230, 115, 89, 23);
		add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Lab3.start();
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
