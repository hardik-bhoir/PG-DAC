import java.util.Scanner;
class Bmi{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the weight in 'kg'");
		float weight = sc.nextFloat();
		System.out.println("enter the height in 'm'");
		float height = sc.nextFloat();
		float bmi = (weight/(height*height));
		if(bmi<18.5){
			System.out.println("the pserson id underweight");
		}else if(bmi>=18.5 && bmi<24.9){
			System.out.println("the psersons weight is normal");
		}else if(bmi>25 && bmi<29.9){
			System.out.println("the person is overweight");
		}else if (bmi>30){
			System.out.println("the person is obessed");
		}
			
	}
}