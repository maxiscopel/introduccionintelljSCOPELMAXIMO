import java.util.Scanner;

public class primerclasejava1 {
    public static void main(String[] args) {
        float numero1,numero2,resultadototal;
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        numero1=lectura.nextFloat();
        System.out.println("ingrese el segundo numero ");
        numero2=lectura.nextFloat();
        resultadototal=numero1+numero2;
        System.out.println("la suma de los dos numeros es "+resultadototal);


}}
