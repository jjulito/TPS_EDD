package TP2;

import java.util.LinkedList;
import java.util.Queue;

public class ColaImpares {
    public static void main(String[] args) {
    Queue<Integer> test = new LinkedList<Integer>();

    test.add(1);
    test.add(2);
    test.add(3);
    test.add(4);
    test.add(5);

    System.out.println("La cola de números enteros: ");
    for (Integer ent : test) {
        System.out.println(ent);
    }

    Queue<Integer> Impares = impares(test);
    
    System.out.println("La cola de sólo impares: ");
    for (Integer ent : Impares) {
        System.out.println(ent);
    }
    // resultado esperado = 1 3 5

    }

    public static Queue<Integer> impares(Queue<Integer> c)
    {
        Queue<Integer> toRet = new LinkedList<Integer>();

        while (!c.isEmpty())
        {
            if (c.peek() % 2 != 0)
                { toRet.add(c.poll()); }
            c.poll();
        }

        return toRet;
    }
}
