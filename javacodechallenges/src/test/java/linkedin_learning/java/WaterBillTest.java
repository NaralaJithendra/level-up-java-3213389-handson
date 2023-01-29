package linkedin_learning.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WaterBillTest {
    
    @Test
    public void calculateWaterBill() {
        assertEquals(22.74, WaterBill.calculateWaterBill(1800), 0);
        assertEquals(22.74, WaterBill.calculateWaterBill(2244), 0);
        assertEquals(26.64, WaterBill.calculateWaterBill(2245), 0);
        assertEquals(26.64, WaterBill.calculateWaterBill(2992), 0);
        assertEquals(46.14, WaterBill.calculateWaterBill(6000), 0);
        assertEquals(53.94, WaterBill.calculateWaterBill(8000), 0);
        assertEquals(18.84, WaterBill.calculateWaterBill(0), 0);
        assertEquals(18.84, WaterBill.calculateWaterBill(1496), 0);
        assertEquals(22.74, WaterBill.calculateWaterBill(1497), 0);
        assertEquals(18.84, WaterBill.calculateWaterBill(-20), 0);
    }
}