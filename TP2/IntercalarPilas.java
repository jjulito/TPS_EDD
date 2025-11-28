package TP2;

import java.util.Stack;

public class IntercalarPilas {
    public static void main(String[] args) {
    Stack<Integer> p1 = new Stack<Integer>();
    Stack<Integer> p2 = new Stack<Integer>();
    
    p1.push(1);
    p1.push(2);
    p1.push(3);
    p2.push(4);
    p2.push(5);
    p2.push(6);
    p2.push(7);

    Stack<Integer> p3 = intercaladas(p1,p2);

    System.out.println();
    while (!p3.isEmpty())
    {
        System.out.println(p3.pop());
    }
    // resultado esperado = 4 5 1 6 2 7 3
    }

    public static <E> Stack<E> intercaladas(Stack<E> p1, Stack<E> p2)
    {
        Stack<E> toRet = new Stack<E>();

        while (!p1.isEmpty() && !p2.isEmpty())
        {
            toRet.push(p1.pop());
            toRet.push(p2.pop());
        }

        while (!p1.isEmpty())
        {
            toRet.push(p1.pop());
        }

        while(!p2.isEmpty())
        {
            toRet.push(p2.pop());
        }

        return toRet;
    }
}
