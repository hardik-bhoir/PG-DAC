package in.acts.cdac;

import java.util.Scanner;

class LoanAmortizationCalcultor {
	private double amount;
	private double annualInterest;
	private int loanTerm;

	public LoanAmortizationCalcultor() {
		this.amount = 0.0;
		this.annualInterest = 0.0;
		this.loanTerm = 0;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setannualInterest(double annualInterest) {
		this.annualInterest = annualInterest;
	}

	public double getannualInterest() {
		return this.annualInterest;
	}

	public void setloanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public int getloanTerm() {
		return this.loanTerm;
	}
	
	public double calculatePayament() {
		double numberofmonths = this.loanTerm* 12;
		double monthlyInterest= annualInterest/12/100;
		double monthlyPayment = amount* (monthlyInterest*Math.pow(1+ monthlyInterest, numberofmonths))/(Math.pow(1+ monthlyInterest,  numberofmonths)-1);
		return monthlyPayment;
	}	
	public double calculateTotalAmount() {
		double numberofmonths = this.loanTerm* 12;
		double monthlyPayment= calculatePayament();
		double totalAmount = numberofmonths*monthlyPayment;
		return totalAmount;
	}
	
}

class LoanAmortizationCalcultorutil{
	private LoanAmortizationCalcultor cal = new LoanAmortizationCalcultor();
	final Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter the values");
		cal.setAmount(sc.nextDouble());
		cal.setannualInterest(sc.nextDouble());
		cal.setloanTerm(sc.nextInt());
	}
	public void printRecord() {
		System.out.println("Amount is "+cal.getAmount());
		System.out.println("annual intersest rate is "+cal.getannualInterest());
		System.out.println("loan term is"+cal.getloanTerm());
		System.out.println("monthly payment is "+cal.calculatePayament());
		System.out.println("total amount is "+cal.calculateTotalAmount());
	}
	
	public int menuList() {
		System.out.println("enter the choice");
		System.out.println("choice = o , exit");
		System.out.println("choice = 1 , accept the record");
		System.out.println("choice = 2 , print the record");
		int choice = sc.nextInt();
		return choice;
				
	}
	
}

public class Program1 {
	public static void main(String args[]) {
		int choice;
		final Scanner sc = new Scanner(System.in);
		LoanAmortizationCalcultorutil util = new LoanAmortizationCalcultorutil();
		while((choice = util.menuList())!=0) {
			switch(choice) {
			case 1:
				util.acceptRecord();
				break;
			case 2:
				util.printRecord();
				break;
			}
		}
		
	}
}

