import java.util.Scanner;
class Discount{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the purchase value: ");
		int purchase = sc.nextInt();
		int discountPercent=0,totalDiscount,finalAmount;
		System.out.println("check it is a member or not: ");
		String isMember = sc.next();
		if(purchase>=1000){
			discountPercent=20;	
		}else if(purchase>500 && purchase<999){
			discountPercent= 10;
		}else if(purchase<500){
			discountPercent=5;	
		}
		if(isMember.equals("yes")){
			discountPercent+=5;
		}
		
		totalDiscount= (purchase*discountPercent)/100;
		finalAmount= purchase-totalDiscount;
		System.out.println("final price is: "+finalAmount);
		
		
		
		
		
			
	}
		
	}

