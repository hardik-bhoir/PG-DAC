import java.util.Scanner;
class Area{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the shape");
		String shape = sc.nextLine();
		
		
		if(shape.equals("rectangle")){
			System.out.println("enter the lenght of the rectangle");
			double length = sc.nextDouble();
			System.out.println("enter the width of the rectangle");
			double width = sc.nextDouble();
			double area = length*width;
			System.out.println("area of the rectangle is : "+area);
		}else if(shape.equals("square")){
			System.out.println("enter the side of the square");
			double side = sc.nextDouble();
			double area = side*side;
			System.out.println("area of the square is : "+area);
		}else if(shape.equals("triangle")){
			System.out.println("enter the base of the triangle");
			double base = sc.nextDouble();
			System.out.println("enter the height of the triangle");
			double height = sc.nextDouble();
			double area = 0.5*base*height;
			System.out.println("area of the triangle is : "+area);
		}else if(shape.equals("circle")){
			System.out.println("enter the radius of the circle");
			double radius = sc.nextDouble();
			double area = 3.14*radius*radius;
			System.out.println("area of the circle is : "+area);
		}
	}
}