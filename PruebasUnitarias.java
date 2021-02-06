/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Pruebas Unitarias
 ***************************************/

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PruebasUnitarias {

    Calculadora calculadora = new Calculadora();
    StackVector<Integer> stackVector = new StackVector<Integer>();

    //Prueba de Calculadora
    @Test
    public void pruebaUno(){

        assertEquals(calculadora.Calculo("12+4*3+"), "15");

    }
    
    //Prueba de StackVector
    @Test
    public void pruebaDos(){

        stackVector.push(10);
        assertEquals(stackVector.peek(), 10);

    }

    //Prueba de StackVector
    @Test
    public void pruebaTres(){

        stackVector.push(100);
        assertEquals(stackVector.pop(), 100);

    }

    //Prueba de StackVector
    @Test
    public void pruebaCuatro(){

        stackVector.push(1000);
        assertEquals(stackVector.size(), 1);

    }

    //Prueba de StackVector
    @Test
    public void pruebaCinco(){

        assertEquals(stackVector.empty(), true);

    }

    //Prueba de Calculadora
    @Test
    public void pruebaSeis(){

        assertEquals(calculadora.Calculo("51+2-2/"), "2");

    }

    //Prueba de Calculadora
    @Test
    public void pruebaSiete(){

        assertEquals(calculadora.Calculo("82+1+"), "11");

    }
}
