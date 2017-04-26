package br.metodista.ads5.projeto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 235465
 */
public class CalculadoraTest {
    @Test
    public void testarSoma() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.som(2, -1));
    }
    @Test
    public void testarSubutracao() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sub(10, 5));
    }
    @Test
    public void testarDivisao() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.div(4, 2));
    }
    @Test
    public void testarMultiplicacao() {
        Calculadora calc = new Calculadora();
        assertEquals(20, calc.mult(10, 2));
    }
    
    
    
}
