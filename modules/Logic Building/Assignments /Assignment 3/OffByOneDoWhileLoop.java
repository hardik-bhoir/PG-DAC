public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <= 5);
}
}

//the while condition gets false hence loop dosent continue
//to print numbers from 1 to 5 we need to initialize the num varaiable with the value 5
//OR WE HAVE TO USE INCERMENT OPERATOR