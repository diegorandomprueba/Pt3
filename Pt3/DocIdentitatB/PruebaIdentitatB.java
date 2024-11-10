package Pt3.DocIdentitatB;

public class PruebaIdentitatB {

    public static void main(String[] args) {
        int dni = 12345678;
        String nom = "Z";
        System.out.println("-------------------");
        System.out.println("DNI: "+dni+nom);
        System.out.println("Valido? "+DocIdentitatB.isValid(dni, nom));
        System.out.println("-------------------");
        nom = "A";
        System.out.println("DNI: "+dni+nom);
        System.out.println("Valido? "+DocIdentitatB.isValid(dni, nom));
        System.out.println("-------------------");

    }
}
