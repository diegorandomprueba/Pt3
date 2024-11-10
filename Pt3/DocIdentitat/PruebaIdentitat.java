package Pt3.DocIdentitat;

public class PruebaIdentitat {
    public static void main(String[] args) {
        System.out.println("-------------------");
        DocIdentitat dni1 = new DocIdentitat(12345678, "Z");
        System.out.println(dni1);
        System.out.println("DNI válido: " + dni1.isValid());
        System.out.println("-------------------");
        DocIdentitat dni2 = new DocIdentitat("12345678Z");
        System.out.println(dni2);
        System.out.println("DNI válido: " + dni2.isValid());
        System.out.println("-------------------");
        System.out.println("-------------------");
        DocIdentitat dni3 = new DocIdentitat("12345678F");
        System.out.println(dni3);
        System.out.println("DNI válido: " + dni3.isValid());
        System.out.println("-------------------");
    }
}
