import java.util.Scanner;

public class LoanInput {
    public static void main(String [] args){
        Loan jackLoan = new Loan();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annInterestRate = scanner.nextDouble();
        while (annInterestRate < 0){
            System.out.print("Enter a positive annual interest rate: ");
            annInterestRate = scanner.nextDouble();
        }
//        System.out.println(annInterestRate);
        System.out.print("Enter number of years as an integer: ");
        int yrs = scanner.nextInt();
        while (yrs < 1 ){
            System.out.print("Enter a positive number of years: ");
            yrs = scanner.nextInt();
        }
//        System.out.println(yrs);
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double amt = scanner.nextDouble();
        while (amt <= 0){
            System.out.print("Enter a valid amount: ");
            amt = scanner.nextInt();
        }
//        System.out.println(amt);

        jackLoan.setAnnualInterestRate(annInterestRate);
        jackLoan.setNumberOfYears(yrs);
        jackLoan.setLoanAmount(amt);

        System.out.println("The loan was created on " + jackLoan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f", jackLoan.calMPayment()));
        System.out.println("The total payment is " + String.format("%.2f", jackLoan.calTotalPayment()));
    }
}
