package question4;

/**
 * Created by jjchen on 2015/5/4.
 */
public class Pythagorean {

    public void printPythagoreanTriple(int maxLength) {
    	boolean C = false;
        for (int i = 1; i < maxLength; i++) {
        	for (int j = 1; j < maxLength; j++) {
        		if(i*i+j*j<=maxLength*maxLength && i<j){
        			for (int k = 1; k <= maxLength; k++) {
        					if(k>j && i+j>k && i*i+j*j==k*k  ){
        						print(i, j, k);
        						C = true;
        				}
        			}
        		}
        	}
        }
        if(C == false){
        	System.out.println("No answers!");
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
