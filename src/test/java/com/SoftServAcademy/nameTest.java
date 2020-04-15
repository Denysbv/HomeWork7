package com.SoftServAcademy;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class nameTest {
    String name = "Boooh_g2";

    @Test
    public void createNameWithStarTest () {
        assertEquals(null, Main.createName("Boooo_d2*"), "should be null, * not expected");
    }
    @Test
    public void createNameTest () {
        assertEquals("Boooh_g2", Main.createName(name), "valid");
    }
    @Test
    public void createLongNameTest () {
        assertEquals(null, Main.createName("223__33_ffffffdgffffffgffdfdf"), "should be null, too long name");
    }
}
