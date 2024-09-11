package in.acts;
import java.util.Scanner;
class DiscountCalculator{
	private int price;
	private float discountPercentage;
	private float discountAmount;
	private float finalPrice;
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter the price of an item");
		this.price = sc.nextInt();
		System.out.println("enter the discount percent on an item");
		this.discountPercentage = sc.nextInt();
	}
	public void calculateDiscount() {
		this.discountAmount = this.price*(this.discountPercentage/100);
		this.finalPrice = this.price - this.discountAmount;
		
	}public void Printrecord() {
		System.out.println("the discount amount is: "+this.discountAmount);
	  System.out.println("the final price is: "+this.finalPrice);
	}
	
}
public class program4 {

	public static void main(String[] args) {
		DiscountCalculator dis = new DiscountCalculator();
		dis.acceptRecord();
		dis.calculateDiscount();
		dis.Printrecord();
		
	
	}

}
