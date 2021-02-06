/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Clase: DriverCalculadora
 ***************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Se crea la clase DriverCalculadora
public class DriverCalculadora {

    
    /** 
     * Pre: Se revisa el documento y se pasa al metodo de la calculadora
     * @param args cualquier tipo de datos
     * Post: Se imprime el resultado de la Calculadora
     */
    public static void main(String[] args) {
        
        //Se instancian las clases
        Calculadora calculadora =  new Calculadora();
        ArrayList<String> calculos = new ArrayList<String>();

        try {
            
            //Se prueba si existe el documento
            File datos = new File("Datos.txt");
            Scanner scanner =  new Scanner(datos);

            //Se realiza un ciclo para pasar las lineas 
            while(scanner.hasNextLine()){

                //Se pasan las lineas a caratectes
                String linea = scanner.nextLine();
                char[] caracteres = linea.toCharArray();
                String expresion = "";

                //Se crea una linea de caracteres juntos
                for(int i = 0; i < caracteres.length; i++){

                    if(caracteres[i] != ' '){

                        expresion += caracteres[i];

                    }

                }

                calculos.add(expresion);

            }

            scanner.close();

        //Se hace el catch para los files
        } catch (FileNotFoundException e) {
            
            System.out.println("\n No se encontro el archivo en la carpeta");

        }

        //Se crea un ciclo para imprimir los resultados de las operaciones
        for (int i = 0; i < calculos.size(); i++) {
            
            System.out.println("\n El resultado de la operacion " + (i + 1) + " PostFix fue: " + calculadora.Calculo(calculos.get(i)));

        }

    }

}
