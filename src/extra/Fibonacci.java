package extra;

import javax.swing.JOptionPane;

public class Fibonacci {
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		
		String num = JOptionPane.showInputDialog("How many numbers?");
		int fib = Integer.parseInt(num);
		
		System.out.println("1,\n1,");
		for(int i = 0; i < fib; i++) {
			int sum =num1+num2;
			System.out.println(sum + ",");
			num1 = num2;
			num2 = sum;
			sum = num1;
			
		}
	}

}
