import java.util.Scanner;

class Season{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		int month = sc.nextInt();
		if(month == 12 || month == 1 || month == 2){
			System.out.println("its a month winter");
		}else if(month == 3 || month == 4 || month == 5){
			System.out.println("its a month spring");
		}else if(month == 6 || month == 7 || month == 8){
			System.out.println("its a month summer");
		}else if(month == 9 || month == 10 || month == 11){
			System.out.println("its a month autumn");
		}
	}

}