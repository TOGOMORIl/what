package HomeWork5t.HomeWork5t;

public class isTriangle {
	public  boolean test(int a, int b, int c) {
	    // Check the triangle inequality theorem
	    return (a + b > c) && (a + c > b) && (b + c > a);
	}

}
