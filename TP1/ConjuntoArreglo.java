package TP1;

public class ConjuntoArreglo<E> implements Conjunto<E> {
    private int size;
    private E[] array;
    
    public ConjuntoArreglo(int max)
    {
        array = (E[]) new Object[max]; // se utiliza cast porque no se puede crear un array de elementos genéricos
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public int capacity()
    {
        return array.length;
    }

    public boolean isEmpty()
    {
        return (size==0);
    }

    public E get(int i)
    {
        return array[i];
    }

    public void put(E elem)
    {
        array[size] = elem;
        size++;
    }

    public boolean pertenece(E elem)
    {
        boolean esta = false;
        for (int i=0;i<size;i++)
            { if (array[i].equals(elem)) { esta = true; } } 
        return esta;
    }

    public Conjunto<E> interseccion(Conjunto<E> c)
    {
        Conjunto<E> toRet = new ConjuntoArreglo<E>(array.length);
        for (int i=0;i<size;i++)
        {
            if (c.pertenece(array[i]) && !toRet.pertenece(array[i])) { toRet.put(array[i]); }
        }
        return toRet;
    }

    private boolean perteneceRec(E elem){
		return perteneceRec(elem,size() - 1);
	}
	
	/**
	 * Caso base: El arreglo esta vacio, el elemento no esta.
	 * Caso base: El elemento esta en la posicion n del arreglo.
	 * Caso recursivo: El elemento no esta en la posicion n del arreglo, compruebo la posicion anterior 
	 * @param elem Elemento a buscar.
	 * @param n Posicion del arreglo en la que buscar, comienza desde el ultimo elemento insertado. 
	 * @return Retorna verdadero si el elemento esta en el arreglo, falso si no lo esta.
	 */
	private boolean perteneceRec(E elem, int n) {
		boolean esta = false;
		if (n != -1) {
			if (array[n].equals(elem)) {
				esta = true;
			} else {
				esta = perteneceRec(elem,n-1);
			}
		} 
		return esta;
	}
}
