import java.util.Scanner;
public class EJERCICIO5secuen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la distancia en kilometros de su viaje");
        double km = scanner.nextDouble();
        System.out.println("Ingrese el consumo de combustible en litros por km");
        double consumo = scanner.nextDouble();
        System.out.println("Ingrese el precio del combustible por cada litro");
        double precio = scanner.nextDouble();
        double costoTotal =  km * consumo * precio;
        System.out.println("El costo total del viaje es : "+costoTotal);
    }

}
