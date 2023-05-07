package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		//Single For-Loops


		//1.
		System.out.println("Single For-Loops #1:");
		for(int i = 0; i<=100; i++) {
			System.out.println(i);		
		}

		//2.
		System.out.println("Single For-Loops #2:");
		for(int i = 100; i>=0; i--) {
			System.out.println(i);		
		}

		//3.
		System.out.println("Single For-Loops #3:");
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);

			}
		}

		//4.
		System.out.println("Single For-Loops #4:");
		for(int i = 0; i<100; i++) {
			if(i % 2 != 0) {
				System.out.println(i);

			}
		}

		//5.
		System.out.println("Single For-Loops #5:");
		for(int i = 1; i<=500; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}

		}

		//6.
		System.out.println("Single For-Loops #6:");
		for(int i = 0; i<=777; i++) {
			if(i % 7 == 0) {
				System.out.println(i);	
			}
		}

		//7.
		System.out.println("Single For-Loops #7:");
		for(int i = 2007; i<=2023; i++) {
			if(i != 2008 && i != 2023) {
				System.out.println("In " + i + ", I was " + (i-2007) + " years old.");
			}
			else if(i == 2008) {
				System.out.println("In " + i + ", I was " + (i-2007) + " year old.");	
			}
			else {
				System.out.println("In " + i + ", I am " + (i-2007) + " years old.");
			}
		}



		//Nested For-Loops


		//1.
		System.out.println("Nested For-Loops #1:");
		for(int i = 0; i < 2; i++) {

			for(int j = 0; j<= 2; j++) {
				System.out.println(i + " " + j);
			}
		}

		//2.
		System.out.println("Nested For-Loops #2:");
		for(int i = 0; i<=2; i++) {

			for(int j = 1; j<=3; j++) {
				System.out.print((3*i)+ j + " "); 
			}
			System.out.print("\n");
		}

		//3.
		System.out.println("Nested For-Loops #3:");
		for(int i = 0; i<=9; i++) {

			for(int j = 1; j<=10; j++) {
				System.out.print((10*i)+ j + " "); 
			}
			System.out.print("\n");
		}

		//4.
		System.out.println("Nested For-Loops #4:");
		for(int i = 1; i<=6; i++) {
			String star = "*";
			for(int j = 1; j<=i; j++) {
				System.out.print(star + " ");
			}
			System.out.print("\n");
		}



		// ** Bonus **
		System.out.println("Bonus:");
		for(int i = 0; i<=100; i++) {
			System.out.println(100-i);


		}


	}
}
