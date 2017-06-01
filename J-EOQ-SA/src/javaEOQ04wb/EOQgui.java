package javaEOQ04wb;

//Copyright @ 2014 by Valdecy Pereira

//This file is part of J-Horizon.
//
//J-EOQ-SA is free software: you can redistribute it and/or modify
//it under the terms of the GNU General Public License as published by
//the Free Software Foundation, either version 3 of the License, or
//(at your option) any later version.
//
//J-EOQ-SA is distributed in the hope that it will be useful,
//but WITHOUT ANY WARRANTY; without even the implied warranty of
//MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//GNU General Public License for more details.
//
//You should have received a copy of the GNU General Public License
//along with J-EOQ-SA.  If not, see <http://www.gnu.org/licenses/>.

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Enumeration;
import javaEOQ02metaheuristic.SimulatedAnnealing;
import javaEOQ03graph.JFreeChartEOQGraph;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class EOQgui extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;

	int end;
	int ktype = 0;
	int krdbutton = 10;
	int origin;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EOQgui frame = new EOQgui();
					frame.setSize(799, 487);
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
	public EOQgui() {
		setResizable(false);
		setTitle("Jay EOQ.SA - Valdecy Pereira, D. Sc. & Helder Gomes Costa, D. Sc.  | valdecypereira@id.uff.br");
		setBackground(Color.DARK_GRAY);
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Problem Type", TitledBorder.LEADING, TitledBorder.TOP, null, null)));
		panel.setBounds(6, 13, 193, 196);
		getContentPane().add(panel);
		panel.setLayout(null);

		final JButton btnDefault = new JButton("Default");
		final JButton btnClear = new JButton("Clear");

		final JLabel label = new JLabel("Annual Demand (D)");
		final JLabel label_1 = new JLabel("Order Cost (A)");
		final JLabel label_2 = new JLabel("Hold Cost (%)");
		final JLabel label_3 = new JLabel("Backorder Cost (Cb)");
		final JLabel label_4 = new JLabel("Range");
		final JLabel label_5 = new JLabel("Lower");
		final JLabel label_6 = new JLabel("Q");
		final JLabel label_7 = new JLabel("Upper");
		final JLabel label_8 = new JLabel("Price");
		final JLabel label_9 = new JLabel("\u2264 Q <");
		final JLabel label_10 = new JLabel("\u2264 Q <");
		final JLabel label_11 = new JLabel("\u2264 Q <");
		final JLabel label_12 = new JLabel("\u2264 Q <");
		final JLabel label_13 = new JLabel("\u2264 Q <");
		final JLabel label_14 = new JLabel("\u2264 Q <");
		final JLabel label_15 = new JLabel("\u2264 Q <");
		final JLabel label_16 = new JLabel("\u2264 Q <");
		final JLabel label_17 = new JLabel("\u2264 Q <");
		final JLabel label_18 = new JLabel("\u2264 Q <");	
		final JLabel lblK = new JLabel("k = 00");
		final JLabel lblOuterLoop = new JLabel("Outer Loop ( i )");
		final JLabel lblInnerLoop = new JLabel("Inner Loop ( j )");
		final JLabel lblInitialT = new JLabel("Temperature");
		final JLabel lblStart = new JLabel("Initial Q value");
		final JLabel lblEnd = new JLabel("Final Q value");

		final JButton btnNext = new JButton("NEXT");
		final JButton btnBack = new JButton("BACK");
		final JButton btnNext_1 = new JButton("NEXT");
		final JButton btnBack_1 = new JButton("BACK");

		final JButton btnDefault_1 = new JButton("Default");
		final JButton btnClear_1 = new JButton("Clear");
		final JButton btnDefault_2 = new JButton("Default");
		final JButton btnClear_2 = new JButton("Clear");
		final JButton btnDefault_3 = new JButton("Default");
		final JButton btnClear_3 = new JButton("Clear");

		final JButton btnStart = new JButton("SA [Geometric Schedule]");
		final JButton btnLoadEoqPlotter = new JButton("Load EOQ Plotter");


		final JRadioButton rdbtnEoq = new JRadioButton("EOQ");
		rdbtnEoq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ktype = 1;
				krdbutton = 0;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("0.0");
				textField_5.setText("\u221E");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoq);
		rdbtnEoq.setBounds(6, 18, 127, 25);
		panel.add(rdbtnEoq);

		final JRadioButton rdbtnEoqB = new JRadioButton("EOQ + B");
		rdbtnEoqB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ktype = 2;
				krdbutton = 0;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_5.setEditable(false);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("");
				textField_5.setText("\u221E");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoqB);
		rdbtnEoqB.setBounds(6, 48, 127, 25);
		panel.add(rdbtnEoqB);

		final JRadioButton rdbtnEoqAud = new JRadioButton("EOQ + AUD");
		rdbtnEoqAud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ktype =3;
				krdbutton = 10;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("0.0");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoqAud);
		rdbtnEoqAud.setBounds(6, 78, 127, 25);
		panel.add(rdbtnEoqAud);

		final JRadioButton rdbtnEoqAudB = new JRadioButton("EOQ + AUD + B");
		rdbtnEoqAudB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ktype = 4;
				krdbutton = 10;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoqAudB);
		rdbtnEoqAudB.setBounds(6, 108, 127, 25);
		panel.add(rdbtnEoqAudB);


		final JRadioButton rdbtnEoqId = new JRadioButton("EOQ + ID");
		rdbtnEoqId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ktype = 5;
				krdbutton = 10;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("0.0");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoqId);
		rdbtnEoqId.setBounds(6, 138, 127, 25);
		panel.add(rdbtnEoqId);

		final JRadioButton rdbtnEoqIdB = new JRadioButton("EOQ + ID + B");
		rdbtnEoqIdB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ktype = 6;
				krdbutton = 10;

				btnDefault.setEnabled(true);
				btnClear.setEnabled(true);

				label_1.setEnabled(true);
				label_2.setEnabled(true);
				label.setEnabled(true);
				label_3.setEnabled(true);

				btnNext.setEnabled(true);

				textField.setEditable(true);
				textField_1.setEditable(true);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_3.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				buttonGroup_1.clearSelection();

			}
		});
		buttonGroup.add(rdbtnEoqIdB);
		rdbtnEoqIdB.setBounds(6, 168, 127, 25);
		panel.add(rdbtnEoqIdB);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Problem Inputs", TitledBorder.LEADING, TitledBorder.TOP, null, null)));
		panel_1.setBounds(6, 222, 193, 185);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);


		label.setEnabled(false);
		label.setBounds(6, 18, 122, 25);
		panel_1.add(label);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setForeground(Color.BLACK);

		label_1.setEnabled(false);
		label_1.setBounds(6, 52, 122, 25);
		panel_1.add(label_1);
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_2.setEnabled(false);
		label_2.setBounds(6, 84, 122, 25);
		panel_1.add(label_2);
		label_2.setForeground(Color.BLACK);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_3.setEnabled(false);
		label_3.setBounds(6, 115, 122, 25);
		panel_1.add(label_3);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(128, 18, 59, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		textField.setDocument(new KeyFieldControler());

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(128, 52, 59, 25);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		textField_1.setDocument(new KeyFieldControler());

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(128, 84, 59, 25);
		panel_1.add(textField_2);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setDocument(new KeyFieldControler());

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setBounds(128, 115, 59, 25);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		textField_3.setDocument(new KeyFieldControler());

		btnDefault.setEnabled(false);
		btnDefault.setBounds(5, 153, 92, 25);
		panel_1.add(btnDefault);
		btnDefault.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setText("5281");
				textField_1.setText("303");
				textField_2.setText("0.19");

				if(rdbtnEoq.isSelected() || rdbtnEoqAud.isSelected() || rdbtnEoqId.isSelected()){
					textField_3.setText("0.0");
				}

				else{
					textField_3.setText("5");
				}

			}
		});

		btnClear.setEnabled(false);
		btnClear.setBounds(96, 153, 92, 25);
		panel_1.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");

			}
		});

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Price Break Table", TitledBorder.LEADING, TitledBorder.TOP, null, null)));
		panel_2.setBounds(211, 13, 358, 394);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JRadioButton radioButton = new JRadioButton("k = 01");
		radioButton.setEnabled(false);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 1;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);


				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(false);
				label_12.setEnabled(false);
				label_13.setEnabled(false);
				label_14.setEnabled(false);
				label_15.setEnabled(false);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton.setBounds(6, 84, 65, 25);
		panel_2.add(radioButton);
		buttonGroup_1.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("k = 02");
		radioButton_1.setEnabled(false);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 2;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(false);
				label_13.setEnabled(false);
				label_14.setEnabled(false);
				label_15.setEnabled(false);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton_1.setBounds(6, 114, 65, 25);
		panel_2.add(radioButton_1);
		buttonGroup_1.add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("k = 03");
		radioButton_2.setEnabled(false);
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 3;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);	

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(false);
				label_14.setEnabled(false);
				label_15.setEnabled(false);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton_2.setBounds(6, 144, 65, 25);
		panel_2.add(radioButton_2);
		buttonGroup_1.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("k = 04");
		radioButton_3.setEnabled(false);
		radioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 4;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(false);
				label_15.setEnabled(false);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);



			}
		});
		radioButton_3.setBounds(6, 174, 65, 25);
		panel_2.add(radioButton_3);
		buttonGroup_1.add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("k = 05");
		radioButton_4.setEnabled(false);
		radioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 5;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(true);
				textField_21.setEnabled(true);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(true);
				label_15.setEnabled(false);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton_4.setBounds(6, 204, 65, 25);
		panel_2.add(radioButton_4);
		buttonGroup_1.add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton("k = 06");
		radioButton_5.setEnabled(false);
		radioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 6;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(false);
				textField_23.setEditable(true);
				textField_24.setEditable(true);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(true);
				textField_21.setEnabled(true);
				textField_22.setEnabled(false);
				textField_23.setEnabled(true);
				textField_24.setEnabled(true);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(true);
				label_15.setEnabled(true);
				label_16.setEnabled(false);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton_5.setBounds(6, 234, 65, 25);
		panel_2.add(radioButton_5);
		buttonGroup_1.add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton("k = 07");
		radioButton_6.setEnabled(false);
		radioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 7;
				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(false);
				textField_23.setEditable(true);
				textField_24.setEditable(true);
				textField_25.setEditable(false);
				textField_26.setEditable(true);
				textField_27.setEditable(true);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(true);
				textField_21.setEnabled(true);
				textField_22.setEnabled(false);
				textField_23.setEnabled(true);
				textField_24.setEnabled(true);
				textField_25.setEnabled(false);
				textField_26.setEnabled(true);
				textField_27.setEnabled(true);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(true);
				label_15.setEnabled(true);
				label_16.setEnabled(true);
				label_17.setEnabled(false);
				label_18.setEnabled(false);
			}
		});
		radioButton_6.setBounds(6, 264, 65, 25);
		panel_2.add(radioButton_6);
		buttonGroup_1.add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton("k = 08");
		radioButton_7.setEnabled(false);
		radioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 8;

				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(false);
				textField_23.setEditable(true);
				textField_24.setEditable(true);
				textField_25.setEditable(false);
				textField_26.setEditable(true);
				textField_27.setEditable(true);
				textField_28.setEditable(false);
				textField_29.setEditable(true);
				textField_30.setEditable(true);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);	

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(true);
				textField_21.setEnabled(true);
				textField_22.setEnabled(false);
				textField_23.setEnabled(true);
				textField_24.setEnabled(true);
				textField_25.setEnabled(false);
				textField_26.setEnabled(true);
				textField_27.setEnabled(true);
				textField_28.setEnabled(false);
				textField_29.setEnabled(true);
				textField_30.setEnabled(true);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(true);
				label_15.setEnabled(true);
				label_16.setEnabled(true);
				label_17.setEnabled(true);
				label_18.setEnabled(false);


			}
		});
		radioButton_7.setBounds(6, 294, 65, 25);
		panel_2.add(radioButton_7);
		buttonGroup_1.add(radioButton_7);

		JRadioButton radioButton_8 = new JRadioButton("k = 09");
		radioButton_8.setEnabled(false);
		radioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				krdbutton = 9;

				textField_5.setEditable(true);
				textField_6.setEditable(true);
				textField_7.setEditable(false);
				textField_8.setEditable(true);
				textField_9.setEditable(true);
				textField_10.setEditable(false);
				textField_11.setEditable(true);
				textField_12.setEditable(true);
				textField_13.setEditable(false);
				textField_14.setEditable(true);
				textField_15.setEditable(true);
				textField_16.setEditable(false);
				textField_17.setEditable(true);
				textField_18.setEditable(true);
				textField_19.setEditable(false);
				textField_20.setEditable(true);
				textField_21.setEditable(true);
				textField_22.setEditable(false);
				textField_23.setEditable(true);
				textField_24.setEditable(true);
				textField_25.setEditable(false);
				textField_26.setEditable(true);
				textField_27.setEditable(true);
				textField_28.setEditable(false);
				textField_29.setEditable(true);
				textField_30.setEditable(true);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(true);	

				textField_5.setEnabled(true);
				textField_6.setEnabled(true);
				textField_7.setEnabled(false);
				textField_8.setEnabled(true);
				textField_9.setEnabled(true);
				textField_10.setEnabled(false);
				textField_11.setEnabled(true);
				textField_12.setEnabled(true);
				textField_13.setEnabled(false);
				textField_14.setEnabled(true);
				textField_15.setEnabled(true);
				textField_16.setEnabled(false);
				textField_17.setEnabled(true);
				textField_18.setEnabled(true);
				textField_19.setEnabled(false);
				textField_20.setEnabled(true);
				textField_21.setEnabled(true);
				textField_22.setEnabled(false);
				textField_23.setEnabled(true);
				textField_24.setEnabled(true);
				textField_25.setEnabled(false);
				textField_26.setEnabled(true);
				textField_27.setEnabled(true);
				textField_28.setEnabled(false);
				textField_29.setEnabled(true);
				textField_30.setEnabled(true);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(true);	

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				label_10.setEnabled(true);
				label_11.setEnabled(true);
				label_12.setEnabled(true);
				label_13.setEnabled(true);
				label_14.setEnabled(true);
				label_15.setEnabled(true);
				label_16.setEnabled(true);
				label_17.setEnabled(true);
				label_18.setEnabled(true);
			}
		});
		radioButton_8.setBounds(6, 324, 65, 25);
		panel_2.add(radioButton_8);
		buttonGroup_1.add(radioButton_8);

		label_9.setEnabled(false);
		label_9.setBounds(146, 54, 65, 25);
		panel_2.add(label_9);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setBounds(79, 54, 65, 25);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setDocument(new KeyFieldControler());
		textField_4.setText("1");

		textField_5 = new JTextField();
		textField_5.setEnabled(false);
		textField_5.setEditable(false);
		textField_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if(!textField_5.getText().trim().equals("\u221E")){
					textField_5.getText();
					textField_7.setText(textField_5.getText());
					textField_7.setEditable(false);
				}
				if(krdbutton == 1 && !textField_7.getText().trim().equals("")){		
					textField_8.setText("\u221E");
					textField_8.setEditable(false);
				}
			}
		});
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setBounds(210, 54, 65, 25);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		textField_5.setDocument(new KeyFieldControler());

		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setEditable(false);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(287, 54, 65, 25);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		textField_6.setDocument(new KeyFieldControler());

		label_4.setEnabled(false);
		label_4.setBounds(6, 24, 65, 25);
		panel_2.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_5.setEnabled(false);
		label_5.setBounds(79, 24, 65, 25);
		panel_2.add(label_5);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_6.setEnabled(false);
		label_6.setBounds(146, 24, 65, 25);
		panel_2.add(label_6);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_7.setEnabled(false);
		label_7.setBounds(210, 24, 65, 25);
		panel_2.add(label_7);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_8.setEnabled(false);
		label_8.setBounds(287, 24, 65, 25);
		panel_2.add(label_8);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setEditable(false);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setBounds(79, 84, 65, 25);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		textField_7.setDocument(new KeyFieldControler());

		label_10.setEnabled(false);
		label_10.setBounds(146, 84, 65, 25);
		panel_2.add(label_10);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setEditable(false);
		textField_8.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if(!textField_8.getText().trim().equals("\u221E")){
					textField_8.getText();
					textField_10.setText(textField_8.getText());
					textField_10.setEditable(false);
				}
				if(krdbutton == 2 && !textField_10.getText().trim().equals("")){		
					textField_11.setText("\u221E");
					textField_11.setEditable(false);
				}
			}
		});
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setBounds(210, 84, 65, 25);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		textField_8.setDocument(new KeyFieldControler());

		textField_9 = new JTextField();
		textField_9.setEnabled(false);
		textField_9.setEditable(false);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setBounds(287, 84, 65, 25);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		textField_9.setDocument(new KeyFieldControler());

		textField_10 = new JTextField();
		textField_10.setEnabled(false);
		textField_10.setEditable(false);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setBounds(79, 114, 65, 25);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		textField_10.setDocument(new KeyFieldControler());

		label_11.setEnabled(false);
		label_11.setBounds(146, 114, 65, 25);
		panel_2.add(label_11);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_11 = new JTextField();
		textField_11.setEnabled(false);
		textField_11.setEditable(false);
		textField_11.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {

				if(!textField_11.getText().trim().equals("\u221E")){
					textField_11.getText();
					textField_13.setText(textField_11.getText());
					textField_13.setEditable(false);
				}
				if(krdbutton == 3 && !textField_13.getText().trim().equals("")){		
					textField_14.setText("\u221E");
					textField_14.setEditable(false);
				}
			}
		});
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setBounds(210, 114, 65, 25);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		textField_11.setDocument(new KeyFieldControler());

		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setEditable(false);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setBounds(287, 114, 65, 25);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		textField_12.setDocument(new KeyFieldControler());

		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setEditable(false);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setBounds(79, 144, 65, 25);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		textField_13.setDocument(new KeyFieldControler());

		label_12.setEnabled(false);
		label_12.setBounds(146, 144, 65, 25);
		panel_2.add(label_12);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setEditable(false);
		textField_14.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_14.getText().trim().equals("\u221E")){
					textField_14.getText();
					textField_16.setText(textField_14.getText());
					textField_16.setEditable(false);
				}
				if(krdbutton == 4 && !textField_16.getText().trim().equals("")){		
					textField_17.setText("\u221E");
					textField_17.setEditable(false);
				}
			}
		});
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setBounds(210, 144, 65, 25);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		textField_14.setDocument(new KeyFieldControler());

		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setEditable(false);
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setBounds(287, 144, 65, 25);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		textField_15.setDocument(new KeyFieldControler());

		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setEditable(false);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setBounds(79, 174, 65, 25);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
		textField_16.setDocument(new KeyFieldControler());

		label_13.setEnabled(false);
		label_13.setBounds(146, 174, 65, 25);
		panel_2.add(label_13);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setEditable(false);
		textField_17.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_17.getText().trim().equals("\u221E")){
					textField_17.getText();
					textField_19.setText(textField_17.getText());
					textField_19.setEditable(false);
				}
				if(krdbutton == 5 && !textField_19.getText().trim().equals("")){		
					textField_20.setText("\u221E");
					textField_20.setEditable(false);
				}
			}
		});
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setBounds(210, 174, 65, 25);
		panel_2.add(textField_17);
		textField_17.setColumns(10);
		textField_17.setDocument(new KeyFieldControler());

		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setEditable(false);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setBounds(287, 174, 65, 25);
		panel_2.add(textField_18);
		textField_18.setColumns(10);
		textField_18.setDocument(new KeyFieldControler());

		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setEditable(false);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setBounds(79, 204, 65, 25);
		panel_2.add(textField_19);
		textField_19.setColumns(10);
		textField_19.setDocument(new KeyFieldControler());

		label_14.setEnabled(false);
		label_14.setBounds(146, 204, 65, 25);
		panel_2.add(label_14);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setEditable(false);
		textField_20.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_20.getText().trim().equals("\u221E")){
					textField_20.getText();
					textField_22.setText(textField_20.getText());
					textField_22.setEditable(false);
				}
				if(krdbutton == 6 && !textField_22.getText().trim().equals("")){		
					textField_23.setText("\u221E");
					textField_23.setEditable(false);
				}
			}
		});
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setBounds(210, 204, 65, 25);
		panel_2.add(textField_20);
		textField_20.setColumns(10);
		textField_20.setDocument(new KeyFieldControler());

		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setEditable(false);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setBounds(287, 204, 65, 25);
		panel_2.add(textField_21);
		textField_21.setColumns(10);
		textField_21.setDocument(new KeyFieldControler());

		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setEditable(false);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setBounds(79, 234, 65, 25);
		panel_2.add(textField_22);
		textField_22.setColumns(10);
		textField_22.setDocument(new KeyFieldControler());

		textField_23 = new JTextField();
		textField_23.setEnabled(false);
		textField_23.setEditable(false);
		textField_23.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_23.getText().trim().equals("\u221E")){
					textField_23.getText();
					textField_25.setText(textField_23.getText());
					textField_25.setEditable(false);
				}
				if(krdbutton == 7 && !textField_25.getText().trim().equals("")){		
					textField_26.setText("\u221E");
					textField_26.setEditable(false);
				}
			}
		});
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setBounds(210, 234, 65, 25);
		panel_2.add(textField_23);
		textField_23.setColumns(10);
		textField_23.setDocument(new KeyFieldControler());

		textField_24 = new JTextField();
		textField_24.setEnabled(false);
		textField_24.setEditable(false);
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setBounds(287, 234, 65, 25);
		panel_2.add(textField_24);
		textField_24.setColumns(10);
		textField_24.setDocument(new KeyFieldControler());

		textField_25 = new JTextField();
		textField_25.setEnabled(false);
		textField_25.setEditable(false);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setBounds(79, 264, 65, 25);
		panel_2.add(textField_25);
		textField_25.setColumns(10);
		textField_25.setDocument(new KeyFieldControler());

		label_18.setEnabled(false);
		label_18.setBounds(146, 324, 65, 25);
		panel_2.add(label_18);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_17.setEnabled(false);
		label_17.setBounds(146, 294, 65, 25);
		panel_2.add(label_17);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_16.setEnabled(false);
		label_16.setBounds(146, 264, 65, 25);
		panel_2.add(label_16);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 13));

		label_15.setEnabled(false);
		label_15.setBounds(146, 234, 65, 25);
		panel_2.add(label_15);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 13));

		textField_26 = new JTextField();
		textField_26.setEnabled(false);
		textField_26.setEditable(false);
		textField_26.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_26.getText().trim().equals("\u221E")){
					textField_26.getText();
					textField_28.setText(textField_26.getText());
					textField_28.setEditable(false);
				}
				if(krdbutton == 8 && !textField_28.getText().trim().equals("")){		
					textField_29.setText("\u221E");
					textField_29.setEditable(false);
				}
			}
		});
		textField_26.setBounds(210, 264, 65, 25);
		panel_2.add(textField_26);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setDocument(new KeyFieldControler());

		textField_27 = new JTextField();
		textField_27.setEnabled(false);
		textField_27.setEditable(false);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setBounds(287, 264, 65, 25);
		panel_2.add(textField_27);
		textField_27.setColumns(10);
		textField_27.setDocument(new KeyFieldControler());

		textField_28 = new JTextField();
		textField_28.setEnabled(false);
		textField_28.setEditable(false);
		textField_28.setHorizontalAlignment(SwingConstants.CENTER);
		textField_28.setBounds(79, 294, 65, 25);
		panel_2.add(textField_28);
		textField_28.setColumns(10);
		textField_28.setDocument(new KeyFieldControler());

		textField_29 = new JTextField();
		textField_29.setEnabled(false);
		textField_29.setEditable(false);
		textField_29.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!textField_29.getText().trim().equals("\u221E")){
					textField_29.getText();
					textField_31.setText(textField_29.getText());
					textField_31.setEditable(false);
				}
				if(krdbutton == 9 && !textField_31.getText().trim().equals("")){		
					textField_32.setText("\u221E");
					textField_32.setEditable(false);
				}
			}
		});
		textField_29.setHorizontalAlignment(SwingConstants.CENTER);
		textField_29.setBounds(210, 294, 65, 25);
		panel_2.add(textField_29);
		textField_29.setColumns(10);
		textField_29.setDocument(new KeyFieldControler());

		textField_30 = new JTextField();
		textField_30.setEnabled(false);
		textField_30.setEditable(false);
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setBounds(287, 294, 65, 25);
		panel_2.add(textField_30);
		textField_30.setColumns(10);
		textField_30.setDocument(new KeyFieldControler());

		textField_31 = new JTextField();
		textField_31.setEnabled(false);
		textField_31.setEditable(false);
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setBounds(79, 324, 65, 25);
		panel_2.add(textField_31);
		textField_31.setColumns(10);
		textField_31.setDocument(new KeyFieldControler());

		textField_32 = new JTextField();
		textField_32.setEnabled(false);
		textField_32.setEditable(false);
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setBounds(210, 324, 65, 25);
		panel_2.add(textField_32);
		textField_32.setColumns(10);
		textField_32.setDocument(new KeyFieldControler());

		textField_33 = new JTextField();
		textField_33.setEnabled(false);
		textField_33.setEditable(false);
		textField_33.setBounds(287, 324, 65, 25);
		panel_2.add(textField_33);
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setColumns(10);
		textField_33.setDocument(new KeyFieldControler());

		lblK.setEnabled(false);
		lblK.setBounds(25, 54, 37, 25);
		panel_2.add(lblK);
		lblK.setHorizontalAlignment(SwingConstants.CENTER);
		lblK.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnDefault_1.setEnabled(false);
		btnDefault_1.setBounds(79, 362, 92, 25);
		panel_2.add(btnDefault_1);

		btnClear_1.setEnabled(false);
		btnClear_1.setBounds(183, 362, 92, 25);
		panel_2.add(btnClear_1);
		btnClear_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");
			}
		});
		btnDefault_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (krdbutton){
				case 0:
					textField_5.setText("\u221E");
					textField_6.setText("1.00");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_5.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);


					break;
				case 1:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("\u221E");
					textField_9.setText("0.95");
					textField_10.setText("");
					textField_11.setText("");
					textField_12.setText("");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_8.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 2:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("\u221E");
					textField_12.setText("0.90");
					textField_13.setText("");
					textField_14.setText("");
					textField_15.setText("");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_11.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 3:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("\u221E");
					textField_15.setText("0.85");
					textField_16.setText("");
					textField_17.setText("");
					textField_18.setText("");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_14.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 4:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("\u221E");
					textField_18.setText("0.80");
					textField_19.setText("");
					textField_20.setText("");
					textField_21.setText("");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_17.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 5:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("49000");
					textField_18.setText("0.80");
					textField_19.setText("49000");
					textField_20.setText("\u221E");
					textField_21.setText("0.75");
					textField_22.setText("");
					textField_23.setText("");
					textField_24.setText("");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_20.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 6:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("49000");
					textField_18.setText("0.80");
					textField_19.setText("49000");
					textField_20.setText("55000");
					textField_21.setText("0.75");
					textField_22.setText("55000");
					textField_23.setText("\u221E");
					textField_24.setText("0.70");
					textField_25.setText("");
					textField_26.setText("");
					textField_27.setText("");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_23.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 7:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("49000");
					textField_18.setText("0.80");
					textField_19.setText("49000");
					textField_20.setText("55000");
					textField_21.setText("0.75");
					textField_22.setText("55000");
					textField_23.setText("56000");
					textField_24.setText("0.70");
					textField_25.setText("56000");
					textField_26.setText("\u221E");
					textField_27.setText("0.65");
					textField_28.setText("");
					textField_29.setText("");
					textField_30.setText("");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_26.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 8:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("49000");
					textField_18.setText("0.80");
					textField_19.setText("49000");
					textField_20.setText("55000");
					textField_21.setText("0.75");
					textField_22.setText("55000");
					textField_23.setText("56000");
					textField_24.setText("0.70");
					textField_25.setText("56000");
					textField_26.setText("57000");
					textField_27.setText("0.65");
					textField_28.setText("57000");
					textField_29.setText("\u221E");
					textField_30.setText("0.60");
					textField_31.setText("");
					textField_32.setText("");
					textField_33.setText("");

					textField_29.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;
				case 9:
					textField_5.setText("10000");
					textField_6.setText("1.00");
					textField_7.setText("10000");
					textField_8.setText("25000");
					textField_9.setText("0.95");
					textField_10.setText("25000");
					textField_11.setText("45000");
					textField_12.setText("0.90");
					textField_13.setText("45000");
					textField_14.setText("48000");
					textField_15.setText("0.85");
					textField_16.setText("48000");
					textField_17.setText("49000");
					textField_18.setText("0.80");
					textField_19.setText("49000");
					textField_20.setText("55000");
					textField_21.setText("0.75");
					textField_22.setText("55000");
					textField_23.setText("56000");
					textField_24.setText("0.70");
					textField_25.setText("56000");
					textField_26.setText("57000");
					textField_27.setText("0.65");
					textField_28.setText("57000");
					textField_29.setText("60000");
					textField_30.setText("0.60");
					textField_31.setText("60000");
					textField_32.setText("\u221E");
					textField_33.setText("0.55");

					textField_32.setEditable(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					break;

				case 10:

					break;

				}
			}
		});

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Simulated Annealing", TitledBorder.LEADING, TitledBorder.TOP, null, null)));
		panel_3.setBounds(581, 13, 193, 209);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);

		lblOuterLoop.setEnabled(false);
		lblOuterLoop.setBounds(12, 25, 95, 16);
		panel_3.add(lblOuterLoop);

		lblInnerLoop.setEnabled(false);
		lblInnerLoop.setBounds(12, 65, 95, 16);
		panel_3.add(lblInnerLoop);

		textField_34 = new JTextField();
		textField_34.setEnabled(false);
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setBounds(116, 25, 65, 25);
		panel_3.add(textField_34);
		textField_34.setColumns(10);
		textField_34.setDocument(new KeyFieldControler());

		textField_35 = new JTextField();
		textField_35.setEnabled(false);
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setBounds(116, 64, 65, 25);
		panel_3.add(textField_35);
		textField_35.setColumns(10);
		textField_35.setDocument(new KeyFieldControler());

		lblInitialT.setEnabled(false);
		lblInitialT.setBounds(12, 102, 95, 16);
		panel_3.add(lblInitialT);

		textField_36 = new JTextField();
		textField_36.setEnabled(false);
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setBounds(116, 101, 65, 25);
		panel_3.add(textField_36);
		textField_36.setColumns(10);
		textField_36.setDocument(new KeyFieldControler());

		btnStart.setEnabled(false);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_34.getText().trim().equals("") || textField_34.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Outter Loop ( i )  ]   field is empty or invalid");

				}
				else if(textField_35.getText().trim().equals("") || textField_35.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Inner Loop ( j )  ]   field is empty or invalid");
				}
				else if(textField_36.getText().trim().equals("") || textField_36.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Temperature  ]   field is empty or invalid");
				}
				else{	

					SimulatedAnnealing solution= new SimulatedAnnealing();

					double D = Double.parseDouble(textField.getText());
					double A = Double.parseDouble(textField_1.getText());
					double I = Double.parseDouble(textField_2.getText());
					double UBC = Double.parseDouble(textField_3.getText());
					double iMax = Double.parseDouble(textField_34.getText());
					double jMax = Double.parseDouble(textField_35.getText());
					double t0 = Double.parseDouble(textField_36.getText());

					double C[] = new double[10];
					double U[] = new double[10];
					double L[] = new double[10];


					switch(krdbutton){

					case 0:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = 1_000;
						C[2] = 1_000;
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = 1_000_000_000;
						U[1] = 1_000_000_001;
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = 1_000_000_000;
						L[2] = 1_000_000_001;
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 1:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = 1_000;
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = 1_000_000_001;
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = 1_000_000_001;
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 2:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 3:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 4:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 5:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 6:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 7:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 8:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = Double.parseDouble(textField_30.getText());
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = Double.parseDouble(textField_26.getText());
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = Double.parseDouble(textField_28.getText());
						L[9] = 1_000_000_008;
						break;
					case 9:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = Double.parseDouble(textField_30.getText());
						C[9] = Double.parseDouble(textField_33.getText());

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = Double.parseDouble(textField_26.getText());
						U[8] = Double.parseDouble(textField_29.getText());
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = Double.parseDouble(textField_28.getText());
						L[9] = Double.parseDouble(textField_31.getText());

						break;
					}

					solution.setD(D);
					solution.setA(A);
					solution.setI(I);
					solution.setUBC(UBC);
					solution.setK(ktype);
					solution.setIMax(iMax);
					solution.setJMax(jMax);
					solution.setT0(t0);
					solution.setC(C);
					solution.setU(U);
					solution.setL(L);


					solution.algorithmCalc();

				}
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStart.setForeground(Color.BLACK);
		btnStart.setBackground(UIManager.getColor("controlShadow"));
		btnStart.setBounds(5, 139, 184, 25);
		panel_3.add(btnStart);

		btnDefault_2.setEnabled(false);
		btnDefault_2.setBounds(5, 177, 92, 25);
		panel_3.add(btnDefault_2);

		btnClear_2.setEnabled(false);
		btnClear_2.setBounds(96, 177, 92, 25);
		panel_3.add(btnClear_2);
		btnClear_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_34.setText("");
				textField_35.setText("");
				textField_36.setText("");
			}
		});
		btnDefault_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_34.setText("1000");
				textField_35.setText("900");
				textField_36.setText("1");
			}
		});

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Plotter", TitledBorder.LEADING, TitledBorder.TOP, null, null)));
		panel_4.setBounds(581, 235, 193, 172);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);

		lblStart.setEnabled(false);
		lblStart.setBounds(25, 36, 86, 16);
		panel_4.add(lblStart);

		textField_37 = new JTextField();
		textField_37.setEnabled(false);
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setBounds(116, 31, 65, 25);
		panel_4.add(textField_37);
		textField_37.setColumns(10);
		textField_37.setDocument(new KeyFieldControler());

		lblEnd.setEnabled(false);
		lblEnd.setBounds(25, 69, 86, 16);
		panel_4.add(lblEnd);

		textField_38 = new JTextField();
		textField_38.setEnabled(false);
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setBounds(116, 64, 65, 25);
		panel_4.add(textField_38);
		textField_38.setColumns(10);
		textField_38.setDocument(new KeyFieldControler());

		btnLoadEoqPlotter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLoadEoqPlotter.setEnabled(false);
		btnLoadEoqPlotter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if(textField_37.getText().trim().equals("") || textField_37.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Initial Q value  ]   field is empty or invalid");

				}
				else if(textField_38.getText().trim().equals("") || textField_38.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Final Q value  ]   field is empty or invalid");
				}

				else if ( Double.parseDouble(textField_37.getText()) >= Double.parseDouble(textField_38.getText())){
					JOptionPane.showMessageDialog(null, "[  Initial Q Value  ]  must be greater than  [  Final Q Value  ]");
				}
				else{

					JFreeChartEOQGraph eoqGraph = new JFreeChartEOQGraph("EOQ Plotter");

					origin = Integer.parseInt(textField_37.getText());
					end = Integer.parseInt(textField_38.getText());

					double D = Double.parseDouble(textField.getText());
					double A = Double.parseDouble(textField_1.getText());
					double I = Double.parseDouble(textField_2.getText());
					double UBC = Double.parseDouble(textField_3.getText());

					double C[] = new double[10];
					double U[] = new double[10];
					double L[] = new double[10];


					switch(krdbutton){

					case 0:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = 1_000;
						C[2] = 1_000;
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = 1_000_000_000;
						U[1] = 1_000_000_001;
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = 1_000_000_000;
						L[2] = 1_000_000_001;
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 1:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = 1_000;
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = 1_000_000_001;
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = 1_000_000_001;
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 2:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = 1_000;
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = 1_000_000_002;
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = 1_000_000_002;
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 3:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = 1_000;
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = 1_000_000_003;
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = 1_000_000_003;
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 4:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = 1_000;
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = 1_000_000_004;
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = 1_000_000_004;
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 5:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = 1_000;
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = 1_000_000_005;
						U[6] = 1_000_000_006;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = 1_000_000_005;
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 6:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = 1_000;
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = 1_000_000_007;
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = 1_000_000_006;
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 7:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = 1_000;
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = 1_000_000_007;
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = 1_000_000_007;
						L[9] = 1_000_000_008;
						break;
					case 8:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = Double.parseDouble(textField_30.getText());
						C[9] = 1_000;

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = Double.parseDouble(textField_26.getText());
						U[8] = 1_000_000_008;
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = Double.parseDouble(textField_28.getText());
						L[9] = 1_000_000_008;
						break;
					case 9:
						C[0] = Double.parseDouble(textField_6.getText());
						C[1] = Double.parseDouble(textField_9.getText());
						C[2] = Double.parseDouble(textField_12.getText());
						C[3] = Double.parseDouble(textField_15.getText());
						C[4] = Double.parseDouble(textField_18.getText());
						C[5] = Double.parseDouble(textField_21.getText());
						C[6] = Double.parseDouble(textField_24.getText());
						C[7] = Double.parseDouble(textField_27.getText());
						C[8] = Double.parseDouble(textField_30.getText());
						C[9] = Double.parseDouble(textField_33.getText());

						U[0] = Double.parseDouble(textField_5.getText());
						U[1] = Double.parseDouble(textField_8.getText());
						U[2] = Double.parseDouble(textField_11.getText());
						U[3] = Double.parseDouble(textField_14.getText());
						U[4] = Double.parseDouble(textField_17.getText());
						U[5] = Double.parseDouble(textField_20.getText());
						U[6] = Double.parseDouble(textField_23.getText());
						U[7] = Double.parseDouble(textField_26.getText());
						U[8] = Double.parseDouble(textField_29.getText());
						U[9] = 1_000_000_009;

						L[0] = 1;
						L[1] = Double.parseDouble(textField_7.getText());
						L[2] = Double.parseDouble(textField_10.getText());
						L[3] = Double.parseDouble(textField_13.getText());
						L[4] = Double.parseDouble(textField_16.getText());
						L[5] = Double.parseDouble(textField_19.getText());
						L[6] = Double.parseDouble(textField_22.getText());
						L[7] = Double.parseDouble(textField_25.getText());
						L[8] = Double.parseDouble(textField_28.getText());
						L[9] = Double.parseDouble(textField_31.getText());

						break;
					}
					eoqGraph.setD(D);
					eoqGraph.setA(A);
					eoqGraph.setI(I);
					eoqGraph.setUBC(UBC);
					eoqGraph.setK(ktype);
					eoqGraph.setC(C);
					eoqGraph.setU(U);
					eoqGraph.setL(L);
					eoqGraph.setOrigin(origin);
					eoqGraph.setEnd(end);
					eoqGraph.pack();
					eoqGraph.setVisible(true);

				}
			}
		});


		btnLoadEoqPlotter.setBounds(5, 102, 184, 25);
		btnLoadEoqPlotter.setForeground(Color.BLACK);
		btnLoadEoqPlotter.setBackground(UIManager.getColor("controlShadow"));
		panel_4.add(btnLoadEoqPlotter);

		btnDefault_3.setEnabled(false);
		btnDefault_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_37.setText("800");
				textField_38.setText("80000");

			}
		});
		btnDefault_3.setBounds(5, 140, 92, 25);
		panel_4.add(btnDefault_3);

		btnClear_3.setEnabled(false);
		btnClear_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_37.setText("");
				textField_37.setText("");
			}
		});
		btnClear_3.setBounds(96, 140, 92, 25);
		panel_4.add(btnClear_3);

		btnNext.setEnabled(false);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//character

				if(textField.getText().trim().equals("") && textField_3.isEnabled() || textField.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Annual Demand (D)  ]   field is empty or invalid");

				}
				else if(textField_1.getText().trim().equals("") && textField_3.isEnabled() || textField_1.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Order Cost (A)  ]   field is empty or invalid");
				}
				else if(textField_2.getText().trim().equals("") && textField_3.isEnabled() || textField_2.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Hold Cost (i)  ]   field is empty or invalid");
				}
				else if(textField_3.getText().trim().equals("") && textField_3.isEditable() || textField_3.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Backorder Cost (Cb)  ]   field is empty or invalid");
				}
				else{
					rdbtnEoq.setEnabled(false);
					rdbtnEoqB.setEnabled(false);
					rdbtnEoqAudB.setEnabled(false);
					rdbtnEoqAud.setEnabled(false);
					rdbtnEoqId.setEnabled(false);
					rdbtnEoqIdB.setEnabled(false);

					label_1.setEnabled(false);
					label_2.setEnabled(false);
					label.setEnabled(false);
					label_3.setEnabled(false);

					textField.setEditable(false);
					textField_1.setEditable(false);
					textField_2.setEditable(false);
					textField_3.setEditable(false);

					btnDefault.setEnabled(false);
					btnClear.setEnabled(false);

					btnNext.setEnabled(false);
					btnBack.setEnabled(true);
					btnNext_1.setEnabled(true);

					label_9.setEnabled(true);
					label_4.setEnabled(true);
					label_5.setEnabled(true);
					label_6.setEnabled(true);
					label_7.setEnabled(true);
					label_8.setEnabled(true);
					label_10.setEnabled(true);
					label_11.setEnabled(true);
					label_12.setEnabled(true);
					label_13.setEnabled(true);
					label_14.setEnabled(true);
					label_18.setEnabled(true);
					label_17.setEnabled(true);
					label_16.setEnabled(true);
					label_15.setEnabled(true);

					lblK.setEnabled(true);

					lblOuterLoop.setEnabled(false);
					lblInnerLoop.setEnabled(false);
					lblInitialT.setEnabled(false);

					lblOuterLoop.setEnabled(false);
					lblInnerLoop.setEnabled(false);
					lblInitialT.setEnabled(false);
					btnStart.setEnabled(false);
					btnDefault_2.setEnabled(false);
					btnClear_2.setEnabled(false);
					lblStart.setEnabled(false);
					lblEnd.setEnabled(false);
					btnLoadEoqPlotter.setEnabled(false);
					btnDefault_3.setEnabled(false);
					btnClear_3.setEnabled(false);

					textField_34.setText("");
					textField_35.setText("");
					textField_36.setText("");
					textField_37.setText("");
					textField_38.setText("");

					textField_34.setEnabled(false);
					textField_35.setEnabled(false);
					textField_36.setEnabled(false);
					textField_37.setEnabled(false);
					textField_38.setEnabled(false);

					btnDefault_1.setEnabled(true);
					btnClear_1.setEnabled(true);

					if (textField_6.isEditable()){
						textField_6.setEnabled(true);
						label_10.setEnabled(false);
						label_11.setEnabled(false);
						label_12.setEnabled(false);
						label_13.setEnabled(false);
						label_14.setEnabled(false);
						label_18.setEnabled(false);
						label_17.setEnabled(false);
						label_16.setEnabled(false);
						label_15.setEnabled(false);
						Enumeration<AbstractButton> elements = buttonGroup_1.getElements();
						while (elements.hasMoreElements()) {
							AbstractButton button = (AbstractButton)elements.nextElement();
							if (button.isVisible()) {
								button.setEnabled(false);
							}
						}
					}
					else{
						Enumeration<AbstractButton> elements = buttonGroup_1.getElements();
						while (elements.hasMoreElements()) {
							AbstractButton button = (AbstractButton)elements.nextElement();
							if (button.isVisible()) {
								button.setEnabled(true);
							}
						}
					}

				}
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNext.setBounds(6, 419, 193, 25);
		getContentPane().add(btnNext);

		btnBack.setEnabled(false);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnNext.setEnabled(false);
				btnBack.setEnabled(false);
				btnNext_1.setEnabled(false);

				rdbtnEoq.setEnabled(true);
				rdbtnEoqB.setEnabled(true);
				rdbtnEoqAudB.setEnabled(true);
				rdbtnEoqAud.setEnabled(true);
				rdbtnEoqId.setEnabled(true);
				rdbtnEoqIdB.setEnabled(true);

				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();

				label_1.setEnabled(false);
				label_2.setEnabled(false);
				label.setEnabled(false);
				label_3.setEnabled(false);

				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");


				btnDefault.setEnabled(false);
				btnClear.setEnabled(false);

				Enumeration<AbstractButton> elements = buttonGroup_1.getElements();
				while (elements.hasMoreElements()) {
					AbstractButton button = (AbstractButton)elements.nextElement();
					if (button.isVisible()) {
						button.setEnabled(false);
					}
				}

				label_9.setEnabled(false);
				label_4.setEnabled(false);
				label_5.setEnabled(false);
				label_6.setEnabled(false);
				label_7.setEnabled(false);
				label_8.setEnabled(false);
				label_10.setEnabled(false);
				label_11.setEnabled(false);
				label_12.setEnabled(false);
				label_13.setEnabled(false);
				label_14.setEnabled(false);
				label_18.setEnabled(false);
				label_17.setEnabled(false);
				label_16.setEnabled(false);
				label_15.setEnabled(false);

				lblK.setEnabled(false);


				textField_5.setEnabled(false);
				textField_6.setEnabled(false);
				textField_7.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);
				textField_10.setEnabled(false);
				textField_11.setEnabled(false);
				textField_12.setEnabled(false);
				textField_13.setEnabled(false);
				textField_14.setEnabled(false);
				textField_15.setEnabled(false);
				textField_16.setEnabled(false);
				textField_17.setEnabled(false);
				textField_18.setEnabled(false);
				textField_19.setEnabled(false);
				textField_20.setEnabled(false);
				textField_21.setEnabled(false);
				textField_22.setEnabled(false);
				textField_23.setEnabled(false);
				textField_24.setEnabled(false);
				textField_25.setEnabled(false);
				textField_26.setEnabled(false);
				textField_27.setEnabled(false);
				textField_28.setEnabled(false);
				textField_29.setEnabled(false);
				textField_30.setEnabled(false);
				textField_31.setEnabled(false);
				textField_32.setEnabled(false);
				textField_33.setEnabled(false);	

				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);	

				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				lblOuterLoop.setEnabled(false);
				lblInnerLoop.setEnabled(false);
				lblInitialT.setEnabled(false);

				lblOuterLoop.setEnabled(false);
				lblInnerLoop.setEnabled(false);
				lblInitialT.setEnabled(false);
				btnStart.setEnabled(false);
				btnDefault_2.setEnabled(false);
				btnClear_2.setEnabled(false);
				lblStart.setEnabled(false);
				lblEnd.setEnabled(false);
				btnLoadEoqPlotter.setEnabled(false);
				btnDefault_3.setEnabled(false);
				btnClear_3.setEnabled(false);

				textField_34.setText("");
				textField_35.setText("");
				textField_36.setText("");
				textField_37.setText("");
				textField_38.setText("");

				textField_34.setEnabled(false);
				textField_35.setEnabled(false);
				textField_36.setEnabled(false);
				textField_37.setEnabled(false);
				textField_38.setEnabled(false);

				btnDefault_1.setEnabled(false);
				btnClear_1.setEnabled(false);

			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack.setBounds(211, 419, 175, 25);
		getContentPane().add(btnBack);

		btnBack_1.setEnabled(false);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				btnNext.setEnabled(false);
				btnBack_1.setEnabled(false);
				btnBack.setEnabled(true);
				btnNext_1.setEnabled(true);

				Enumeration<AbstractButton> elements = buttonGroup_1.getElements();
				while (elements.hasMoreElements()) {
					AbstractButton button = (AbstractButton)elements.nextElement();
					if (button.isVisible() && !textField_7.getText().trim().equals("")) {
						button.setEnabled(true);
					}
				}

				if (!textField_7.getText().trim().equals("")) {
					label_9.setEnabled(true);
					label_4.setEnabled(true);
					label_5.setEnabled(true);
					label_6.setEnabled(true);
					label_7.setEnabled(true);
					label_8.setEnabled(true);
					label_10.setEnabled(true);
					label_11.setEnabled(true);
					label_12.setEnabled(true);
					label_13.setEnabled(true);
					label_14.setEnabled(true);
					label_18.setEnabled(true);
					label_17.setEnabled(true);
					label_16.setEnabled(true);
					label_15.setEnabled(true);

					textField_5.setText("");
				}
				else{
					label_9.setEnabled(true);
					label_4.setEnabled(true);
					label_5.setEnabled(true);
					label_6.setEnabled(true);
					label_7.setEnabled(true);
					label_8.setEnabled(true);
					label_10.setEnabled(false);
					label_11.setEnabled(false);
					label_12.setEnabled(false);
					label_13.setEnabled(false);
					label_14.setEnabled(false);
					label_18.setEnabled(false);
					label_17.setEnabled(false);
					label_16.setEnabled(false);
					label_15.setEnabled(false);

					textField_5.setText("\u221E");
					textField_6.setEnabled(true);
					textField_6.setEditable(true);

					lblK.setEnabled(true);
				}

				textField_7.setEnabled(true);
				textField_10.setEnabled(true);
				textField_13.setEnabled(true);
				textField_16.setEnabled(true);
				textField_19.setEnabled(true);
				textField_22.setEnabled(true);
				textField_25.setEnabled(true);
				textField_28.setEnabled(true);
				textField_31.setEnabled(true);
				textField_32.setEnabled(true);

				textField_5.setEditable(false);
				//				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);
				textField_18.setEditable(false);
				textField_19.setEditable(false);
				textField_20.setEditable(false);
				textField_21.setEditable(false);
				textField_22.setEditable(false);
				textField_23.setEditable(false);
				textField_24.setEditable(false);
				textField_25.setEditable(false);
				textField_26.setEditable(false);
				textField_27.setEditable(false);
				textField_28.setEditable(false);
				textField_29.setEditable(false);
				textField_30.setEditable(false);
				textField_31.setEditable(false);
				textField_32.setEditable(false);
				textField_33.setEditable(false);	

				buttonGroup_1.clearSelection();

				//				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");	
				textField_25.setText("");
				textField_26.setText("");
				textField_27.setText("");;
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");

				lblOuterLoop.setEnabled(false);
				lblInnerLoop.setEnabled(false);
				lblInitialT.setEnabled(false);

				lblOuterLoop.setEnabled(false);
				lblInnerLoop.setEnabled(false);
				lblInitialT.setEnabled(false);
				btnStart.setEnabled(false);
				btnDefault_2.setEnabled(false);
				btnClear_2.setEnabled(false);
				lblStart.setEnabled(false);
				lblEnd.setEnabled(false);
				btnLoadEoqPlotter.setEnabled(false);
				btnDefault_3.setEnabled(false);
				btnClear_3.setEnabled(false);

				textField_34.setText("");
				textField_35.setText("");
				textField_36.setText("");
				textField_37.setText("");
				textField_38.setText("");

				textField_34.setEnabled(false);
				textField_35.setEnabled(false);
				textField_36.setEnabled(false);
				textField_37.setEnabled(false);
				textField_38.setEnabled(false);

				btnDefault_1.setEnabled(true);
				btnClear_1.setEnabled(true);

			}
		});
		btnBack_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnBack_1.setBounds(581, 420, 193, 25);
		getContentPane().add(btnBack_1);

		btnNext_1.setEnabled(false);

		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



				if(textField_5.getText().trim().equals("") || textField_5.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 00  ]   line is empty or invalid");

				}
				else if(textField_6.getText().trim().equals("") && textField_6.isEditable() || textField_6.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 00  ]   line is empty or invalid");
				}

				else if(textField_8.getText().trim().equals("") && textField_8.isEditable() || textField_8.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 01  ]   line is empty or invalid");
				}
				else if(textField_9.getText().trim().equals("") && textField_9.isEditable() || textField_9.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 01  ]   line is empty or invalid");
				}
				else if(textField_11.getText().trim().equals("") && textField_11.isEditable() || textField_11.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 02  ]   line is empty or invalid");
				}
				else if(textField_12.getText().trim().equals("") && textField_12.isEditable() || textField_12.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 02  ]   line is empty or invalid");
				}
				else if(textField_14.getText().trim().equals("") && textField_14.isEditable() || textField_14.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 03  ]   line is empty or invalid");
				}
				else if(textField_15.getText().trim().equals("") && textField_15.isEditable() || textField_15.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 03  ]   line is empty or invalid");
				}
				else if(textField_17.getText().trim().equals("") && textField_17.isEditable() || textField_17.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 04  ]   line is empty or invalid");
				}
				else if(textField_18.getText().trim().equals("") && textField_18.isEditable() || textField_18.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 04  ]   line is empty or invalid");
				}
				else if(textField_20.getText().trim().equals("") && textField_20.isEditable() || textField_20.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 05  ]   line is empty or invalid");
				}
				else if(textField_21.getText().trim().equals("") && textField_21.isEditable() || textField_21.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 05  ]   line is empty or invalid");
				}
				else if(textField_23.getText().trim().equals("") && textField_23.isEditable() || textField_23.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 06  ]   line is empty or invalid");
				}
				else if(textField_24.getText().trim().equals("") && textField_24.isEditable() || textField_24.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 06  ]   line is empty or invalid");
				}

				else if(textField_26.getText().trim().equals("") && textField_26.isEditable() || textField_26.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 07  ]   line is empty or invalid");
				}
				else if(textField_27.getText().trim().equals("") && textField_27.isEditable() || textField_27.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 07  ]   line is empty or invalid");
				}

				else if(textField_29.getText().trim().equals("") && textField_29.isEditable() || textField_29.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 08  ]   line is empty or invalid");
				}
				else if(textField_30.getText().trim().equals("") && textField_30.isEditable() || textField_30.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 08  ]   line is empty or invalid");
				}

				else if(textField_32.getText().trim().equals("") && textField_32.isEditable() || textField_32.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Upper  ]   field in the   [  k = 09]   line is empty or invalid");
				}
				else if(textField_33.getText().trim().equals("") && textField_33.isEditable() || textField_33.getText().trim().equals(".")){

					JOptionPane.showMessageDialog(null, "[  Price  ]   field in the   [  k = 09  ]   line is empty or invalid");
				}
				else {

					btnNext_1.setEnabled(false);
					btnBack.setEnabled(false);
					btnBack_1.setEnabled(true);

					Enumeration<AbstractButton> elements = buttonGroup_1.getElements();
					while (elements.hasMoreElements()) {
						AbstractButton button = (AbstractButton)elements.nextElement();
						if (button.isVisible()) {
							button.setEnabled(false);
						}
					}

					label_9.setEnabled(false);
					label_4.setEnabled(false);
					label_5.setEnabled(false);
					label_6.setEnabled(false);
					label_7.setEnabled(false);
					label_8.setEnabled(false);
					label_10.setEnabled(false);
					label_11.setEnabled(false);
					label_12.setEnabled(false);
					label_13.setEnabled(false);
					label_14.setEnabled(false);
					label_17.setEnabled(false);
					label_16.setEnabled(false);
					label_15.setEnabled(false);
					label_18.setEnabled(false);


					lblK.setEnabled(false);

					textField_7.setEnabled(true);
					textField_10.setEnabled(true);
					textField_13.setEnabled(true);
					textField_16.setEnabled(true);
					textField_19.setEnabled(true);
					textField_22.setEnabled(true);
					textField_25.setEnabled(true);
					textField_28.setEnabled(true);
					textField_31.setEnabled(true);
					textField_32.setEnabled(true);

					textField_5.setEditable(false);
					textField_6.setEditable(false);
					textField_7.setEditable(false);
					textField_8.setEditable(false);
					textField_9.setEditable(false);
					textField_10.setEditable(false);
					textField_11.setEditable(false);
					textField_12.setEditable(false);
					textField_13.setEditable(false);
					textField_14.setEditable(false);
					textField_15.setEditable(false);
					textField_16.setEditable(false);
					textField_17.setEditable(false);
					textField_18.setEditable(false);
					textField_19.setEditable(false);
					textField_20.setEditable(false);
					textField_21.setEditable(false);
					textField_22.setEditable(false);
					textField_23.setEditable(false);
					textField_24.setEditable(false);
					textField_25.setEditable(false);
					textField_26.setEditable(false);
					textField_27.setEditable(false);
					textField_28.setEditable(false);
					textField_29.setEditable(false);
					textField_30.setEditable(false);
					textField_31.setEditable(false);
					textField_32.setEditable(false);
					textField_33.setEditable(false);


					lblOuterLoop.setEnabled(true);
					lblInnerLoop.setEnabled(true);
					lblInitialT.setEnabled(true);

					lblOuterLoop.setEnabled(true);
					lblInnerLoop.setEnabled(true);
					lblInitialT.setEnabled(true);
					btnStart.setEnabled(true);
					btnDefault_2.setEnabled(true);
					btnClear_2.setEnabled(true);
					lblStart.setEnabled(true);
					lblEnd.setEnabled(true);
					btnLoadEoqPlotter.setEnabled(true);
					btnDefault_3.setEnabled(true);
					btnClear_3.setEnabled(true);

					textField_34.setText("");
					textField_35.setText("");
					textField_36.setText("");
					textField_37.setText("");
					textField_38.setText("");

					textField_34.setEnabled(true);
					textField_35.setEnabled(true);
					textField_36.setEnabled(true);
					textField_37.setEnabled(true);
					textField_38.setEnabled(true);

					btnDefault_1.setEnabled(false);
					btnClear_1.setEnabled(false);
				}
			}
		});
		btnNext_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNext_1.setBounds(394, 420, 175, 25);
		getContentPane().add(btnNext_1);
		btnClear_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				textField_37.setText("");
				textField_38.setText("");
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
