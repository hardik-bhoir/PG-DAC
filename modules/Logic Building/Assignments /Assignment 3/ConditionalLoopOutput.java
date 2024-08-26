public class ConditionalLoopOutput {
public static void main(String[] args) {
int num = 1;
for (int i = 1; i <= 4; i++) {
if (i % 2 == 0) {
num += i;
} else {
num -= i;
}
}
System.out.println(num);
}
}

/* dry run

	i	num
	1	1
		0
	2	2
	3	-1
	4	5
	
	expected op: 3*/












