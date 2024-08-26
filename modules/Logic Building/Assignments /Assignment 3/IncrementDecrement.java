public class IncrementDecrement {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}

/*dry run

6-6..5..+4+4..5 
i.e 6-6+4+4
expected op:
5
*/