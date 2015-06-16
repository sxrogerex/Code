package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public abstract class TravelBudget {
    protected abstract double getBudgetOfDayOne();

    protected abstract double getBudgetOfDayTwo();

    protected abstract double getBudgetOfDayThree();

    public final double getBudget() {
        return getBudgetOfDayOne() + getBudgetOfDayTwo() + getBudgetOfDayThree();
    }
}
