package java_lab_5.pasha.threads;

import javax.swing.JPanel;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;

import java_lab_5.pasha.triangle.Lab_1;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MyPanel extends JPanel {

	private static final long serialVersionUID = -563059980104591111L;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextPane textPane;

	public MyPanel(JPanel panel) {
		contentPane = panel;
		setOpaque(true);
		setBackground(Color.RED.darker().darker());
		setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(2, 5, 43, 21);
		add(menuBar);

		JMenu mnNewMenu = new JMenu("Меню");
		menuBar.add(mnNewMenu);

		JMenuItem lab1 = new JMenuItem("Проверка на треугольник");
		JMenuItem lab2 = new JMenuItem("Классы и Интерфейсы");
		JMenuItem lab3 = new JMenuItem("Потоки");
		JMenuItem lab4 = new JMenuItem("Потоки - 2");

		mnNewMenu.add(lab1);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab2);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab3);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab4);

		JLabel label = new JLabel(
				"\u041F\u0440\u043E\u0432\u0435\u0440\u043A\u0430 \u0422\u0440\u0435\u0443\u0433\u043E\u043B\u044C\u043D\u0438\u043A\u0430");
		label.setForeground(Color.WHITE);
		label.setBounds(93, 12, 163, 14);
		add(label);

		JLabel lblA = new JLabel("\u0421\u0442\u043E\u0440\u043E\u043D\u0430 a");
		lblA.setForeground(Color.WHITE);
		lblA.setBounds(24, 59, 70, 14);
		add(lblA);

		JLabel lblB = new JLabel("\u0421\u0442\u043E\u0440\u043E\u043D\u0430 b");
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(136, 59, 70, 14);
		add(lblB);

		JLabel lblC = new JLabel("\u0421\u0442\u043E\u0440\u043E\u043D\u0430 c");
		lblC.setForeground(Color.WHITE);
		lblC.setBounds(255, 59, 64, 14);
		add(lblC);

		textField = new JTextField();
		textField.setBounds(8, 84, 86, 20);
		add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(120, 84, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(233, 84, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);

		textPane = new JTextPane();
		textPane.setBounds(10, 154, 309, 42);
		add(textPane);

		JLabel label_1 = new JLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0430\u0442");
		label_1.setForeground(Color.WHITE);
		label_1.setBounds(136, 129, 86, 14);
		add(label_1);

		JButton button = new JButton("Запуск");
		button.setBounds(230, 115, 89, 23);
		add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start();
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

	public void start() {
		// Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0, c = 0;

		try {
			System.out.println("Введите сторону a(или -1 для выхода):");

			try {
				a = Integer.parseInt(textField.getText());
			} catch (NumberFormatException ex) {
				System.out.println("Exception : " + ex);
			}

			if (a == -1) {
				return;
			}

			if (a <= 0) {
				System.out.println("Это не треугольник. Сторона не может быть 0 или меньше 0.");
				return;
			}
		} catch (InputMismatchException exception) {
			System.out.println("Число не может быть больше 2147483647.");
		}

		try {
			System.out.println("Введите сторону b:");

			try {
				b = Integer.parseInt(textField_1.getText());
			} catch (NumberFormatException ex) {
				System.out.println("Exception : " + ex);
			}

			if (b <= 0) {
				System.out.println("Это не треугольник. Сторона не может быть 0 или меньше 0.");
				return;
			}
		} catch (InputMismatchException exception) {
			System.out.println("Число не может быть больше 2147483647.");
		}

		try {
			System.out.println("Введите сторону a:");

			try {
				c = Integer.parseInt(textField_2.getText());
			} catch (NumberFormatException ex) {
				System.out.println("Exception : " + ex);
			}

			if (c <= 0) {
				System.out.println("Это не треугольник. Сторона не может быть 0 или меньше 0.");
				return;
			}
		} catch (InputMismatchException exception) {
			System.out.println("Число не может быть больше 2147483647.");
		}

		System.out.println("a: " + a + "\n" + "b: " + b + "\n" + "c: " + c);

		int result_a_b = a + b;
		if (result_a_b > Integer.MAX_VALUE) {
			System.out.println("Результат суммы больше Максимального значения Integer: 2147483647.");
		}

		int result_b_c = b + c;
		if (result_b_c > Integer.MAX_VALUE) {
			System.out.println("Результат суммы больше Максимального значения Integer: 2147483647.");
		}

		int result_c_a = c + a;
		if (result_c_a > Integer.MAX_VALUE) {
			System.out.println("Результат суммы больше Максимального значения Integer: 2147483647.");
		}

		String result = "";
		if (a + b > c && a + c > b && b + c > a) {
			result = "Это треугольник";
			textPane.setText(result);
		} else {
			result = "Из данных сторон треугольник не получится";
			textPane.setText(result);
		}

		if (a * a + b * b == c * c || c * c + b * b == a * a || c * c + a * a == b * b) {
			result = result + "\n" + "Это прямоугольник";
			textPane.setText(result);
		} else {
			result = result + "\n" + "Это не прямоугольник";
			textPane.setText(result);
		}
	}
}
