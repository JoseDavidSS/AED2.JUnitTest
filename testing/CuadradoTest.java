import mockit.Expectations;
import mockit.Mocked;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuadradoTest {

    @Test
    public void testArea() {
        int largo1 = 10;
        int largo2 = 2;
        Cuadrado c = new Cuadrado(largo1, largo2);
        int area = c.calcularArea();
        assertEquals(20, area);
    }

    @Test
    public void mockServer(@Mocked MockServer server){
        Cuadrado c = new Cuadrado(10, 2);
        new Expectations(){{
            server.connect(c); result = -1;
        }};
    }


}
