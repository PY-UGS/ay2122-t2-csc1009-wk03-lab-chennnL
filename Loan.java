/**
 * @author linweichen
 * 24/1/2022
 */
import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double calMPayment(){
        double mInterestRate = this.annualInterestRate / 1200; // %
        double f = 1 - (1/(Math.pow(1 + mInterestRate, this.numberOfYears * 12)));
        double mPayment = (this.loanAmount * mInterestRate) / f;
        return mPayment;
    }

    public double calTotalPayment(){
        double totalPayment = this.calMPayment() * this.numberOfYears * 12;
        return totalPayment;
    }
}

