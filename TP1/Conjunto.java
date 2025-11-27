package TP1;

public interface Conjunto<E>
{   
    // Retorna la cantidad de elementos del conjunto.
    public int size();
    
    // Retorna la capacidad máxima del conjunto.
    public int capacity();
    
    // Retorna verdadero si y sólo si el conjunto está vacío.
    public boolean isEmpty();
    
    // Retorna el i-ésimo elemento del conjunto. Requiere que la posición sea válida.
    public E get(int i);
    
    /* Agrega un elemento al conjunto. Requiere que el conjunto no esté lleno y que
     el elemento no se encuentre en el conjunto. La comparación se realiza por equivalencia. */
    public void put(E elem);
    
    /* Retorna verdadero si y sólo si el elemento elem se encuentra en el conjunto. La comparación se realiza 
    por equivalencia. */
    public boolean pertenece(E elem);
    
    /* Retorna un nuevo conjunto producto de intersectar los elementos del conjunto que recibe el 
    mensaje y el pasado por parámetro. */
    public Conjunto<E> interseccion(Conjunto<E> c);
}