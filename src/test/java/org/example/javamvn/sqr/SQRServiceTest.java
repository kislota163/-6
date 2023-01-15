package org.example.javamvn.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.CalcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcExact1() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.CalcSqrt(300, 400);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();
        int expected = 4;
        int actual = service.CalcSqrt(200, 300);
        Assertions.assertEquals(expected, actual);
    }
}