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

    // Es una forma de comprobar el correcto funcionamiento de una parte del código
    // en especifico, esto con el fin de asegurar que cada unidad sea eficiente por separado.
    // La idea central es escribir casos de prueba para cada método de forma independiente,
    // básicamente ignorando el resto del código. Posteriormente las partes independientes probadas
    // se integran para un funcionamiento completo.

    // JUnit es un conjunto de bibliotecas utilizadas en Java para facilitar la implementación
    // de pruebas unitarias y al mismo tiempo codificar el proyecto principal.

    // JMockit y Mockito son marcos de prueba que permiten crear Mock-Object (Objetos de burla),
    // los cuales son substitutos de objetos reales para que se utilicen como temporales si es necesario.
    // Un ejemplo seria si la complejidad del objeto real es alta y se necesita obtener datos específicos
    // como respuesta.


}
