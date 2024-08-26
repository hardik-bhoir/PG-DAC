public class WhileLoopBreak {
public static void main(String[] args) {
int count = 0;
while (count < 5) {
System.out.print(count + " ");
count++;
if (count == 3) break;
}
System.out.println(count);
}
}

/* dry run:

 count	print
 0 		0 
 1  	0 1
 2		0 1 2
 3		0 1 2 3 come out of loop after printing
 
 expected output: 0 1 2 3 */




















