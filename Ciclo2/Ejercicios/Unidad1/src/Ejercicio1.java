import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Clase -Scanner- utilizando un objeto (entrada)
                                                  // perteneciente a la clase Scanner

        System.out.println("Escriba nombre del alumno");

        String nombre = entrada.nextLine();

        System.out.println("Introduce nota 1");
        double Nota1 = entrada.nextDouble();

        System.out.println("Introduce nota 2");
        double Nota2 = entrada.nextDouble();

        System.out.println("Introduce nota 3");
        double Nota3 = entrada.nextDouble();

        double promedio = (Nota1 + Nota2 + Nota3) / 3;

        if (promedio >= 3) {
            System.out.println(nombre + " logro aprobar el ciclo");
        } else {
            System.out.println(nombre + " no logro aprobar el ciclo");

        }

        entrada.close();

    }

}