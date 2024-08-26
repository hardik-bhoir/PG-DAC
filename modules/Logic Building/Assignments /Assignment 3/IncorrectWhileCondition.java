public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count =0 ) {
System.out.println(count);
count--;
}
}
}

/* error investigation: here the relational operator is not used to define condition and we cannot 
give boolean value to an integer type*/