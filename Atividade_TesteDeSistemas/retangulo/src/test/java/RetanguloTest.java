import org.junit.jupiter.api.Test;

import br.com.example.Retangulo;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {
    
    @Test
    void deveCalcularAreaCorretamenteParaValoresPositivos() {
        Retangulo retangulo = new Retangulo(5, 10); 
        int areaCalculada = retangulo.calcularArea();
        assertEquals(50, areaCalculada, "A área calculada deve ser 50.");
    }
    
    @Test
    void deveCalcularAreaCorretamenteParaValoresIguais() {
        Retangulo retangulo = new Retangulo(7, 7); 
        int areaCalculada = retangulo.calcularArea();
        assertEquals(49, areaCalculada, "A área calculada deve ser 49.");
    }

    @Test
    void deveCalcularPerimetroCorretamenteParaValoresPositivos() {
        Retangulo retangulo = new Retangulo(5, 10); 
        int perimetroCalculado = retangulo.calcularPerimetro();
        assertEquals(30, perimetroCalculado, "O perímetro calculado deve ser 30.");
    }
    
    @Test
    void deveCalcularPerimetroCorretamenteParaOutroExemplo() {
        Retangulo retangulo = new Retangulo(4, 2); 
        int perimetroCalculado = retangulo.calcularPerimetro();
        assertEquals(12, perimetroCalculado, "O perímetro calculado deve ser 12.");
    }
}