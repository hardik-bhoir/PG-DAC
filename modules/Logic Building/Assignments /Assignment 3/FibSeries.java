// fibonacci series (upto 21 )--> 0 1 1 2 3 5 8 13 21

class FibSeries{
	public static void main(String args[]){
		int n=10,a=0,b=1,result;
		for(int i=0; i<9; i++){
			System.out.println(a);
			result = a+b;
			a=b;
			b=result;
		}
	}

}