package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionTest {

    private Fraction fraction;

    @Test
    public void testSubstraction() {
        fraction = new Fraction(1, 2);
        Fraction b = new Fraction(1, 2);
        assertEquals(0, fraction.substraction(b), 10e-5);
    } 

}
