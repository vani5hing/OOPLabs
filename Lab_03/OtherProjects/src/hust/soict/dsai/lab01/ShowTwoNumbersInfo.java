package hust.soict.dsai.lab01;

// Example 5: ShowTwoNumbersInfo.java
import javax.swing.JOptionPane;
public class ShowTwoNumbersInfo {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		double Num1 = Double.parseDouble(strNum1);
		double Num2 = Double.parseDouble(strNum2);
		JOptionPane.showMessageDialog(null, Num1 + Num2, "Show sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
		double Dif = ((Num1 >= Num2) ? (Num1 - Num2) : (Num2 - Num1));
		JOptionPane.showMessageDialog(null, Dif, "Show difference of two numbers", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Num1 * Num2, "Show product of two numbers", JOptionPane.INFORMATION_MESSAGE);
		if(Num2 == 0) {
			JOptionPane.showMessageDialog(null, "Divison is not allowed", "Show quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, Num1 / Num2, "Show quotient  of two numbers", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}
