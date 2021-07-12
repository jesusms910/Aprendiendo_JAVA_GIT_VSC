import java.util.*;

public class EntradaSalidadDeDatos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Clase -Scanner- utilizando un objeto (entrada)
                                                  // perteneciente a la clase Scanner

        System.out.println("Escribe tu nombre");

        String nombre = entrada.nextLine();

        System.out.println("Introduce edad");

        int edad = entrada.nextInt();

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");

        }

        entrada.close();
        System.out.println("Hola " + nombre + " el proximo año tentras " + (edad + 1) + " años");
    }

}
