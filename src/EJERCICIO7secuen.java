import java.util.Scanner;
public class EJERCICIO7secuen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nivel de satisfacción con la vida del 1 al 10");
        int dato1 = scanner.nextInt();
        System.out.println("Ingrese su nivel de estrés siendo 1 muy estresado y 10 sin estrés");
        int dato2 = scanner.nextInt();
        System.out.println("Ingrese su nivel de salud del 1 al 10");
        int dato3 = scanner.nextInt();
        double indiceFelicidad = (double) (dato1 + dato2 + dato3) / 3;
        System.out.println("Su nivel/indice de felicidad segun los anteriores factores es de: "+indiceFelicidad);
}


}
