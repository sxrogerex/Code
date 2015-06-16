package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public class ToBritishVirginIslands extends TravelBudget{
	@Override
    protected double getBudgetOfDayOne() {
        return 50000;
    }

    @Override
    protected double getBudgetOfDayTwo() {
        return 60000;
    }

    @Override
    protected double getBudgetOfDayThree() {
        return 40000;
    }
}
