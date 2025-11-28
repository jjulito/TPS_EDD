package TP2;

import java.util.Stack;

public class MetodoInvertir {
    public static void main(String[] args) {
    Persona p1 = new Persona("Juan",19,12345);
    Persona p2 = new Persona("Pedro",20,67890);
    Persona p3 = new Persona("Emilio",21,172839);
    Persona[] arreglo = new Persona[3];
    
    arreglo[0] = p1;
    arreglo[1] = p2;
    arreglo[2] = p3;

    System.out.println("El arreglo antes de invertir: ");
    for (int i=0;i<arreglo.length;i++)
    {
        System.out.println(arreglo[i].toString());
    }

    Invertir(arreglo);    
    
    System.out.println("El arreglo luego de invertir: ");
    for (int i=0;i<arreglo.length;i++)
    {
        System.out.println(arreglo[i].toString());
    }

    }
    
    public static void Invertir(Persona[] arreglo)
    {
        Stack<Persona> pilaAux = new Stack<Persona>();
        for (int i=0;i<arreglo.length;i++)
        {
            pilaAux.push(arreglo[i]);
        }
        while (!pilaAux.isEmpty())
        {
            for (int i=0;i<arreglo.length;i++)
            {
                arreglo[i] = pilaAux.pop();
            }
        }
    }

}
