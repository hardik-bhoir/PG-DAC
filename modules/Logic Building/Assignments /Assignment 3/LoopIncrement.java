public class LoopIncrement {
public static void main(String[] args) {
int count = 0;
for (int i = 0; i < 4; i++) {
count += i++ - ++i;
}
System.out.println(count);
}
}
/*
dry run:

	i	count 
	0	0
		(0+0-2)=-2
	3	(-2+3-5)=-4
	6 	condition false
	
	expected op: -4





*/
















