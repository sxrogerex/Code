package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public class Paragliding extends DayOneExtra{
	 protected Paragliding(TravelBudget travelBudget) {
	        super(travelBudget);
	    }

	    @Override
	    public double getPrice() {
	        return 500;
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