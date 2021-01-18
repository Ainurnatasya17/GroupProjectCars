import java.util.Scanner;
public class Cars {

	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
		
		printDetails();
		printDownpayment();
		printCars();
		printFreegift();
		
		}
		
	    static int downpayment; 
	
		public static void printDetails() {
		Scanner input = new Scanner (System.in);
		System.out.println("Details of Customer");
		
		String[][] name = {{"Mr", "Ms", "Miss"},
				           {"Natasya", "Siti Rahayu", "Nurin Nabihah", "Azri", "Akmal"}
		}; 
		 
		System.out.print("Enter Your Name: ");
		System.out.println("Name: " + name[0][2] + " " + name [1][0]);
			
		System.out.print("Enter Your I/C Number: ");
		String ic = input.next();
		System.out.println("IC Number: " + ic);
		
		
		//do while loop
		int[] age = {21, 40, 50, 35, 28};
			
		int k = 0;
		do {
			System.out.print("Enter Your Age: ");
			System.out.println("Age: " + age[0]);
			k++;
			
		}while (k < 1);
		
		String[] gender = {"Female", "Male"};
		
	
		int b = 0;
		do {
			System.out.print("Enter Your Gender: ");
			System.out.println("Gender: " + gender[0]);
			b++;
			
		}while (b < 1);
		
		}
		
		
		public static void printDownpayment() {
		Scanner input = new Scanner (System.in);
		int downpayment;
		
		System.out.print("Enter Your Package Downpayment: ");
		downpayment = input.nextInt();
		
		if(downpayment < 5000) {
			System.out.println("Your Suitable Car is: " + "Axia");
			
		} else if(downpayment < 7000) {
			System.out.println("Your Suitable Car is: " + "Bezza");
			
		} else if(downpayment< 9000) {
			System.out.println("Your Suitable Car is: " + "Myvi");
		
		} else if(downpayment < 10000) {
			System.out.println("Your Suitable Car is: " + "Alza");
			
		} else
			System.out.println("Your Suitable Car is: " + "Aruz");
			
		}
		
	
		public static void printCars() {
		Scanner input = new Scanner (System.in);
	    
		double discount;
		
		if(downpayment < 5000) {
			discount = downpayment * 0.02;
			System.out.println();
			
		} else if(downpayment < 7000) {
			discount = downpayment * 0.04;
			System.out.println();
			
			
		} else if(downpayment< 9000) {
			discount = downpayment * 0.06;
			System.out.println();
		
			
		} else if(downpayment < 10000) {
			discount = downpayment * 0.08;
			System.out.println();
			
			
		} else
			discount = downpayment * 0.10;
			System.out.println();
			
		}
		
		
		//while loop
		public static void printFreegift() {
		Scanner input = new Scanner (System.in);
		
		String[] freegift = {"Keychain", "Books", "Pen", "Umbrella"};
		
		int a = 0;
		while(a < 1) {
			  System.out.println("Your Freegift is: " + freegift[3] + "," + " " + freegift[0]);
			  a++;	   
			}
		
		}

}


