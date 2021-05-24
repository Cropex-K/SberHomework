package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceOfOneTest {

    @Test
    public void testEmpty() throws Exception{
        int result = SequenceOfOne.longestSequence("");

        Assertions.assertEquals(0,result);
    }

    @Test
    public void testBlank() throws Exception{
        int result = SequenceOfOne.longestSequence("    ");

        Assertions.assertEquals(0,result);
    }

    @Test
    public void testOnlyZero() throws Exception{
        int result = SequenceOfOne.longestSequence("000000");

        Assertions.assertEquals(0,result);
    }

    @Test
    public void testOnlyOne() throws Exception{
        int result = SequenceOfOne.longestSequence("111111");

        Assertions.assertEquals(6,result);
    }

    @Test
    public void testAlternation() throws Exception{
        int result = SequenceOfOne.longestSequence("1010101010");

        Assertions.assertEquals(1,result);
    }

    @Test
    public void testBegin() throws Exception{
        int result = SequenceOfOne.longestSequence("1110011001");

        Assertions.assertEquals(3,result);
    }

    @Test
    public void testEnd() throws Exception{
        int result = SequenceOfOne.longestSequence("1001100111");

        Assertions.assertEquals(3,result);
    }

    @Test
    public void testMiddle() throws Exception{
        int result = SequenceOfOne.longestSequence("1001110011");

        Assertions.assertEquals(3,result);
    }
}
