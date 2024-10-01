import java.util.Scanner;
public class EJERCICIO6cond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas horas usted duerme por dia?");
        int horasSueño = scanner.nextInt();
        System.out.println("¿Cuántas horas al día hace ejercicio?");
        int horasEjercicio = scanner.nextInt();
        System.out.println("¿Cuántas comidas saludables consume al día?");
        int comidasSaludables = scanner.nextInt();


        if (horasSueño < 7) {
            System.out.println("te redomiendo que busques la forma de dormir mas horas para mejorar el estado de tu salud.");
        } else if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("¡Buen trabajo! estas durmiendo una cantidad de horas que le sirven al cuerpo.");
        } else {
            System.out.println("Cuidado, dormir demasiado también puede ser un problema.");
        }

        if (horasEjercicio < 1) {
            System.out.println("Intenta hacer más ejercicio al día para mantenerte saludable.");
        } else if (horasEjercicio >= 1 && horasEjercicio <= 2) {
            System.out.println("¡Bien! Estás haciendo ejercicio regularmente.");
        } else {
            System.out.println("Excelente trabajo! Estás muy activo.");
            if (comidasSaludables < 3) {
                System.out.println("Intenta consumir más comidas saludables cada día.");
            } else if (comidasSaludables >= 3 && comidasSaludables <= 5) {
                System.out.println("¡Buen trabajo! Estás consumiendo comidas saludables.");
            } else {
                System.out.println(" exceso, asegúrate de tener un balance en tu dieta.");
            }
    }
        }



    }
