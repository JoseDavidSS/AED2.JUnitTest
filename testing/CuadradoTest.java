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
    public void testSuma() {
        Cuadrado c = new Cuadrado(1, 1);
        String result1 = c.sumarStrings("Hello", "Isaac");
        String result2 = c.sumarStrings("Nom", "Nom");
        String result3 = c.sumarStrings("Holi", "Festival");
        assertEquals("HelloIsaac", result1);
        assertEquals("NomNom", result2);
        assertEquals("HoliFestival", result3);
    }

    @Test
    public void mockServer(){
        MockServer server = FakerMock.withFields(MockServer.class, "value", "5");
        Cuadrado c = new Cuadrado(10, 2);
        server.connect(c);
    }


}
