import java.util.Scanner;

public class MyFinance {

	public static void main(String[] args) {
		//create scanner
		Scanner scanner = new Scanner (System.in);
		
		//create  month for financial inquiry
		Month month = new Month();
		
		//prompts user to enter payment amounts
		//'bah' is basic allowance for housing (military)
		//'bas' is basic allowance for subsistence (military)
		System.out.println("Enter your bah amount");
		month.setbah(scanner.nextInt());
		System.out.println("Enter your bas amount");
		month.setbas(scanner.nextInt());
		
		//base pay is calculated with a 12% federal tax.  User should enter "before tax pay"
		System.out.println("Enter your base pay amount");
		month.setbasepay(scanner.nextInt());
		
		//prompts user for their expenses (rent and credit card)
		System.out.println("How much did you pay on rent this much?");
		month.setrent(scanner.nextInt());
		System.out.println("How much was your credit card payment?");
		month.setcreditcard(scanner.nextInt());
		
		//prompts user for QQQ's share price
		//QQQ is used in this instance.  Ideally would ask what fund user would like to invest
		//in and automatically return share price and amount able to buy
		
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
		//could also put 'month.leftover(in,out)' as first variable here, instead of making 
		//the variable 'left'
		shares (left, qqq);
		
		
	}
	//methods
	public static void shares (double leftover, double qqq) {
		double z =  leftover / qqq;
		//'%.0f' is replaced with whatever is 'z' and is rounded to the tenths place
		System.out.printf("You can buy %.0f shares of QQQ", z);
	}
	
}


