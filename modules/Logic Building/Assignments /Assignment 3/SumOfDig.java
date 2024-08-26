class SumOfDig{
	public static void main(String args[]){
		int num = 9876,lastDig,extractedNum = 0;
		while(num>0)
		{
			lastDig = num%10;
			extractedNum+= lastDig;
			num = num/10;
			
		}
		
		System.out.println("sum: "+30*extractedNum);
	}


}