class LargestDig{
	public static void main( String args[]){
	int num = 4825,extractNum,largestDig=0;
	while(num>0)
	{
		extractNum  = num%10;
		if(extractNum>largestDig)
		{
			largestDig=extractNum;
			
		}
		num= num/10;
		
	}
	System.out.println("the largest number is: "+largestDig);
	}

}