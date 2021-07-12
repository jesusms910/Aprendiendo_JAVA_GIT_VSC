public class MetodosClaseString3 {

    public static void main(String[] args) {

        String alumno1, alumno2;

        alumno1 = "Jesús";

        alumno2 = "jesús";

        System.out.println(alumno1.equals(alumno2)); // Metodo -equals- compara si dos cadenas son iguales
                                                     // (Distinguiendo mayusculas)
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }

}
