import java.util.Scanner;

public class MyFinance {

	public static void main(String[] args) {
		//create scanner
		Scanner scanner = new Scanner (System.in);
		
		//create  month for financial analysis
		
		Month month = new Month();
		
		//prompts user to enter payment amounts
		System.out.println("Enter your bah amount");
		month.setbah(scanner.nextInt());
		System.out.println("Enter your bas amount");
		month.setbas(scanner.nextInt());
		
		//base pay is calculated with a 12% federal tax.  User should enter "before tax pay"
		System.out.println("Enter your base pay amount");
		month.setbasepay(scanner.nextInt());
		
		//prompts user for their expenses
		System.out.println("How much did you pay on rent this much?");
		month.setrent(scanner.nextInt());
		System.out.println("How much was your credit card payment?");
		month.setcreditcard(scanner.nextInt());
		
		//prompts user for QQQ's share price
		System.out.println("What is QQQ's stock price at?");
		double qqq = scanner.nextDouble();
		
		//make variables for total income and expense
		int out = month.getrent() + month.getcreditcard();
		double in = month.getbah() +  month.getbas() + month.getbasepay();
		double left = in - out;
		
		
		
		//prints out the entered amounts
		System.out.println("IN: ");
		System.out.println(in);
		System.out.println("OUT: ");
		System.out.println(out);
		month.leftover(in, out);
		shares (left, qqq);
		
		
		
		
	}
	//methods
	public static void shares (double leftover, double qqq) {
		double z =  leftover / qqq;
		System.out.printf("You can buy %.0f shares of QQQ", z);
	}
	
}


