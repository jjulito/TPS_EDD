package TP1;
import java.util.Vector;

public class ConjuntoVector<E> implements Conjunto<E> {
    private Vector<E> vec;

    public ConjuntoVector()
    {
        vec = new Vector<E>();
    }

    public int size()
    {
        return vec.size();
    }

    public int capacity()
    {
        return vec.capacity();
    }

    public boolean isEmpty()
    {
        return vec.isEmpty();
    }

    public E get(int i)
    {
        return vec.get(i);
    }

    public void put(E elem)
    {
        vec.addElement(elem);
    }

    public boolean pertenece(E elem)
    {
        boolean esta = (vec.contains(elem));
        return esta;
    }

    public Conjunto<E> interseccion(Conjunto<E> c)
    {
        Conjunto<E> toRet = new ConjuntoVector<E>();
        if (size() < c.size()) {
			for (int i=0;i<size();i++) {
				if (c.pertenece(vec.get(i))) {
					toRet.put(vec.get(i));
				}
			}
		} else {
			for (int i=0;i<c.size();i++) {
				if (vec.contains(c.get(i))) {
					toRet.put(c.get(i));
				}
			}
		}
		return toRet;
    }
}
