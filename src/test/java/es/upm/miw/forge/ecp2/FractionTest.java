package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction ft;

    @Before
    public void before() {
        ft = new Fraction(1, 2);
    }

    @Test
    public void testFractionPlus() {
    		Fraction ft2 = new Fraction(1, 2);
        assertEquals(1.0, ft.plus(ft2), 10e-5);
    }
}
