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
		frame = new JFrame("���������� �������������");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 21, 97, 21);
		frame.getContentPane().add(menuBar);

		JMenu mnNewMenu = new JMenu("����");
		menuBar.add(mnNewMenu);

		JMenuItem lab1 = new JMenuItem("�������� �� �����������");
		JMenuItem lab2 = new JMenuItem("������ � ����������");
		JMenuItem lab3 = new JMenuItem("������");
		JMenuItem lab4 = new JMenuItem("������ - 2");
		JMenuItem lab5 = new JMenuItem("������ - 3");

		mnNewMenu.add(lab1);
		mnNewMenu.addSeparator();// �����������
		mnNewMenu.add(lab2);
		mnNewMenu.addSeparator();// �����������
		mnNewMenu.add(lab3);
		mnNewMenu.addSeparator();// �����������
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
		// //������� ��� �������
		// JMenu menuFile = new JMenu("File");
		// JMenu menuView = new JMenu("View");
		// JMenu menuThread = new JMenu("Thread");
		// //��������� � ����� ������� ����������� �������(� ��� �����)
		// //������� �������� ������� File � ������������� �������
		// JMenuItem item1 = new JMenuItem("New");
		// JMenuItem item2 = new JMenuItem("Open");
		// JMenuItem item3 = new JMenuItem("Save");
		// JMenuItem item4 = new JMenuItem("Save as..");
		// JMenuItem item5 = new JMenuItem("Close");
		// JMenuItem item6 = new JMenuItem("Exit");
		//
		// menuFile.add(item1);
		// menuFile.add(item2);
		// menuFile.addSeparator();//�����������
		// menuFile.add(item3);
		// menuFile.add(item4);
		// menuFile.addSeparator();//�����������
		// menuFile.add(item5);
		// menuFile.addSeparator();//�����������
		// menuFile.add(item6);

	}
}
