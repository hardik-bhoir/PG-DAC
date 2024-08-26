public class UninitializedWhileLoop {
public static void main(String[] args) {
int count;
while (count < 10) {
System.out.println(count);
count++;
}
}
}


//the compilation error occur because we dosent initialized the count variable
//we have to assig some value to initialize the varaiable such as int count= 0