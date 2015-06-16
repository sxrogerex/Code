package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public class Karting extends DayOneExtra {
    protected Karting(TravelBudget travelBudget) {
        super(travelBudget);
    }

    @Override
    public double getPrice() {
        return 20;
    }

    @Override
    public double getAccumulatedPrice() {
        if (travelBudget instanceof Extra) {
            return getPrice() + ((Extra) travelBudget).getAccumulatedPrice();
        }
        return getPrice();
    }

    @Override
    protected double getBudgetOfDayOne() {
        return travelBudget.getBudgetOfDayOne() + getPrice();
    }
}
