package javaEOQ;

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

public class EOQBIncremental {
	
	public EOQBIncremental (){

	}//constructor


	public double orderingCost(double q, double A, double D) {
		double oc;

		oc = A*(D/q);

		return oc;
	}
	public double holdingCost(double q, double[] qa, int[] y,double C[],double I, double UBC) {
		double hc, hc0, hc1, hc2, hc3, hc4, hc5, hc6, hc7, hc8, hc9;

		hc0 = y[0]*I*C[0]*(Math.pow((qa[0] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc1 = y[1]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q))*(Math.pow((qa[0] + qa[1] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc2 = y[2]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q))*(Math.pow((qa[0] + qa[1] + qa[2] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc3 = y[3]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc4 = y[4]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc5 = y[5]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] + qa[5] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc6 = y[6]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] + qa[5] + qa[6] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc7 = y[7]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] + qa[5] + qa[6] + qa[7] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc8 = y[8]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] + qa[5] + qa[6] + qa[7] + qa[8] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));
		hc9 = y[9]*I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q) + C[9]*(qa[9]/q))*(Math.pow((qa[0] + qa[1] + qa[2] + qa[3] + qa[4] + qa[5] + qa[6] + qa[7] + qa[8] + qa[9] - backorderLevel(q, qa, y, C, I, UBC)), 2)/(2*q));

		hc = hc0*y[0] + hc1*y[1] + hc2*y[2] + hc3*y[3] + hc4*y[4] +  hc5*y[5] + hc6*y[6] +  hc7*y[7] + hc8*y[8] + hc9*y[9];

		return hc;
	}
	public double purchasingCost (double q, double[] qa, int[] y, double[] C, double D) {
		double pc, pc0, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9;

		pc0 = y[0]*((C[0]*D));
		pc1 = y[1]*((C[0]*qa[0] + C[1]*qa[1])*(D/q));
		pc2 = y[2]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2])*(D/q));
		pc3 = y[3]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3])*(D/q));
		pc4 = y[4]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4])*(D/q));
		pc5 = y[5]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4] + C[5]*qa[5])*(D/q));
		pc6 = y[6]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4] + C[5]*qa[5] + C[6]*qa[6])*(D/q));
		pc7 = y[7]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4] + C[5]*qa[5] + C[6]*qa[6] + C[7]*qa[7])*(D/q));
		pc8 = y[8]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4] + C[5]*qa[5] + C[6]*qa[6] + C[7]*qa[7] + C[8]*qa[8])*(D/q));
		pc9 = y[9]*((C[0]*qa[0] + C[1]*qa[1] + C[2]*qa[2] + C[3]*qa[3] + C[4]*qa[4] + C[5]*qa[5] + C[6]*qa[6] + C[7]*qa[7] + C[8]*qa[8] + C[9]*qa[9])*(D/q));

		pc = pc0*y[0] + pc1*y[1] + pc2*y[2] + pc3*y[3] + pc4*y[4] + pc5*y[5] + pc6*y[6] + pc7*y[7] + pc8*y[8] + pc9*y[9];

		return pc;
	}
	public double backorderingCost (double q, double[] qa, int[] y,double[] C, double I, double UBC) {
		double bc;

		bc = UBC*Math.pow((backorderLevel(q, qa,y, C, I, UBC)), 2)/(2*q);

		return bc;
	}
	public double backorderLevel (double q, double[] qa, int[] y, double[] C, double I, double UBC) {
		double b, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;

		b0 = (I*q*(C[0]*(qa[0]/q)))/(UBC + I*(C[0]*(qa[0]/q)));
		b1 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q)));
		b2 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q)));
		b3 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q)));
		b4 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q)));
		b5 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q)));
		b6 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q)));
		b7 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q)));
		b8 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q)));
		b9 = (I*q*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q) + C[9]*(qa[9]/q)))/(UBC + I*(C[0]*(qa[0]/q) + C[1]*(qa[1]/q) + C[2]*(qa[2]/q) + C[3]*(qa[3]/q) + C[4]*(qa[4]/q) + C[5]*(qa[5]/q) + C[6]*(qa[6]/q) + C[7]*(qa[7]/q) + C[8]*(qa[8]/q) + C[9]*(qa[9]/q)));

		b = b0*y[0] + b1*y[1] + b2*y[2] + b3*y[3] + b4*y[4] + b5*y[5] + b6*y[6] + b7*y[7] + b8*y[8] + b9*y[9];

		return b;
	}
	public double totalCost (double q, double[] qa, int [] y, double[] C, double A, double D, double I, double UBC) {
		double tc = orderingCost(q, A, D) + holdingCost(q, qa, y,C, I, UBC) + purchasingCost(q, qa, y, C, D) + backorderingCost(q, qa, y, C, I, UBC);

		return tc;
	}

}

