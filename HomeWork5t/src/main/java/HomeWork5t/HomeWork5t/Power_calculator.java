package HomeWork5t.HomeWork5t;

public class Power_calculator {
    private Multiplier multiplier;

    Power_calculator(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    double power(double a, double b) {
        double result = 1;
        
        for (int i = 0; i < (int) b; i++) {
            result = multiplier.multiply(result, a);
        }
        
        return result;
    }
}
