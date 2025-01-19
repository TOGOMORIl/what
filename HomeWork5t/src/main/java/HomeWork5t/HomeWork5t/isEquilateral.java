package HomeWork5t.HomeWork5t;

public class isEquilateral {
	public boolean test(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a && a == b && b == c;
	}
}
