import java.util.Scanner;
class Age{
	public static void main(String arrgs []){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of a person");
		int age = sc.nextInt();
		if(age>18){
			System.out.println("the person is eligible for voting");
		}else{
			System.out.println("the person is not eligible for voting");
		}
	}
}