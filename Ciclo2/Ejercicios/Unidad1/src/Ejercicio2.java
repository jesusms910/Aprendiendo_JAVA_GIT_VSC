import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner Entrada_Datos = new Scanner(System.in);

        System.out.println("Nombre de empleado");
        String Nombre_empleado = Entrada_Datos.nextLine();

        System.out.println("Ingrese el numero de horas trabajadas");
        int Horas_trabajadas = Entrada_Datos.nextInt();

        int sueldo = 7000 * Horas_trabajadas * 30;

        System.out.println(Nombre_empleado + " tiene un sueldo de " + sueldo);
        Entrada_Datos.close();
    }

}
