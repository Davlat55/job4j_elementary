package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

public class FitTtTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = FitTt.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170Then89() {
        short in = 170;
        double expected = 89;
        double out = FitTt.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
       }
}