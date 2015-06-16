package question4;

/**
 * Created by jjchen on 2015/5/4.
 */
public class Pythagorean {

    public void printPythagoreanTriple(int maxLength) {
        for (int i = 0; i <= maxLength; i++) {
            print(3, 3, maxLength);
        }
    }

    /*Required, Do not change*/
    private void print(int a, int b, int c) {
        if (a > b || b > c) {
            throw new IllegalStateException();
        }
        System.out.println(a + "," + b + "," + c);
    }

    /*Required, Do not change*/
    public Pythagorean() {
    }
}
