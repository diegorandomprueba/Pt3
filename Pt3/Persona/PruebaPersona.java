package Pt3.Persona;
import Pt3.Data.Data;
import Pt3.DocIdentitat.DocIdentitat;

public class PruebaPersona {
    public static void main(String[] args) {
        // Crear instancias de Data y DocIdentitat válidas
        Data data1 = new Data(23, 5, 1990);
        DocIdentitat dni1 = new DocIdentitat(12345678, "A");

        Persona persona1 = new Persona("Joan", "Garcia", data1, dni1);
        System.out.println(persona1);

        // Crear una persona con el constructor sin parámetros
        Persona persona2 = new Persona();
        System.out.println(persona2);

        // Mostrar el número total de personas creadas
        System.out.println("Total personas creadas: " + Persona.getNumPersona());
    }
}
