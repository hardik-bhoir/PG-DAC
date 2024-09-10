package org.dac;

import java.util.Scanner;

class LoanAmortizationCalculator{
	private double principal;
	private int loanterm;
	private double annualinterest;
	private double monthlypayment;
	private double totalamount;
	public void acceptrecord (){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal");
		this.principal = sc.nextDouble();
		System.out.println("enter loan term");
		this.loanterm = sc.nextInt();
		System.out.println("enter annual interest");
		this.annualinterest = sc.nextDouble();
	}
	
	public void calculateMonthlyPayment() {
		double monthlyinterest= annualinterest/12/100;
		int numberOfMonths = loanterm*12;
		this.monthlypayment = principal*(monthlyinterest*Math.pow(1+monthlyinterest,numberOfMonths))/(Math.pow(1+monthlyinterest , numberOfMonths)-1);
		this.totalamount = monthlypayment*numberOfMonths;
		
	}
		
	public void printrecord() {
		System.out.println("monthlypayment : "+this.monthlypayment);
		System.out.println("total amount : "+this.totalamount);
	

	}
	
}

public class Program {
	public static void main(String[] args) {
		LoanAmortizationCalculator cal = new LoanAmortizationCalculator();
		cal.acceptrecord();
		cal.calculateMonthlyPayment();
		cal.printrecord();
		
	}

}


