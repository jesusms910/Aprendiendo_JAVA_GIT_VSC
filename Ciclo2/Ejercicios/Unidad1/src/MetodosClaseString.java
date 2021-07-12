public class MetodosClaseString {

    public static void main(String[] args) {

        // Algunos metodos de las clase -String- (Manipulación de cadenas)

        String nombre = "Jesús David";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Mi nombre tiene " + nombre.length() + " letras."); // Metodo -length- obtiene cantidad de
                                                                               // letras de una cadena

        System.out.println("La primera letra de  " + nombre + " es la " + nombre.charAt(0)); // Metodo -charAt- Obtiene
                                                                                             // una letra de una cadena

        int ultima_letra = nombre.length();

        System.out.println("Y la ultima letra es " + nombre.charAt(ultima_letra - 1));

    }

}
