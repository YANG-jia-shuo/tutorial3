package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test
    public void testAdd() {
        Calc c = new Calc();
        assertEquals(5, c.add(2,3));
    }

    @Test
    public void testSub() {
        Calc c = new Calc();
        assertEquals(1, c.sub(3,2));
    }
}
