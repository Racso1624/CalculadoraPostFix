/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Clase: Calculadora
 ***************************************/

 //Se crea la Clase Calculadora
public class Calculadora implements CalculadoraGeneral{

    //Se crean las propiedades
    private StackVector<Integer> stackVector;

    //Se crea el metodo Constructor
    public Calculadora(){

        stackVector = new StackVector<Integer>();

    }

    
    /** 
     * Pre: Se ingresa la expresion
     * @param expresion expresiones con el formato PostFix
     * @return String regresa el resultado de la operacion
     * Post: Regresa el resultado de la expresion que se evalua
     */
    @Override
    public String Calculo(String expresion) {

        //Se crea un ciclo para lo caracteres
        for(int i = 0; i < expresion.length(); i++){

            //Se obtiene el caracter de la posicion i
            char caracter = expresion.charAt(i);

            //Se convierte el digito a caracter
            if(Character.isDigit(caracter)){

                int numero = Character.getNumericValue(caracter);
                stackVector.push(numero);

            }

            // Se verifica si el caracter es una letra
            else if(Character.isLetter(caracter)){

                return "No se puede operar, ya que contiene una letra";

            }

            //Se verifica que sea un signo
            else{

                //Se crean los numeros
                int numerouno = stackVector.pop();
                int numerodos = stackVector.pop();

                //Se crea el Switch
                switch(caracter){

                    //Se crean los casos dependiendo del signo
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

        //Se convierte el resultado a String y se devuelve
        int resultado = stackVector.pop();
        String resultadofinal = Integer.toString(resultado);

        return resultadofinal;

    }
    
}
