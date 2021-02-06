/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Interface: CalculadoraGeneral
 ***************************************/

//Se crea la Interfaz CalculadoraGeneral
public interface CalculadoraGeneral {

    /** 
     * Pre: Se ingresa la expresion
     * @param expresion expresiones con el formato PostFix
     * @return String regresa el resultado de la operacion
     * Post: Regresa el resultado de la expresion que se evalua
     */
    public String Calculo(String expresion);
    
}
