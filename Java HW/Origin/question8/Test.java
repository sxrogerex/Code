package question8;

/**
 * Created by jjchen on 2015/6/9.
 */
public class Test {
    public static void main(String[] args) {
        TravelBudget toBritishVirginIslands = new ToBritishVirginIslands();
        isNotAssignableFrom(DayOneExtra.class, ToBritishVirginIslands.class);
        compare(60000, toBritishVirginIslands.getBudgetOfDayTwo());
        compare(40000, toBritishVirginIslands.getBudgetOfDayThree());
        compare(150020, new Karting(toBritishVirginIslands).getBudget());
        Extra extra = new Paragliding(toBritishVirginIslands);
        compare(extra.getPrice(), 500);
        DayOneExtra dayOneExtra = new Paragliding(toBritishVirginIslands);
        compare(extra.getAccumulatedPrice(), dayOneExtra.getAccumulatedPrice());
        TravelBudget travelBudget = new Paragliding(toBritishVirginIslands);
        compare(travelBudget.getBudget(), dayOneExtra.getBudget());
        TravelBudget crazyDayOne = new Paragliding(new Karting(new Karting(new Paragliding(new Paragliding(new ToBritishVirginIslands())))));
        compare(crazyDayOne.getBudget(), 151540);
        compare(1540,((Extra)crazyDayOne).getAccumulatedPrice());
    }

    public static boolean compare(double v1, double v2) {
        System.out.println(v1 == v2);
        return v1 == v2;
    }

    public static boolean isAssignableFrom(Class<?> v1, Class<?> v2) {
        System.out.println(v1.isAssignableFrom(v2));
        return v1.isAssignableFrom(v2);
    }

    public static boolean isNotAssignableFrom(Class<?> v1, Class<?> v2) {
        System.out.println(!v1.isAssignableFrom(v2));
        return !v1.isAssignableFrom(v2);
    }
}
