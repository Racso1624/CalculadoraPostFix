/***************************************
 * @author Oscar Fernando López Barrios
 * Carné 20679
 * Algoritmos y Estructuras de Datos
 * 
 * Clase: StackVector
 ***************************************/

import java.util.EmptyStackException;
import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    private Vector<E> data;

    public StackVector(){

        data = new Vector<E>();

    }

    
    /** 
     * Pre: Se ingresa el dato
     * @param item se ingresa un dato para agregar al Vector.
     * Post: Se guarda el dato en Stack
     */
    @Override
    public void push(E item) {
        
        data.add(item);
        
    }

    
    /** 
     * Pre: 
     * @return E se regresa un item.
     */
    @Override
    public E pop() {
        
        return data.remove(size() - 1);

    }

    
    /** 
     * @return E
     * @throws EmptyStackException
     */
    @Override
    public E peek() throws EmptyStackException {
        
        if(data.isEmpty()){
            throw new EmptyStackException();
        }

        return data.elementAt(data.size() - 1);

    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean empty() {
        
        return data.isEmpty();

    }

    
    /** 
     * @return int
     */
    @Override
    public int size() {
        
        return data.size();

    }

}