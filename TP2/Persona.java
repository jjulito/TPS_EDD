package TP2;

// clase auxiliar para testear el ejercicio de invertir

public class Persona {
    private String nombre;
    private int edad, DNI;
    
    public Persona(String nom, int e, int doc)
    {
        nombre = nom;
        edad = e;
        DNI = doc;
    }

    public int getEdad()
    {
        return edad;
    }

    public int getDNI()
    {
        return DNI;
    }
    
    public String getNombre()
    {
        return nombre;
    }

    public void setEdad(int e)
    {
        edad = e;
    }
    
    public void setDNI(int doc)
    {
        DNI = doc;
    }
    
    public void setNombre(String nom)
    {
        nombre = nom;
    }

    public String toString()
    {
        return nombre+" "+edad+" "+DNI;
    }
}
