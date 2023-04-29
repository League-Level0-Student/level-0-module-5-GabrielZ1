package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {

		String numberAsString = JOptionPane.showInputDialog("Enter a positive whole number.");

		int numberAsInt = Integer.parseInt(numberAsString);


		for(int i=1; i<1000000; i++) {

			if(numberAsInt % i == 0 && numberAsInt != i && i != 1) {
				JOptionPane.showMessageDialog(null, numberAsInt + " is not prime.");	

				System.exit(0);

			}
			//exception because 1 is considered to not be a prime number
			else if(numberAsInt == 1) {
				JOptionPane.showMessageDialog(null, numberAsInt + " is not prime.");	

				System.exit(0);

			}


		}

		//if the if statement wasn't executed, the number is prime
		JOptionPane.showMessageDialog(null, numberAsInt + " is prime.");

















	}

}
