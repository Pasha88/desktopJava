package java_lab_5.pasha.triangle;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenuItem;

public class Lab_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {

	//}

	/**
	 * Create the application.
	 */
	public Lab_1() {
		//System.out.println("HERE");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab_1 window = new Lab_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Приложение МультиКонфинг");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 21, 97, 21);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("Меню");
		menuBar.add(mnNewMenu);

		JMenuItem lab1 = new JMenuItem("Проверка на треугольник");
		JMenuItem lab2 = new JMenuItem("Классы и Интерфейсы");
		JMenuItem lab3 = new JMenuItem("Потоки");
		JMenuItem lab4 = new JMenuItem("Потоки - 2");
		JMenuItem lab5 = new JMenuItem("Потоки - 3");

		mnNewMenu.add(lab1);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab2);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab3);
		mnNewMenu.addSeparator();// Разделитель
		mnNewMenu.add(lab4);
		mnNewMenu.add(lab5);
		
		lab1.addActionListener(new ActionListener()
		  {
		   public void actionPerformed(ActionEvent e)
		   {
			   System.out.println("Clicked");
		   }
		});
		
		lab2.addActionListener(new ActionListener()
		  {
		   public void actionPerformed(ActionEvent e)
		   {
			   System.out.println("Clicked");
		   }
		});

		//
		// JMenuBar menuBar = new JMenuBar();
		// //Создаем три подменю
		// JMenu menuFile = new JMenu("File");
		// JMenu menuView = new JMenu("View");
		// JMenu menuThread = new JMenu("Thread");
		// //Добавляем к нашем подменю обработчики событий(о них позже)
		// //Создаем элементы подменю File с обработчиками событий
		// JMenuItem item1 = new JMenuItem("New");
		// JMenuItem item2 = new JMenuItem("Open");
		// JMenuItem item3 = new JMenuItem("Save");
		// JMenuItem item4 = new JMenuItem("Save as..");
		// JMenuItem item5 = new JMenuItem("Close");
		// JMenuItem item6 = new JMenuItem("Exit");
		//
		// menuFile.add(item1);
		// menuFile.add(item2);
		// menuFile.addSeparator();//Разделитель
		// menuFile.add(item3);
		// menuFile.add(item4);
		// menuFile.addSeparator();//Разделитель
		// menuFile.add(item5);
		// menuFile.addSeparator();//Разделитель
		// menuFile.add(item6);

	}
}
