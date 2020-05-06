
public class Month {
	
	//income attributes
	double basepay;
	int bah;
	int bas;
	//expense attributes
	int rent;
	int creditcard;
	
	//getters & setters
	public double getbasepay() {
		return basepay;
	}
	
	public void setbasepay(int b) {
		this.basepay = b - (b * .12);
	}
	public int getbah() {
		return bah;
	}
	
	public void setbah(int b) {
		this.bah = b;
	}
	public int getbas() {
		return bas;
	}
	
	public void setbas(int b) {
		this.bas = b;
	}
	public int getrent() {
		return rent;
	}
	public void setrent(int b) {
		this.rent = b;
	}
	public int getcreditcard() {
		return creditcard;
	}
	public void setcreditcard(int b) {
		this.creditcard = b;
	}
	
	public void leftover(double x, int y) {
		double z = x - y;
		System.out.println("You have "+z+" remaining to invest");
		}
	
}
