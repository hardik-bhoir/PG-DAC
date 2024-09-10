package org.dac;

import java.util.Scanner;

class BMITracker{
	private double weight ;
	private double height;
	private double years;
	private double BMI;
	private String classification;
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter the weight");
		this.weight = sc.nextDouble();
		System.out.println("enter the height");
		this.height = sc.nextDouble();
	}
	public void calculateBMI() {
		if(this.height>0) {
			this.BMI = this.weight/(this.height*this.height);
		}else {
			System.out.println("enter appropriate height");
		}
	}
	public void classifyBMI() {
		if (this.BMI<18.5) {
			this.classification = "underweight";
		}else if(18.5<this.BMI && this.BMI<24.9) {
			this.classification = "normal weight";
		}else if(25<this.BMI && this.BMI<29.9) {
			this.classification = "overweight";
		}else {
			this.classification = "obesse";	
		}
	}
	public void printRecord() {
		System.out.println("BMI IS: "+this.BMI);
		System.out.println("Your BMI value indicate that you are "+this.classification);
	}	
	
}

public class Program3 {
	public static void main(String[] args) {
		BMITracker tracker = new BMITracker();
		tracker.acceptRecord();
		tracker.calculateBMI();
		tracker.classifyBMI();
		tracker.printRecord();
	}

}


