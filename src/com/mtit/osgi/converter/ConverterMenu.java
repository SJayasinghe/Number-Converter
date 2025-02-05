package com.mtit.osgi.converter;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ConverterMenu extends JFrame  {
	
	
	private JPanel jpanel;
	private JButton decimalBtn,binaryBtn,octalBtn,hexaBtn;
	private JLabel title; 
	private static boolean tempBtnOnclick = false;
	private static boolean energyBtnOnclick = false;
	private static boolean lengthBtnOnclick = false;
	private static boolean storageBtnOnclick = false;
	private static boolean speedBtnOnclick = false;
	private static boolean massBtnOnclick = false;
	private static boolean timeBtnOnClick = false;
	private static boolean currencyBtnOnClick = false;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterMenu frame = new ConverterMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ConverterMenu() {
		setResizable(false);
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(80, 50, 550, 470);
		setLocationRelativeTo(null);
		jpanel = new JPanel();
		jpanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(jpanel);
		jpanel.setLayout(null);
		jpanel.setVisible(true);

		title = new JLabel("Converter");
		title.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		title.setBounds(180, 25, 175, 30);
		jpanel.add(title);
		
		decimalBtn = new JButton("Decimal Converter");
		decimalBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		decimalBtn.setFocusable(false);
//		decimalBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				decimalBtnOnclick = ConverterActivator.decimalChecker();
//				if (tempBtnOnclick == true) {
//					TempDisplayer tempDisplayer = new TempDisplayer();
//					tempDisplayer.setVisible(true);
//				} else {
//					JOptionPane.showMessageDialog(null, "Temperature Service is not Started",
//							"Error !", JOptionPane.OK_OPTION);
//				}
//			}
//		});
		decimalBtn.setBounds(50, 90, 200, 60);
		jpanel.add(decimalBtn);
		
		binaryBtn = new JButton("Binary Converter");
		binaryBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		binaryBtn.setFocusable(false);
//		binaryBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				binaryBtnOnclick = ConverterActivator.energyChecker();
//				if (binaryBtnOnclick == true) {
//					EnergyDisplayer energyDisplayer = new EnergyDisplayer();
//					energyDisplayer.setVisible(true);
//				} else {
//					JOptionPane.showMessageDialog(null, "Energy Service is not Started",
//							"Error !", JOptionPane.OK_OPTION);
//				}
//			}
//		});
		binaryBtn.setBounds(280, 90, 200, 60);
		jpanel.add(binaryBtn);


		octalBtn = new JButton("Octal Converter");
		octalBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		octalBtn.setFocusable(false);
//		octalBtn.addActionListener(new ActionListener() {
//
//			public void actionPerformed(ActionEvent e) {
//				octalBtnOnclick = ConverterActivator.octalChecker();
//				if (octalBtnOnclick == true) {
//					LengthDisplayer lengthDisplayer = new LengthDisplayer();
//					lengthDisplayer.setVisible(true);
//				} else {
//					JOptionPane.showMessageDialog(null, "Length Service is not Started",
//							"Error !", JOptionPane.OK_OPTION);
//				}
//			}
//		});

		octalBtn.setBounds(50, 170, 200, 60);
		jpanel.add(octalBtn);

		
		hexaBtn = new JButton("Hexa-Decimal Converter");
		hexaBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hexaBtn.setFocusable(false);
//		hexaBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				hexaBtnOnclick = ConverterActivator.StorageChecker();
//				if (hexaBtnOnclick == true) {
//					hexaDisplayer StorageDisplayer = new StorageDisplayer();
//					StorageDisplayer.setVisible(true);
//				} else {
//					JOptionPane.showMessageDialog(null, "Storage Service is not Started",
//							"Error !", JOptionPane.OK_OPTION);
//				}
//			}
//		});
		hexaBtn.setBounds(280, 170, 200, 60);
		jpanel.add(hexaBtn);
		
	}
	
	

}
