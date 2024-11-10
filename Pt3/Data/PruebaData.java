package Pt3.Data;

public class PruebaData {
    public static void main(String[] args) {
        // Pruebas de la clase Data

        // Caso 1: Crear una fecha válida
        Data fecha1 = new Data(15, 8, 2023);
        System.out.println("Fecha 1: " + fecha1); // Debería mostrar 15/08/2023

        System.out.println("-------------------");

        // Caso 2: Crear una fecha inválida (día fuera de rango)
        Data fecha2 = new Data(32, 1, 2023); // Día no válido
        System.out.println("Fecha 2: " + fecha2); // Debería mostrar error

        System.out.println("-------------------");

        // Caso 3: Crear una fecha inválida (mes fuera de rango)
        Data fecha3 = new Data(15, 13, 2023); // Mes no válido
        System.out.println("Fecha 3: " + fecha3); // Debería mostrar error

        System.out.println("-------------------");

        // Caso 4: Crear una fecha a partir de un string válido
        Data fecha4 = new Data("28/02/2024");
        System.out.println("Fecha 4: " + fecha4); // Debería mostrar 28/02/2024

        System.out.println("-------------------");

        // Caso 5: Crear una fecha a partir de un string inválido
        Data fecha5 = new Data("31/04/2023"); // Día no válido para abril
        System.out.println("Fecha 5: " + fecha5); // Debería mostrar error

        System.out.println("-------------------");

        // Caso 6: Probar el método nextDay
        System.out.println("Fecha 1 antes de nextDay: " + fecha1);
        fecha1.nextDay();
        System.out.println("Fecha 1 después de nextDay: " + fecha1); // Debería mostrar 16/08/2023

        System.out.println("-------------------");

        // Caso 7: Próximo día en el último día del mes
        Data fecha6 = new Data(31, 12, 2023);
        System.out.println("Fecha 6 antes de nextDay: " + fecha6);
        fecha6.nextDay();
        System.out.println("Fecha 6 después de nextDay: " + fecha6); // Debería mostrar 01/01/2024

        System.out.println("-------------------");

        // Caso 8: Probar el método setDia y setMes
        System.out.println("Fecha 1 base: " + fecha1);
        fecha1.setDia(30); // Cambiar el día a un valor válido
        System.out.println("Fecha 1 después de setDia(30): " + fecha1); // Debería mostrar 30/08/2023

        fecha1.setMes(2); // Cambiar a febrero
        System.out.println("Fecha 1 después de setMes(2): " + fecha1); // Debería mostrar error si el día no es válido

        fecha1.setDia(28); // Cambiar el día a un valor válido para febrero
        System.out.println("Fecha 1 después de setDia(28): " + fecha1); // Debería mostrar 28/02/2023

        fecha1.setDia(29); // Intentar establecer un día no válido TODO:
        System.out.println("Fecha 1 después de setDia(29): " + fecha1); // Debería mostrar error

        System.out.println("-------------------");

        // Caso 9: Probar el constructor sin parámetros
        Data fecha7 = new Data();
        System.out.println("Fecha 7: " + fecha7); // Debería mostrar la fecha actual

        System.out.println("-------------------");

        // Caso 10: Probar el método getMes() y validar su retorno
        int mes = fecha1.getMes();
        System.out.println("Mes de Fecha 1: " + mes); // Debería mostrar 2

        System.out.println("-------------------");

        // Caso 11: Probar el método isDataValida() con fecha inválida
        boolean esValidaInvalida = Data.isDataValida(31, 4, 2023);
        System.out.println("¿Fecha Inválida es válida? " + esValidaInvalida); // Debería ser false
        System.out.println("-------------------");
    }
}