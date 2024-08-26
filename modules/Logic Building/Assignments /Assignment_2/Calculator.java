class Calculator{
	public static void main(String[] args){
		
		int a= 6;
		int b= 2;
		char operate = '/';
		switch(operate){
			case'+':
			System.out.println("the addition is: "+(a+b));	
			break;
			case '-':
			System.out.println("the subtraction is: "+(a-b));
			break;
			case '*':
			System.out.println("the multiplication is: "+(a*b));
			break;
			case '/':
			if(b==0){
				System.out.println("undefined");
			}else{
			System.out.println("the division is: "+(a/b));
			}
			
			break;
		
			
			
		}
		
		
		
		
		
		
		
	}
}






