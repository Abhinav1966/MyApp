import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;


public class MathUtilsTest {
    @Test
    public void testAdd(){
        assertEquals(6, MathUtils.add(a:2, b:3))
    }
    
    @Test
    pubilc void testSubstract(){
        assertEquals(1, MathUtils.substact(a:2, b:1))
    }
}
