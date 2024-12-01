package hust.soict.dsai.lab01;

import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		int m = inp.nextInt();
		int n = inp.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int[m][n];
		System.out.println("Enter matrix A in order: ");
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) a[i][j] = inp.nextInt();
		System.out.println("Enter matrix B in order: ");
		for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) b[i][j] = inp.nextInt();
		System.out.println("Sum of two matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.print("\n");
        }
	}
}
