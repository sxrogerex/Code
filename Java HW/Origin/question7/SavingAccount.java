package question7;

/**
 * Created by jjchen on 2015/6/1.
 */
public class SavingAccount {
    private double annualInterestRate = 0.04;
    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest() {
        savingBalance = savingBalance + savingBalance * annualInterestRate / 12;
    }

    public void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

}
