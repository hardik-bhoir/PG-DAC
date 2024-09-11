package in.acts.cdac;

import java.util.Scanner;
class TollBoothManager{
	private int truck;
	private int car;
	private int motorcycle; 
	private float trtruck;
	private float trcar;
	private float trmotorcycle;
	private float totalRevenue;
	private float totalVehicles;
	Scanner sc = new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("enter no of trucks");
		this.truck= sc.nextInt();
		System.out.println("enter no of car");
		this.car= sc.nextInt();
		System.out.println("enter no of motorcycle");
		this.motorcycle= sc.nextInt();
	}
	public void setTollRate() {
		System.out.println("enter the toll rates of truck");
		this.trtruck = sc.nextFloat();
		System.out.println("enter the toll rates of car");
		this.trcar = sc.nextFloat();
		System.out.println("enter the toll rates of motorcycle");
		this.trmotorcycle = sc.nextFloat();
	}
	public void calculateRevenue() {
		this.totalRevenue = (this.truck*this.trtruck)+(this.car*this.trcar)+(this.motorcycle*this.trmotorcycle);
		this.totalVehicles = this.truck+this.car+this.motorcycle;
	}
	public void printRecord() {
		System.out.println("total number of vehicles are: "+this.totalVehicles);
		System.out.println("total revenue of vehicles are: "+this.totalRevenue);
	}
}

public class program5 {

	public static void main(String[] args) {
		TollBoothManager tb = new TollBoothManager(); 
		tb.acceptRecord();
		tb.setTollRate();
		tb.calculateRevenue();
		tb.printRecord();
	}


}
