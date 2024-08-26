public class DecrementingLoop {
public static void main(String[] args) {
int total = 0;
for (int i = 5; i > 0; i--) {
total += i;
if (i == 3) continue;
total -= 1;
}
System.out.println(total);
}
}

/*

dry run:


	i  total
	5	5-1=4
	4	8-1=7
	3	10
	2	12-1=11
	1	12-1=11
	0 condition false
exp op:
11


*/











