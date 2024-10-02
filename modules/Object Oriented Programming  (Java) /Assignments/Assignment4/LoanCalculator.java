class LoanAmortization {
private double principal;
private double annualInterestRate;
private int loanTerm;
private double monthlyPayment;
private double totalPayment;
public double getPrincipal() {
return principal;
}
public void setPrincipal(double principal) {
this.principal = principal;
}
public double getAnnualInterestRate() {
return annualInterestRate;
}
public void setAnnualInterestRate(double annualInterestRate) {
this.annualInterestRate = annualInterestRate;
}
public int getLoanTerm() {
return loanTerm;
}
public void setLoanTerm(int loanTerm) {
this.loanTerm = loanTerm;
}
public double getMonthlyPayment() {
return monthlyPayment;
}
public double getTotalPayment() {
return totalPayment;
}
void acceptRecord() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the loan amount (Principal): ");
setPrincipal(sc.nextDouble());
System.out.print("Enter the annual interest rate (in %): ");
setAnnualInterestRate(sc.nextDouble());
System.out.print("Enter the loan term (in years): ");
setLoanTerm(sc.nextInt());
}
void calculateMonthlyPayment() {
double monthlyInterestRate = getAnnualInterestRate() / 12 / 100;
int numberOfMonths = getLoanTerm() * 12;
this.monthlyPayment = getPrincipal() * (monthlyInterestRate * Math.pow((1 +
monthlyInterestRate), numberOfMonths)) /
(Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1);
this.totalPayment = this.monthlyPayment * numberOfMonths;
}
void printRecord() {
System.out.println("Monthly Payment: ₹" + getMonthlyPayment());
System.out.println("Total Payment (over the life of the loan): ₹" +
getTotalPayment());
}}
public class LoanCalculator {
public static void main(String[] args) {
LoanAmortization loan1 = new LoanAmortization();
LoanAmortization loan2 = new LoanAmortization();
System.out.println("Enter details for Loan 1:");
loan1.acceptRecord();
loan1.calculateMonthlyPayment();
loan1.printRecord();
System.out.println("\nEnter details for Loan 2:");
loan2.acceptRecord();
loan2.calculateMonthlyPayment();
loan2.printRecord();
}}