package question7;

/**
 * Created by heisenberg on 2015/6/2.
 */
public class Test {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(30000);
        System.out.println(compare(saver1.getSavingBalance(), 30000));
        saver1.calculateMonthlyInterest();
        System.out.println(compare(saver1.getSavingBalance(),30100));

        SavingAccount saver2 = new SavingAccount(2000);
        System.out.println(compare(saver2.getSavingBalance(), 2000));
        saver2.calculateMonthlyInterest();
        System.out.println(compare(saver2.getSavingBalance(), 2006));

        SavingAccount.modifyInterestRate(0.05);
        System.out.println(SavingAccount.getAnnualInterestRate() == 0.05);
        System.out.println(saver1.getAnnualInterestRate() == 0.05);
        System.out.println(saver2.getAnnualInterestRate() == 0.05);

        saver1.calculateMonthlyInterest();
        System.out.println(compare(saver1.getSavingBalance(), 30225));
        System.out.println(compare(saver2.getSavingBalance(), 2006));
    }

    public static boolean compare(double left, int right){
        return (int)left == right;
    }
}
