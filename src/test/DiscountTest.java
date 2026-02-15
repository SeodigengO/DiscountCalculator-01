package test;

import main.DiscountCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {

    @Test
    void shouldCalculateDiscountAmount() {
        DiscountCalculator calculator =  new DiscountCalculator(100.0, 10.0);
        assertEquals(10.0, calculator.discountPrice(), 0.001);
    }

    @Test
    void shouldCalculateDiscountedPrice() {
        DiscountCalculator calculator =  new DiscountCalculator(100.0, 10.0);
        assertEquals(90.0, calculator.discountedPrice(), 0.001);
    }

}
