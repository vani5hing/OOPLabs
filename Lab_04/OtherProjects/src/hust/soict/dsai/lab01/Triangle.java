package hust.soict.dsai.lab01;

import java.util.Scanner;
public class Triangle {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter the height of the triangle: ");
        int n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.print("\n");
        }
	}
}
