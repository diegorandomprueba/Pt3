package Pt3.Persona;
import Pt3.Data.Data;
import Pt3.DocIdentitat.DocIdentitat;

public class Persona {
    // Atributos privados
    private String nom;
    private String cognoms;
    private Data dataNaixement;
    private DocIdentitat dni;
    
    // Atributo estático que se incrementa cada vez que se crea una nueva Persona
    private static int numPersona = 0;

    // Constructor sin parámetros
    public Persona() {
        // Incrementamos numPersona cada vez que se crea una instancia
        numPersona++;
    }

    // Constructor con parámetros que valida dataNaixement y dni
    public Persona(String nom, String cognoms, Data dataNaixement, DocIdentitat dni) {
        if (dataNaixement != null && dataNaixement.isDataValida() && dni != null && dni.isValid()) {
            this.nom = nom;
            this.cognoms = cognoms;
            this.dataNaixement = dataNaixement;
            this.dni = dni;
            numPersona++; // Incrementamos el contador estático
        } else {
            System.out.println("Error: Datos inválidos para crear la persona.");
        }
    }

    // Método toString para mostrar la persona en el formato solicitado
    @Override
    public String toString() {
        return nom + " " + cognoms + " | " + dataNaixement + " | " + dni;
    }

    // Getters opcionales si necesitas acceder a los atributos
    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public Data getDataNaixement() {
        return dataNaixement;
    }

    public DocIdentitat getDni() {
        return dni;
    }

    // Getter para obtener el valor actual de numPersona
    public static int getNumPersona() {
        return numPersona;
    }
}
