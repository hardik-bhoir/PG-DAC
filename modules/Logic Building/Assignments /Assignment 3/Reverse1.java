 class Reverse1{
	 public static void main(String args[]){
		 int num=1234,lastDigit,reverseNum=0;
		 while(num!=0){
			 lastDigit= num%10;
			 reverseNum= reverseNum*10 + lastDigit;
			 num = num/10;
		}
		System.out.println(reverseNum);
		 
	}
	
	 
	 
	 
 }