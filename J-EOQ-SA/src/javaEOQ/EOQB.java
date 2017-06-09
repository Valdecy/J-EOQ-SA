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

public class EOQB {
	
	public EOQB (){

	}//constructor

	public double formulaEOQ(double D, double I, double A, double[] C, double UBC) {
		double feoq;

		feoq = (Math.sqrt((2*A*D)/(I*C[0])))*(Math.sqrt(UBC/(I*C[0] + UBC)));

		return feoq;
	}
	public double orderingCost(double q, double A, double D) {
		double oc;

		oc = A*(D/q);

		return oc;
	}
	public double holdingCost(double q, double I, double[] C, double UBC) {
		double hc;

		hc = ((I*C[0])/(2*q))*Math.pow((q-backorderLevel(q, I, C, UBC)), 2);

		return hc;
	}
	public double purchasingCost (double D, double[] C) {
		double pc;

		pc = D*C[0];

		return pc;
	} 
	public double backorderingCost (double q, double UBC, double I, double[] C) {
		double bc;

		bc = UBC*Math.pow((backorderLevel(q, I, C, UBC)), 2)/(2*q);

		return bc;
	}
	public double backorderLevel (double q, double I, double[] C, double UBC) {
		double b;

		b = (I*C[0]*q)/(I*C[0] + UBC);

		return b;
	}
	public double totalCost (double q, double A, double D, double I, double[] C, double UBC) {
		double tc = orderingCost(q, A, D) + holdingCost(q, I, C, UBC) + purchasingCost(D, C) + backorderingCost(q, UBC, I, C);

		return tc;
	}

}
