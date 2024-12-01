package hust.soict.dsai.lab01;

// Example 6: EquationsSolver.java
import javax.swing.JOptionPane;
public class EquationsSolver {
	private static void FirstDegreeEquationWithOneVariable() {
		double numA = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A", "Input value of A", JOptionPane.INFORMATION_MESSAGE));
		double numB = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of B", "Input value of B", JOptionPane.INFORMATION_MESSAGE));
		if(numA == 0) {
			if(numB != 0) JOptionPane.showMessageDialog(null, "The equation has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
			else JOptionPane.showMessageDialog(null, "The equation has infinite solution", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, "x = " + ((-numB) / numA), "Result", JOptionPane.INFORMATION_MESSAGE);
	}
	private static void FirstDegreeEquationWithTwoVariables() {
		// https://hayhochoi.vn/giai-he-phuong-trinh-bac-nhat-2-an-bang-dinh-thuc-cramer-phuong-phap-dinh-thuc-cramer-toan-10-chuyen-de.html
		double A11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A11", "Input value of A11", JOptionPane.INFORMATION_MESSAGE));
		double A12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A12", "Input value of A12", JOptionPane.INFORMATION_MESSAGE));
		double B1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of B1", "Input value of B1", JOptionPane.INFORMATION_MESSAGE));
		double A21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A21", "Input value of A21", JOptionPane.INFORMATION_MESSAGE));
		double A22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A22", "Input value of A22", JOptionPane.INFORMATION_MESSAGE));
		double B2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of B2", "Input value of B2", JOptionPane.INFORMATION_MESSAGE));
		double D = A11 * A22 - A21 * A12;
		double D1 = B1 * A22 - B2 * A12;
		double D2 = A11 * B2 - A21 * B1;
		if(D == 0) {
			if(D1 == 0 && D2 == 0) JOptionPane.showMessageDialog(null, "The system has infinite solutions", "Result", JOptionPane.INFORMATION_MESSAGE);
			else JOptionPane.showMessageDialog(null, "The system has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null, "X1 = " + D1/D + " and X2 = " + D2/D , "Result", JOptionPane.INFORMATION_MESSAGE);
	}
	private static void SecondDegreeEquationWithOneVariable() {
		double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of A", "Input value of A", JOptionPane.INFORMATION_MESSAGE));
		double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of B", "Input value of B", JOptionPane.INFORMATION_MESSAGE));
		double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the value of C", "Input value of C", JOptionPane.INFORMATION_MESSAGE));
		if(A == 0) JOptionPane.showMessageDialog(null, "The system is not a second-degree equation", "Result", JOptionPane.INFORMATION_MESSAGE);
		else {
			double delta = B * B - 4 * A * C;
			if(delta > 0) JOptionPane.showMessageDialog(null,
					"X1 = " + (-B + Math.sqrt(delta)) / (2 * A) + "\n" +
					"X2 = " + (-B - Math.sqrt(delta)) / (2 * A)
					, "Result", JOptionPane.INFORMATION_MESSAGE);
			else if(delta == 0) JOptionPane.showMessageDialog(null, "The system has double root X = " + -B / (2 * A), "Result", JOptionPane.INFORMATION_MESSAGE);
			else JOptionPane.showMessageDialog(null, "The system is no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public static void main(String[] args) {
		while(true) {
			int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Please input the option:\n" +
					"1. First-degree equation with one variable\n" + 
					"2. System of first-degree equations with two variables\n" +
					"3. Second-degree equation with one variable\n" + 
					"4. Exit"
					, "Input type of equation", JOptionPane.INFORMATION_MESSAGE));
			if(type == 1) FirstDegreeEquationWithOneVariable();
			else if(type == 2) FirstDegreeEquationWithTwoVariables();
			else if(type == 3) SecondDegreeEquationWithOneVariable();
			else break;
		}
	}
}
