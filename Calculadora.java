/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Clase: Calculadora
 ***************************************/

public class Calculadora implements CalculadoraGeneral{

    private StackVector<Integer> stackVector;

    public Calculadora(){

        stackVector = new StackVector<Integer>();

    }

    
    /** 
     * Pre: Se ingresa la expresion.
     * @param expresion expresiones con el formato PostFix.
     * @return String regresa el resultado de la operacion.
     * Post: Regresa el resultado de la expresion que se evalua.
     */
    @Override
    public String Calculo(String expresion) {

        for(int i = 0; i < expresion.length(); i++){

            char caracter = expresion.charAt(i);

            if(Character.isDigit(caracter)){

                int numero = Character.getNumericValue(caracter);
                stackVector.push(numero);

            }
            else if(Character.isLetter(caracter)){

                return "No se puede operar, ya que contiene una letra";

            }
            else{

                int numerouno = stackVector.pop();
                int numerodos = stackVector.pop();

                switch(caracter){

                    case '+':
                        int suma = numerodos + numerouno;
                        stackVector.push(suma);
                        break;
                    case '-':
                        int resta = numerodos - numerouno;
                        stackVector.push(resta);
                        break;
                    case '*':
                        int multiplicacion = numerodos * numerouno;
                        stackVector.push(multiplicacion);
                        break;
                    case '/':
                        int division = numerodos / numerouno;
                        stackVector.push(division);
                        break;    
                    default:
                        return "No se puede operar, ha ingresado un signo invalido";
                

                }

            }

        }

        int resultado = stackVector.pop();
        String resultadofinal = Integer.toString(resultado);

        return resultadofinal;

    }
    
}
