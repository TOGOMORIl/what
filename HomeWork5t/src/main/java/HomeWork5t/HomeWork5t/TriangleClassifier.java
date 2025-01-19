package HomeWork5t.HomeWork5t;

enum Triangle_Types {
	equilateral, isosceles, Scalene, Nottriangle, ERROR

}

public class TriangleClassifier {
	private isIsosceles IsIsosceles;
	private isTriangle isTriangle;
	private isEquilateral IsEquilateral;

	TriangleClassifier(isIsosceles IsIsosceles, isTriangle IsTriangle, isEquilateral IsEquilateral) {
		this.IsIsosceles = IsIsosceles;
		this.isTriangle = IsTriangle;
		this.IsEquilateral = IsEquilateral;
	}

	public String classifyTriangle(int a, int b, int c) {
		Triangle_Types triangle = null;
	if(isTriangle.test(a, b, c)){
	    if (this.IsEquilateral.test(a, b, c)) {
	        triangle= Triangle_Types.equilateral;
	        }else if(this.IsIsosceles.test(a, b, c)) {
	        triangle= Triangle_Types.isosceles;
	        }else {
	        triangle= Triangle_Types.Scalene;}    
	    }
	return triangle.toString();
	}
}



