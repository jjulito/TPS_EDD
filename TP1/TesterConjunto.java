package TP1;

public class TesterConjunto {
    public static void main(String[] args) {
        Conjunto<Integer> c1 = new ConjuntoArreglo<Integer>(10);
        c1.put(1);
        c1.put(2);
        c1.put(3);
        c1.put(4);
        c1.put(5);
        System.out.println();
        System.out.println("El size es "+c1.size()); // respuesta esperada = 5
        System.out.println("La capacidad es "+c1.capacity()); // respuesta esperada = 10
        System.out.println("El conjunto está vacío? "+c1.isEmpty()); // respuesta esperada = false
        System.out.println("Los números 1, 3 y 5 pertenecen al arreglo? "+(c1.pertenece(1) && c1.pertenece(3) && c1.pertenece(5)));
        //testeo al inicio, mitad y fin del arreglo, respuesta esperada = true
        System.out.println("El número 0 o 16 pertenecen al arreglo? "+(c1.pertenece(0) || c1.pertenece(16)));
        //testeo valores que no pertenecen al arreglo, respuesta esperada = false

        Conjunto<Integer> c2 = new ConjuntoArreglo<Integer>(5);

        c2.put(2);
        c2.put(2);
        c2.put(3);
        c2.put(4);
        c2.put(1);

        Conjunto<Integer> c3 = c1.interseccion(c2);

        System.out.println("La interseccion entre el conjunto c1 y el conjunto c2 contiene a los valores: ");
        for (int i=0;i<c3.size();i++)
        {
            System.out.println(c3.get(i));
        }
        // resultado esperado = 1,2,3,4
    }
}
