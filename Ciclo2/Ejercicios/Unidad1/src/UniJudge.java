import java.util.Scanner;

public class UniJudge {

    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        int numero_empleado = escaner.nextInt();
        int horas_trabajadas = escaner.nextInt();

        double monto_por_horas = escaner.nextDouble();

        double salario = monto_por_horas * horas_trabajadas;

        System.out.println("NUMBER = " + numero_empleado);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}