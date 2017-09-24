package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserTest {

    @Test
    public void testFullNameCapitalLetters() {
        User user = new User(1, "Juan", "Nadie");
        assertEquals("JUAN NADIE", user.fullNameCapitalLetters());
    }
}
