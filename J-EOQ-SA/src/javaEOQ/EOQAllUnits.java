package javaEOQ;

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

public class EOQAllUnits {
	public EOQAllUnits (){

	}//constructor

	public double orderingCost(double q, double A, double D) {
		double oc;

		oc = A*(D/q);

		return oc;
	}
	public double holdingCost(double q, double[] qa,  int[] y, double[] C, double I) {
		double hc, hc0, hc1, hc2, hc3, hc4, hc5, hc6, hc7, hc8, hc9;

		hc0 = y[0]*I*((C[0]*qa[0])/2);
		hc1 = y[1]*I*((C[1]*qa[0] + C[1]*qa[1])/2);
		hc2 = y[2]*I*((C[2]*qa[0] + C[2]*qa[1] + C[2]*qa[2])/2);
		hc3 = y[3]*I*((C[3]*qa[0] + C[3]*qa[1] + C[3]*qa[2] + C[3]*qa[3])/2);
		hc4 = y[4]*I*((C[4]*qa[0] + C[4]*qa[1] + C[4]*qa[2] + C[4]*qa[3] + C[4]*qa[4])/2);
		hc5 = y[5]*I*((C[5]*qa[0] + C[5]*qa[1] + C[5]*qa[2] + C[5]*qa[3] + C[5]*qa[4] + C[5]*qa[5])/2);
		hc6 = y[6]*I*((C[6]*qa[0] + C[6]*qa[1] + C[6]*qa[2] + C[6]*qa[3] + C[6]*qa[4] + C[6]*qa[5] + C[6]*qa[6])/2);
		hc7 = y[7]*I*((C[7]*qa[0] + C[7]*qa[1] + C[7]*qa[2] + C[7]*qa[3] + C[7]*qa[4] + C[7]*qa[5] + C[7]*qa[6] + C[7]*qa[7])/2);
		hc8 = y[8]*I*((C[8]*qa[0] + C[8]*qa[1] + C[8]*qa[2] + C[8]*qa[3] + C[8]*qa[4] + C[8]*qa[5] + C[8]*qa[6] + C[8]*qa[7] + C[8]*qa[8])/2);
		hc9 = y[9]*I*((C[9]*qa[0] + C[9]*qa[1] + C[9]*qa[2] + C[9]*qa[3] + C[9]*qa[4] + C[9]*qa[5] + C[9]*qa[6] + C[9]*qa[7] + C[9]*qa[8] + C[9]*qa[9])/2);

		hc = hc0*y[0] + hc1*y[1] + hc2*y[2] + hc3*y[3] + hc4*y[4] + hc5*y[5] + hc6*y[6] + hc7*y[7] + hc8*y[8] + hc9*y[9];

		return hc;
	}
	public double purchasingCost (double q, double[] qa, int[] y, double[] C, double D) {
		double pc, pc0, pc1, pc2, pc3, pc4, pc5, pc6, pc7, pc8, pc9;

		pc0 = y[0]*((C[0]*D));
		pc1 = y[1]*((C[1]*qa[0] + C[1]*qa[1])*(D/q));
		pc2 = y[2]*((C[2]*qa[0] + C[2]*qa[1] + C[2]*qa[2])*(D/q));
		pc3 = y[3]*((C[3]*qa[0] + C[3]*qa[1] + C[3]*qa[2] + C[3]*qa[3])*(D/q));
		pc4 = y[4]*((C[4]*qa[0] + C[4]*qa[1] + C[4]*qa[2] + C[4]*qa[3] + C[4]*qa[4])*(D/q));
		pc5 = y[5]*((C[5]*qa[0] + C[5]*qa[1] + C[5]*qa[2] + C[5]*qa[3] + C[5]*qa[4] + C[5]*qa[5])*(D/q));
		pc6 = y[6]*((C[6]*qa[0] + C[6]*qa[1] + C[6]*qa[2] + C[6]*qa[3] + C[6]*qa[4] + C[6]*qa[5] + C[6]*qa[6])*(D/q));
		pc7 = y[7]*((C[7]*qa[0] + C[7]*qa[1] + C[7]*qa[2] + C[7]*qa[3] + C[7]*qa[4] + C[7]*qa[5] + C[7]*qa[6] + C[7]*qa[7])*(D/q));
		pc8 = y[8]*((C[8]*qa[0] + C[8]*qa[1] + C[8]*qa[2] + C[8]*qa[3] + C[8]*qa[4] + C[8]*qa[5] + C[8]*qa[6] + C[8]*qa[7] + C[8]*qa[8])*(D/q));
		pc9 = y[9]*((C[9]*qa[0] + C[9]*qa[1] + C[9]*qa[2] + C[9]*qa[3] + C[9]*qa[4] + C[9]*qa[5] + C[9]*qa[6] + C[9]*qa[7] + C[9]*qa[8] + C[9]*qa[9])*(D/q));

		pc = pc0*y[0] + pc1*y[1] + pc2*y[2] + pc3*y[3] + pc4*y[4] + pc5*y[5] + pc6*y[6] + pc7*y[7] + pc8*y[8] + pc9*y[9];

		return pc;
	}
	public double totalCost (double q, double[] qa, int [] y, double[] C, double A, double D, double I) {
		double tc = orderingCost(q, A, D) + holdingCost(q, qa, y,C, I) + purchasingCost(q, qa, y, C, D);

		return tc;
	}


}
