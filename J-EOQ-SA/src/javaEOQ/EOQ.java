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

public class EOQ {

	public EOQ (){

	}//constructor

	public double formulaEOQ(double A, double D, double I, double[] C) {
		double feoq;

		feoq = Math.sqrt((2*A*D)/(I*C[0]));
		return feoq;
	}

	public double orderingCost(double q, double A, double D) {
		double oc;

		oc = A*(D/q);

		return oc;
	}
	public double holdingCost(double q, double I, double[] C) {
		double hc;

		hc = (q*I*C[0])/2;

		return hc;
	}
	public double purchasingCost (double D, double C[]) {
		double pc;

		pc = D*C[0];

		return pc;
	}

	public  double totalCost (double q, double A, double D, double I, double[] C) {
		double tc = orderingCost(q, A, D) + holdingCost(q, I, C) + purchasingCost(D, C);
		
		return tc;
	}

}
