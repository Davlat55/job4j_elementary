package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;
import ru.job4j.Convertor;

public class ConverterTestTest extends TestCase {

    public void testRubleToEuro() {
    }

    public void testRubleToDollar() {
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        float out = ConverterTest.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        float out = ConverterTest.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}