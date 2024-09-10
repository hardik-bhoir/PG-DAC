package org.dac;

import java.util.Scanner;

class CompoundInterestCalculator{
	private double principal;
	private double annualInterestRate;
	private double years;
	private double numberOfCompounds;
	private double futureValue;
	private double totalInterest;
	public void acceptrecord (){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal");
		this.principal = sc.nextDouble();
		System.out.println("get the annual interestn rate");
		this.annualInterestRate = sc.nextDouble() / 100;
		System.out.println("get the years");
		this.years = sc.nextDouble();
		System.out.println("get the number of compounds");
		this.numberOfCompounds = sc.nextDouble();
	}
	
	public void calculateFutureValue() {
		double interest = annualInterestRate/numberOfCompounds;
		double period = numberOfCompounds*years;
		this.futureValue = principal*Math.pow((1+ interest),period);
		this.totalInterest = futureValue-principal;
	
	}
	
	public void printrecord() {
		System.out.println("future value is  : "+this.futureValue);
		System.out.println("total interest is : "+this.totalInterest);
	

	}
	
}

public class Program2 {
	public static void main(String[] args) {
		CompoundInterestCalculator cal = new CompoundInterestCalculator();
		cal.acceptrecord();
		cal.calculateFutureValue();
		cal.printrecord();
		
	}

}


