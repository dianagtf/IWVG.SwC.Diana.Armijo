package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Before
    public void before() {
    		fraction = new Fraction(1, 2);
    }

    @Test
    public void testSubstraction() {
        fraction = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertEquals(0, fraction.substraction(b), 10e-5);
    } 
    
    @Test
    public void testFractionPlus() {    
    		Fraction ft2 = new Fraction(1, 2);
        assertEquals(1.0, fraction.plus(ft2), 10e-5);
    }
    
    @Test
    public void testGreaterThan() {    
            Fraction ft2 = new Fraction(1, 3);
        assertEquals(true, fraction.greaterThan(ft2));
    }
    

}
