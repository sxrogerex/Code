package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public abstract class DayOneExtra extends TravelBudget implements Extra{
    protected TravelBudget travelBudget;

    protected DayOneExtra(TravelBudget travelBudget) {
        this.travelBudget = travelBudget;
    }

    @Override
    protected final double getBudgetOfDayTwo() {
        return travelBudget.getBudgetOfDayTwo();
    }

    @Override
    protected final double getBudgetOfDayThree() {
        return travelBudget.getBudgetOfDayThree();
    }
}
