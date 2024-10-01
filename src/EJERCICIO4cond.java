import java.util.Scanner;
public class EJERCICIO4cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese su altura en metros");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30) {
            System.out.println("Obesidad");
        }

    }}
