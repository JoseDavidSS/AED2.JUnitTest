import be.eliwan.jfaker.mockito.FakerMock;
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
    public void mockServer(){
        MockServer server = FakerMock.withFields(MockServer.class, "value", "5");
        Cuadrado c = new Cuadrado(10, 2);
    }


}
