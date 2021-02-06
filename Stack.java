/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Interface: Stack
 ***************************************/

public interface Stack <E> {

    public void push(E data);

    public E pop();

    public E peek();

    public boolean empty();

    public int size();

}