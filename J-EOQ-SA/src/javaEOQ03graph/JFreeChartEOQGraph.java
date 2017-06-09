package javaEOQ03graph;

//Copyright @ 2014 by Valdecy Pereira

//This file is part of J-EOQ-SA.
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

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaEOQ01io.EOQio;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.XYDataset;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JFreeChartEOQGraph extends JFrame {

	private int origin;

	public int getOrigin() {
		return origin;
	}

	public void setOrigin(int origin) {
		this.origin = origin;
	}

	private int end;

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	private double D;

	public double getD() {
		return D;
	}

	public void setD(double D) {
		this.D = D;
	}

	private double A;

	public double getA() {
		return A;
	}

	public void setA(double A) {
		this.A = A;
	}

	private double I;

	public double getI() {
		return I;
	}

	public void setI(double I) {

		this.I = I;
	}
	private double UBC;

	public double getUBC() {
		return UBC;
	}

	public void setUBC(double UBC) {
		this.UBC = UBC;
	}

	private int k;

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	private double [] C;

	public double [] getC() {
		return C;
	}

	public void setC(double [] C) {
		this.C = C;
	}

	private double [] U;

	public double [] getU() {
		return U;
	}

	public void setU(double [] U) {
		this.U = U;
	}

	private double [] L;

	public double [] getL() {
		return L;
	}

	public void setL(double [] L) {
		this.L = L;
	}

	public JFreeChartEOQGraph(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		final DefaultXYDataset dataset0 = new DefaultXYDataset();

		JFreeChart chart = createChart(dataset0);
		ChartPanel chartPanel = new ChartPanel(chart, false);
		getContentPane().add(chartPanel, BorderLayout.CENTER);


		JPanel buttonPanel = new JPanel();
		
		JLabel lblMin = new JLabel("OC");
		buttonPanel.add(lblMin);



		JButton addButton0 = new JButton("+");
		buttonPanel.add(addButton0);
		addButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Ordering Cost", createSeriesOC());
			}
		});

		JButton remButton0 = new JButton("-");
		buttonPanel.add(remButton0);
		remButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Ordering Cost");
			}
		});
		
		JLabel lblHc = new JLabel("HC");
		buttonPanel.add(lblHc);



		JButton addButton1 = new JButton("+");
		buttonPanel.add(addButton1);
		addButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Holding Cost", createSeriesHC());
			}
		});
		JButton remButton1 = new JButton("-");
		buttonPanel.add(remButton1);
		remButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Holding Cost");
			}
		});
		
		JLabel lblPc = new JLabel("PC");
		buttonPanel.add(lblPc);

		JButton addButton2 = new JButton("+");
		buttonPanel.add(addButton2);
		addButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Purchasing Cost", createSeriesPC());
			}
		});
		JButton remButton2 = new JButton("-");
		buttonPanel.add(remButton2);
		remButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Purchasing Cost");
			}
		});
		
		JLabel lblBc = new JLabel("BC");
		buttonPanel.add(lblBc);

		JButton addButton3 = new JButton("+");
		buttonPanel.add(addButton3);
		addButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Backordering Cost", createSeriesBC());
			}
		});
		JButton remButton3 = new JButton("-");
		buttonPanel.add(remButton3);
		remButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Backordering Cost");
			}
		});
		
		JLabel lblTc = new JLabel("TC");
		buttonPanel.add(lblTc);


		JButton addButton4 = new JButton("+");
		buttonPanel.add(addButton4);
		addButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Total Cost", createSeriesTC());
			}
		});
		JButton remButton4 = new JButton("-");
		buttonPanel.add(remButton4);
		remButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Total Cost");
			}
		});
		
		JLabel lblMin_1 = new JLabel("Min");
		buttonPanel.add(lblMin_1);

		JButton addButton5 = new JButton("+");
		buttonPanel.add(addButton5);
		addButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.addSeries("Minimum", createPoint());
			}
		});
		JButton remButton5 = new JButton("-");
		buttonPanel.add(remButton5);
		remButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataset0.removeSeries("Minimum");
			}
		});



		getContentPane().add(buttonPanel, BorderLayout.NORTH);
	}

	private double[][] createSeriesOC(){
		double[][] seriesOC = new double[2][end - origin];
		EOQio qy = new EOQio();

		for (int i = 0; i < (end - origin); i++) {
			seriesOC[0][i] = (double) i + origin;
			seriesOC[1][i] = qy.yqcOutputsOC(i + origin, A, D, k);
		}	
		return seriesOC;
	}
	private double[][] createSeriesHC(){
		double[][] seriesHC = new double[2][end - origin];
		EOQio qy = new EOQio();
		for (int i = 0; i < (end - origin); i++) {
			seriesHC[0][i] = (double) i + origin;
			seriesHC[1][i] = qy.yqcOutputsHC(i + origin, I, UBC, k, C, U, L);
		}	
		return seriesHC;
	}
	private double[][] createSeriesPC(){
		double[][] seriesPC = new double[2][end - origin];
		EOQio qy = new EOQio();
		for (int i = 0; i < (end - origin); i++) {
			seriesPC[0][i] = (double) i + origin;
			seriesPC[1][i] = qy.yqcOutputsPC(i + origin, D, A, I, UBC, k, C, U, L);
		}	
		return seriesPC;
	}
	private double[][] createSeriesBC(){
		double[][] seriesBC = new double[2][end - origin];
		EOQio qy = new EOQio();
		for (int i = 0; i < (end - origin); i++) {
			seriesBC[0][i] = (double) i + origin;
			seriesBC[1][i] = qy.yqcOutputsBC(i + origin, D, A, I, UBC, k, C, U, L);
		}	
		return seriesBC;
	}
	private double[][] createSeriesTC(){
		double[][] seriesTC = new double[2][end - origin];
		EOQio qy = new EOQio();
		for (int i = 0; i < (end - origin); i++) {
			seriesTC[0][i] = (double) i + origin;
			seriesTC[1][i] = qy.yqcOutputsTC(i + origin, D, A, I, UBC, k, C, U, L);
		}	

		return seriesTC;
	}
	private double[][] createPoint(){
		EOQio qy = new EOQio();
		int imin = 0;
		int iminTemp = 0;
		double yTemp = qy.yqcOutputsTC(1, D, A, I, UBC, k, C, U, L);

		for (iminTemp = 0; iminTemp < end; iminTemp++) {
			if(yTemp > qy.yqcOutputsTC(iminTemp + origin, D, A, I, UBC, k, C, U, L)){				
				yTemp = qy.yqcOutputsTC(iminTemp + origin, D, A, I, UBC, k, C, U, L);
				imin = iminTemp;
			}
		}

		double[][] point = new double[2][(int) ((1.15)*qy.yqcOutputsTC(imin + origin, D, A, I, UBC, k, C, U, L))];	
		for (int i = 0; i < (int) ((1.15)*qy.yqcOutputsTC(imin + origin, D, A, I, UBC, k, C, U, L)); i++) {
			point[0][i] = imin + origin;
			point[1][i] = i;
		}
		return point;
	}

	private JFreeChart createChart(XYDataset dataset) {

		JFreeChart chart = ChartFactory.createXYLineChart(
				"", 
				"Quantity (Q)", 
				"Cost ($)", 
				dataset,  
				PlotOrientation.VERTICAL, 
				true, 
				true, 
				false 
				);

		chart.setBackgroundPaint(Color.white);

		XYPlot plot = (XYPlot) chart.getPlot();
		plot.setBackgroundPaint(Color.DARK_GRAY);
		plot.setDomainGridlinesVisible(true);
		plot.setDomainGridlinePaint(Color.lightGray);
		plot.setRangeGridlinePaint(Color.lightGray);

		TickUnitSource ticks = NumberAxis.createIntegerTickUnits();
		NumberAxis domain = (NumberAxis) plot.getDomainAxis();
		domain.setStandardTickUnits(ticks);
		NumberAxis range = (NumberAxis) plot.getRangeAxis();
		range.setStandardTickUnits(ticks);

		XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer(true, true);
		plot.setRenderer(0, renderer);
		renderer.setBaseShapesVisible(false);
		renderer.setBaseShapesFilled(true);

		Stroke stroke = new BasicStroke( 3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
		renderer.setBaseOutlineStroke(stroke);

		return chart;
	}
}
