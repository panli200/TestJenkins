import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DemoTest {

    @Test
    public void sumof1and1should2(){
        Sum sum1 = new Sum(1,1);
        assertEquals(2,sum1.getSum());

    }
}
