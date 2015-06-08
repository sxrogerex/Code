package question7;

/**
 * Created by jjchen on 2015/6/1.
 */
public class SavingAccount {
    private static double annualInterestRate = 0.04;
    private double savingBalance;

    public SavingAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public void calculateMonthlyInterest() {
        savingBalance = savingBalance + savingBalance * annualInterestRate / 12;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

}
