public class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
}
System.out.println(x);
 // Error: 'x' is not accessible here
}
}

//here the x varaible is out of the while loop scopeand its initialize within the loop hence we cant print that varaible
