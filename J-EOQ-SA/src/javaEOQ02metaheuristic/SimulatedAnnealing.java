package javaEOQ02metaheuristic;

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

import javaEOQ01io.EOQio;
import javax.swing.JOptionPane;

public class SimulatedAnnealing {

	public SimulatedAnnealing (){

	}//constructor
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

	private double t0;

	public double getT0() {
		return t0;
	}

	public void setT0(double t0) {
		this.t0 = t0;
	}

	private double iMax;

	public double getIMax() {
		return iMax;
	}

	public void setIMax(double iMax) {
		this.iMax = iMax;
	}

	private double jMax;

	public double getJMax() {
		return jMax;
	}

	public void setJMax(double jMax) {
		this.jMax = jMax;
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
	
	
	
	EOQio qy = new EOQio();
	EOQio qx = new EOQio();
	EOQio qz = new EOQio();
 
	double lower = 1.0, upper = 1_000_000.0;

	public void algorithmCalc(){

		int i, j, ibest = 0, jbest = 0;
		double t; 
		double d, df;
		double r, p;

		double x = (int)(Math.random()*(this.upper - this.lower + 1.0)), y, z = (int)(Math.random()*(this.upper - this.lower + 1.0));
		double ctx = qx.yqcOutputsTC(x, D, A, I, UBC, k, C, U, L), cty, ctz = qz.yqcOutputsTC(z, D, A, I, UBC, k, C, U, L);

		for (i = 0; i <= iMax; i++) {

			t = 0.9*this.t0;

			for (j = 0; j <= jMax; j++) {

				y = (int)(Math.random()*(upper - lower +1));

				if (x < 2.0){
					x = 2.0;
				}
				if (y < 2.0){
					y = 2.0;
				}
				if (z < 2.0){
					z = 2.0;
				}
				if (x > 1_000_000.0){
					x = 1_000_000.0;
				}
				if (y > 1_000_000.0){
					y = 2.0;
				}
				if (z > 1_000_000.0){
					z = 1_000_000.0;
				}

				cty = qy.yqcOutputsTC(y, D, A, I, UBC, k, C, U, L);
				d = cty - ctz;
				r =  Math.random();

				if (d < 0.0) {
					p = 1.0;
				}
				else {
					df = (cty - ctz)/ctz;
					p = Math.exp(-(df)/t);
				}
				if (d < 0.0 || r <= p) {
					z = y;
					ctz = cty;
				}
				if (ctz < ctx) {
					x = z;
					ctx = ctz;
					ibest = i;
					jbest = j;
				}	         
			}

			t0 = t;

		}	
		
		if(k == 1 || k == 3 || k == 5){
			double oc = qy.yqcOutputsOC(x, A, D, k);
			double hc = qy.yqcOutputsHC(x, I, UBC, k, C, U, L);
			double pc = qy.yqcOutputsPC(x, D, A, I, UBC, k, C, U, L);
			
		JOptionPane.showMessageDialog(null, ("EOQ  =  " + (int) x + "  units" + 
				"\n\nOrdering Cost  =  $" + Math.round(oc*100d)/100d +
				"\n\nHolding Cost  =  $" + Math.round(hc*100d)/100d + 
				"\n\nPurchasing Cost  =  $" + Math.round(pc*100d)/100d +
				"\n\nTotal Cost  =  $" + Math.round(ctx*100d)/100d + 
				"\n\nOrders/year  =  " + Math.round((D/x)*100d)/100d + 
				"\n\nCycle Time  =   " + Math.round((x/D)*100d)/100d + 
				"\n\nOutter Loop (  i.best  )  =  " + ibest + 
				"\n\nInner Loop (  j.best  )  =  " + jbest + "\n"), "Solution", 1, null );			
			
		}
		else{
			double oc = qy.yqcOutputsOC(x, A, D, k);
			double hc = qy.yqcOutputsHC(x, I, UBC, k, C, U, L);
			double bc = qy.yqcOutputsBC(x, D, A, I, UBC, k, C, U, L);
			double pc = qy.yqcOutputsPC(x, D, A, I, UBC, k, C, U, L);
			double bl = qy.yqcOutputsBL(x, D, A, I, UBC, k, C, U, L);		

		JOptionPane.showMessageDialog(null, ("EOQ  =  " + (int) x +  "  units" +
				"\n\nB  =  " + Math.round(bl*100d)/100d +  "  units" +
				"\n\nOrdering Cost  =  $" + Math.round(oc*100d)/100d +
				"\n\nHolding Cost  =  $" + Math.round(hc*100d)/100d + 
				"\n\nBackordering Cost  =  $" + Math.round(bc*100d)/100d + 
				"\n\nPurchasing Cost  =  $" + Math.round(pc*100d)/100d +
				"\n\nTotal Cost  =  $" + Math.round(ctx*100d)/100d + 
				"\n\nOrders/year  =  " + Math.round((D/x)*100d)/100d + 
				"\n\nCycle Time  =   " + Math.round((x/D)*100d)/100d + 
				"\n\nOutter Loop (  i.best  )  =  " + ibest + 
				"\n\nInner Loop (  j.best  )  =  " + jbest + "\n"), "Solution", 1, null );
		}
	}
}
