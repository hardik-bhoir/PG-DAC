class NestedSwitch{
	public static void main(String[] args){
		
		int day =15;
		switch(day){
			case 1:
			 System.out.println("it is a monday");
			 switch(day){
				case 1:
				System.out.println("it is a weekday");
				break;
			
			}
			break;
			case 2:
			System.out.println("it is a tuesday");
			switch(day){
				case 2:
				System.out.println("its a weekday");
				break;
			}
			break;
				case 3:
				System.out.println("it is a wednesday");
				switch(day){
					case 3:
					System.out.println("its a weekday");
					break;
			}
			break;
			case 4:
				System.out.println("it is a thursday");
				switch(day){
					case 4:
					System.out.println("its a weekday");
					break;
			}
			break;
			case 5:
				System.out.println("it is a friday");
					switch(day){
					case 5:
					System.out.println("its a weekday");
					break;
			}
			break;
			case 6:
				System.out.println("it is a saturday");
				switch(day){
					case 6:
					System.out.println("its a weekend");
					break;
			}
			break;
			case 7:
				System.out.println("it is a sunday");
					switch(day){
					case 7:
					System.out.println("its a weekend");
					break;
			}
			break;
			
			default:
				System.out.println("invalid output");
		
		}
	
	
			
			
			
			
	
	}
}




