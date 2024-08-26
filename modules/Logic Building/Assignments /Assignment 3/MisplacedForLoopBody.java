public class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++){
System.out.println(i);
System.out.println("Done");}
}
}

//here scope of for loop is not mentioned amd henced it dosent include sop statement of the body
// we can correct it by defining its scope by putting curly braces