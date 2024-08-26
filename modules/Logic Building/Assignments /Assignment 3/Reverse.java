class Reverse{
	public static void main(String args[]){
		int num=121, reversenum= 0, lastDigit;
		int newnum=num;
		while(num>0){
			lastDigit= num%10;
			reversenum = reversenum*10 + lastDigit;
			num= num/10;
		}
		System.out.println( reversenum);
		
		
	}
	
}