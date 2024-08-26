public class InfiniteForLoop {
	/*public static void main(String[] args) {
	for (int i = 0; i < 10; i--) {
	System.out.println(i);
}
}
}
*/
/* error investigation: the value of i will always be less than 10 i,e the condition wont get false, hence it runs infinitely
erro correction: instead of fecrementing the control varaible if we increment then after point the condition will get false and it will come out of loop*/

// corrected code:

	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	System.out.println(i);
}
}
}