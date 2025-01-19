package HomeWork5t.HomeWork5t;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class unit_test_triangle_classifier {
    isEquilateral IsEquilateral = Mockito.mock(isEquilateral.class);
    isIsosceles IsIsosceles = Mockito.mock(isIsosceles.class);
    isTriangle IsTriangle = Mockito.mock(isTriangle.class);
    TriangleClassifier triTriangleClassifier = new TriangleClassifier(IsIsosceles, IsTriangle, IsEquilateral);

    @Test
    public void unitest() {
        // Stub the mocked methods
        Mockito.when(IsTriangle.test(1, 1, 3)).thenReturn(true);  // Triangle inequality holds
        //Mockito.when(IsEquilateral.test(1, 1, 3)).thenReturn(true); // Equilateral condition
        Mockito.when(IsIsosceles.test(1, 1, 3)).thenReturn(true);

        int a = 1, b = 1, c = 3;
        String expected_result = Triangle_Types.isosceles.toString();
        String actual_result = triTriangleClassifier.classifyTriangle(a, b, c);
        // Assertions
        
        assertEquals(expected_result, actual_result);
        System.out.println(actual_result);
        
       
    }
}
