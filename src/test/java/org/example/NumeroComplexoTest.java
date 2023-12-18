package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumeroComplexoTest {

    @Test
    public void testSoma() {
        NumeroComplexo numero1 = new NumeroComplexo(2, 3);
        NumeroComplexo numero2 = new NumeroComplexo(1, 4);

        numero1.adiciona(numero2);

        assertEquals("3.0+7.0i", numero1.toString());
    }

    @Test
    public void testSubtracao() {
        NumeroComplexo numero1 = new NumeroComplexo(5, 8);
        NumeroComplexo numero2 = new NumeroComplexo(2, 3);

        numero1.subtrai(numero2);

        assertEquals("3.0+5.0i", numero1.toString());
    }

    @Test
    public void testModulo() {
        NumeroComplexo numero = new NumeroComplexo(3, 4);

        double modulo = numero.modulo();

        assertEquals(5.0, modulo);
    }
}
