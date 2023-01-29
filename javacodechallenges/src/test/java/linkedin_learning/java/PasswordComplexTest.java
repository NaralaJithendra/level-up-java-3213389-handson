package linkedin_learning.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordComplexTest {
    @Test
    public void isPasswordComplex_true() {
        assertTrue(PasswordComplex.isPasswordComplex("HPasswordComplexy12"));
        assertTrue(PasswordComplex.isPasswordComplex("1SarahL ength"));
        assertTrue(PasswordComplex.isPasswordComplex("Password12"));
        assertTrue(PasswordComplex.isPasswordComplex("2PassW@ord1"));
        assertTrue(PasswordComplex.isPasswordComplex("01Sall#y9"));
    }

    @Test
    public void isPasswordComplex_false() {
        assertFalse(PasswordComplex.isPasswordComplex("12aB "));
        assertFalse(PasswordComplex.isPasswordComplex("Ab112"));
        assertFalse(PasswordComplex.isPasswordComplex("hPasswordComplexy"));
        //assertFalse(PasswordComplex.isPasswordComplex("hPasswordComplexy_1"));
        assertFalse(PasswordComplex.isPasswordComplex("p assword12"));
        assertFalse(PasswordComplex.isPasswordComplex("Sur18"));
        assertFalse(PasswordComplex.isPasswordComplex(""));
    }
}

