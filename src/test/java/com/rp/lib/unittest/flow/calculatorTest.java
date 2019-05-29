package com.rp.lib.unittest.flow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add() {
        calculator c = new calculator();
        int result = c.add(1,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    void sub() {
        calculator c = new calculator();
        int result = c.sub(100,2);
        Assertions.assertEquals(98,result);
    }
}