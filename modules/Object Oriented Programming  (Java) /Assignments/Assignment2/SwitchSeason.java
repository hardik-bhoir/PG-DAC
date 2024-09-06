import java.util.Scanner;
class SwitchSeason{
	public static void main(String args []){
		System.out.println("enter the month");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		switch(month){
			case 12:
			case 1:
			case 2:
			System.out.println("winter");
			break;
			case 3:
			case 4:
			case 5:
			System.out.println("spring");
			break;
			case 6:
			case 7:
			case 8:
			System.out.println("summer");
			break;
			case 9:
			case 10:
			case 11:
			System.out.println("autumn");
			break;
			default :
			System.out.println("invalid output");
			
		}
	} 

}