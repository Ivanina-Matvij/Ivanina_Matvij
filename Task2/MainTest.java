package Task2;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class MainTest {
    /** Проверка основной функциональности класса {@linkplain Calc} */
    @Test
    public void testCalc() {
        Calc calc = new Calc();
        calc.init(0.0);
        assertEquals(0.0, calc.getResult().getY(), .1e-10);
        calc.init(90.0);
        assertEquals(1.0, calc.getResult().getY(), .1e-10);
        calc.init(180.0);
        assertEquals(0.0, calc.getResult().getY(), .1e-10);
        calc.init(270.0);
        assertEquals(-1.0, calc.getResult().getY(), .1e-10);
        calc.init(360.0);
        assertEquals(0.0, calc.getResult().getY(), .1e-10);
    }
    /** Проверка сериализации. Корректность восстановления данных. */
    @Test
    public void testRestore() {
        Calc calc = new Calc();
        double x, y;
        for(int ctr = 0; ctr < 1000; ctr++) {
            x = Math.random() * 360.0;
            y = calc.init(x);
            try {
                calc.save();
            } catch (IOException e) {
                Assert.fail(e.getMessage());
            }
            calc.init(Math.random() * 360);
            try {
                calc.restore();
            } catch (Exception e) {
                Assert.fail(e.getMessage());
            }
            assertEquals(y, calc.getResult().getY(), .1e-10);
            assertEquals(x, calc.getResult().getX(), .1e-10);
        }
    }
}
