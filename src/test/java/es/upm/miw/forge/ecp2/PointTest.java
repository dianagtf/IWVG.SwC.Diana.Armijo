package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Point;

public class PointTest {
    private Point pt;

    @Before
    public void before() {
        pt = new Point(2, 3, 4);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
        assertEquals(4, pt.getZ());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
        assertEquals(0, pt.getZ());
    }

    @Test
    public void testModulo() {
        assertEquals(5.38516, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
        assertEquals(3, pt.getZ());
    }

    @Test
    public void testToString() {
        assertEquals("Point[2,3,4]", pt.toString());
    }

}
