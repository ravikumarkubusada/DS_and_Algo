package test.general;

import general.SumOf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    public void testSum() {
        Assertions.assertEquals(12, new SumOf().sum(10,2));
    }
}
