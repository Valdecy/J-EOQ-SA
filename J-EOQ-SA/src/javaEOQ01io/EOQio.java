package javaEOQ01io;

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

import javaEOQ.*;

public class EOQio {

	public EOQio (){

	}//constructor

	int ia = 0, ja = 0;	
	double ctq = 0;	


	public double yqcOutputsOC(double q, double A, double D, int k){

		switch (k) {
		case 1: 
			EOQ solution1 = new EOQ();
			solution1.orderingCost(q, A, D);
			ctq = solution1.orderingCost(q, A, D);
			break;
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.orderingCost(q, A, D);
			ctq = solution2.orderingCost(q, A, D);
			break;
		case 3: 
			EOQAllUnits solution3 = new EOQAllUnits(); 
			solution3.orderingCost(q, A, D);
			ctq = solution3.orderingCost(q, A, D);
			break;
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.orderingCost(q, A, D);
			ctq = solution4.orderingCost(q, A, D);
			break;
		case 5: 
			EOQIncremental solution5 = new EOQIncremental();
			solution5.orderingCost(q, A, D);
			ctq = solution5.orderingCost(q, A, D);
			break;
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.orderingCost(q, A, D);
			ctq = solution6.orderingCost(q, A, D);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}

	public double yqcOutputsHC(double q, double I, double UBC, int k, double C [], double U [], double L[]){

		int y[] = new int[10];

		double qa [] = new double[10];
		java.util.Arrays.fill(qa, 0);

		for (ia = 0; ia < 10; ia++){

			if(ia <= 0 && (L[0] - 1) <= q && q < U[0]){

				java.util.Arrays.fill(y, 0);
				y[0] = 1;
				qa[0] = (q - (L[0] -1))*y[0] + (U[0] - L[0])*(1 - y[0]);
			}
			else if (L[ia] <= q && q < U[ia]){

				java.util.Arrays.fill(y, 0);
				y[ia] = 1;
				for (ja = 0; ja < 10; ja++){

					qa[ja] = (q - (L[ja] -1))*y[ja] + (U[ja] - L[ja])*(1 - y[ja]);

				}
			}
		}

		switch (k) {
		case 1: 
			EOQ solution1 = new EOQ();
			solution1.holdingCost(q, I, C);
			ctq = solution1.holdingCost(q, I, C);
			break;
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.holdingCost(q, I, C, UBC);
			ctq = solution2.holdingCost(q, I, C, UBC);
			break;
		case 3: 
			EOQAllUnits solution3 = new EOQAllUnits(); 
			solution3.holdingCost(q, qa, y,C, I);
			ctq = solution3.holdingCost(q, qa, y,C, I);
			break;
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.holdingCost(q, qa, y,C, I, UBC);
			ctq = solution4.holdingCost(q, qa, y,C, I, UBC);
			break;
		case 5: 
			EOQIncremental solution5 = new EOQIncremental();
			solution5.holdingCost(q, qa, y, C, I);
			ctq = solution5.holdingCost(q, qa, y, C, I);
			break;
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.holdingCost(q, qa, y, C, I, UBC);
			ctq = solution6.holdingCost(q, qa, y, C, I, UBC);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}
	public double yqcOutputsPC(double q, double D, double A, double I, double UBC, int k, double C [], double U [], double L[]){

		int y[] = new int[10];

		double qa [] = new double[10];
		java.util.Arrays.fill(qa, 0);

		

		for (ia = 0; ia < 10; ia++){

			if(ia <= 0 && (L[0] - 1) <= q && q < U[0]){

				java.util.Arrays.fill(y, 0); 
				y[0] = 1;
				qa[0] = (q - (L[0] -1))*y[0] + (U[0] - L[0])*(1 - y[0]);
			}
			else if (L[ia] <= q && q < U[ia]){

				java.util.Arrays.fill(y, 0);
				y[ia] = 1;
				for (ja = 0; ja < 10; ja++){

					qa[ja] = (q - (L[ja] -1))*y[ja] + (U[ja] - L[ja])*(1 - y[ja]);

				}
			}
		}

		switch (k) {
		case 1: 
			EOQ solution1 = new EOQ();
			solution1.purchasingCost(D, C);
			ctq = solution1.purchasingCost(D, C);
			break;
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.purchasingCost(D, C);
			ctq = solution2.purchasingCost(D, C);
			break;
		case 3: 
			EOQAllUnits solution3 = new EOQAllUnits(); 
			solution3.purchasingCost(q, qa, y, C, D);
			ctq = solution3.purchasingCost(q, qa, y, C, D);
			break;
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.purchasingCost(q, qa, y, C, D);
			ctq = solution4.purchasingCost(q, qa, y, C, D);
			break;
		case 5: 
			EOQIncremental solution5 = new EOQIncremental();
			solution5.purchasingCost(q, qa, y, C, D);
			ctq = solution5.purchasingCost(q, qa, y, C, D);
			break;
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.purchasingCost(q, qa, y, C, D);
			ctq = solution6.purchasingCost(q, qa, y, C, D);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}	

	public double yqcOutputsBC(double q, double D, double A, double I, double UBC, int k, double C [], double U [], double L[]){

		int y[] = new int[10];

		double qa [] = new double[10];
		java.util.Arrays.fill(qa, 0);


		for (ia = 0; ia < 10; ia++){

			if(ia <= 0 && (L[0] - 1) <= q && q < U[0]){

				java.util.Arrays.fill(y, 0);
				y[0] = 1;
				qa[0] = (q - (L[0] -1))*y[0] + (U[0] - L[0])*(1 - y[0]);
			}
			else if (L[ia] <= q && q < U[ia]){

				java.util.Arrays.fill(y, 0);
				y[ia] = 1;
				for (ja = 0; ja < 10; ja++){

					qa[ja] = (q - (L[ja] -1))*y[ja] + (U[ja] - L[ja])*(1 - y[ja]);

				}
			}
		}

		switch (k) {
		case 1:
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.backorderingCost(q, UBC, I, C);
			ctq = solution2.backorderingCost(q, UBC, I, C);
			break;
		case 3: 
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.backorderingCost(q, y, C, I, UBC);
			ctq = solution4.backorderingCost(q, y, C, I, UBC);
			break;
		case 5: 
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.backorderingCost(q, qa, y, C, I, UBC);
			ctq = solution6.backorderingCost(q, qa, y, C, I, UBC);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}
	public double yqcOutputsTC(double q, double D, double A, double I, double UBC, int k, double C [], double U [], double L[]){

		int y[] = new int[10];

		double qa [] = new double[10];
		java.util.Arrays.fill(qa, 0);

		for (ia = 0; ia < 10; ia++){

			if(ia <= 0 && (L[0] - 1) <= q && q < U[0]){

				java.util.Arrays.fill(y, 0);
				y[0] = 1;
				qa[0] = (q - (L[0] -1))*y[0] + (U[0] - L[0])*(1 - y[0]);
			}
			else if (L[ia] <= q && q < U[ia]){

				java.util.Arrays.fill(y, 0);
				y[ia] = 1;
				for (ja = 0; ja < 10; ja++){

					qa[ja] = (q - (L[ja] -1))*y[ja] + (U[ja] - L[ja])*(1 - y[ja]);

				}
			}
		}

		switch (k) {
		case 1: 
			EOQ solution1 = new EOQ();
			solution1.totalCost(q, A, D, I, C);
			ctq = solution1.totalCost(q, A, D, I, C);
			break;
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.totalCost(q, A, D, I, C, UBC);
			ctq = solution2.totalCost(q, A, D, I, C, UBC);
			break;
		case 3: 
			EOQAllUnits solution3 = new EOQAllUnits(); 
			solution3.totalCost(q, qa, y, C, A, D, I);
			ctq = solution3.totalCost(q, qa, y, C, A, D, I);
			break;
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.totalCost(q, qa, y, C, A, D, I, UBC);
			ctq = solution4.totalCost(q, qa, y, C, A, D, I, UBC);
			break;
		case 5: 
			EOQIncremental solution5 = new EOQIncremental();
			solution5.totalCost(q, qa, y, C, A, D, I);
			ctq = solution5.totalCost(q, qa, y, C, A, D, I);
			break;
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.totalCost(q, qa, y, C, A, D, I, UBC);
			ctq = solution6.totalCost(q, qa, y, C, A, D, I, UBC);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}
	
	public double yqcOutputsBL(double q, double D, double A, double I, double UBC, int k, double C [], double U [], double L[]){

		int y[] = new int[10];

		double qa [] = new double[10];
		java.util.Arrays.fill(qa, 0);

		for (ia = 0; ia < 10; ia++){

			if(ia <= 0 && (L[0] - 1) <= q && q < U[0]){

				java.util.Arrays.fill(y, 0);
				y[0] = 1;
				qa[0] = (q - (L[0] -1))*y[0] + (U[0] - L[0])*(1 - y[0]);
			}
			else if (L[ia] <= q && q < U[ia]){

				java.util.Arrays.fill(y, 0);
				y[ia] = 1;
				for (ja = 0; ja < 10; ja++){

					qa[ja] = (q - (L[ja] -1))*y[ja] + (U[ja] - L[ja])*(1 - y[ja]);

				}
			}
		}

		switch (k) {
		case 1:
		case 2: 
			EOQB solution2 = new EOQB();
			solution2.backorderLevel(q, I, C, UBC);
			ctq = solution2.backorderLevel(q, I, C, UBC);
			break;
		case 3: 
		case 4: 
			EOQBAllUnits solution4 = new EOQBAllUnits();
			solution4.backorderLevel(q, y, C, I, UBC);
			ctq = solution4.backorderLevel(q, y, C, I, UBC);
			break;
		case 5: 
		case 6: 
			EOQBIncremental solution6 = new EOQBIncremental(); 
			solution6.backorderLevel(q, qa, y, C, I, UBC);
			ctq = solution6.backorderLevel(q, qa, y, C, I, UBC);
			break;
		default: System.out.println("Insert a value of k between 1 and 6");
		}
		return ctq;
	}
}      
