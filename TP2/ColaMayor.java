package TP2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaMayor {
    public static void main(String[] args) {
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(1);
    q.add(2);
    q.add(30);
    q.add(4);
    q.add(58);
    q.add(6);

    System.out.println();
    System.out.println(mayor(q)); // resultado esperado = 58;

    /*  comprobación cola sin modificaciones 
        resultado esperado = 1 2 30 4 58 6
    */
    while (!q.isEmpty())
    {
        System.out.println(q.poll());
    }
    }

    public static int mayor(Queue<Integer> q)
    {
        int toRet = Integer.MIN_VALUE;
        Queue<Integer> auxiliar = new LinkedList<Integer>();
        /* la idea es consultar valor por valor de la cola, irla recorriendo
        entonces vamos comparando valores SIN extraerlos y los pasamos a la cola auxiliar
        al finalizar el recorrido, antes de retornar un valor, devolvemos los valores de la cola auxiliar
        a la original*/
        while (!q.isEmpty())
        {
            int comparar;
            comparar = q.peek();
            if (comparar>toRet) { toRet = comparar; }
            auxiliar.add(q.poll());
        }

        while (!auxiliar.isEmpty())
        {
            q.add(auxiliar.poll());
        }

        return toRet;
    }
}
