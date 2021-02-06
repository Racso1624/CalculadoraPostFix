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

public class DriverCalculadora {

    
    /** 
     * @param args 
     */
    public static void main(String[] args) {
        
        Calculadora calculadora =  new Calculadora();
        ArrayList<String> calculos = new ArrayList<String>();

        try {
            
            File datos = new File("Datos.txt");
            Scanner scanner =  new Scanner(datos);

            while(scanner.hasNextLine()){

                String linea = scanner.nextLine();
                char[] caracteres = linea.toCharArray();
                String expresion = "";

                for(int i = 0; i < caracteres.length; i++){

                    if(caracteres[i] != ' '){

                        expresion += caracteres[i];

                    }

                }

                calculos.add(expresion);

            }

            scanner.close();

        } catch (FileNotFoundException e) {
            
            System.out.println("\n No se encontro el archivo en la carpeta");

        }

        for (int i = 0; i < calculos.size(); i++) {
            
            System.out.println("\n El resultado de la operacion " + (i + 1) + " PostFix fue: " + calculadora.Calculo(calculos.get(i)));

        }

    }

}
