import java.util.Scanner;
public class EJERCICIO4secuen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su estado de ánimo (feliz, triste, energético, relajado)");
        String animo = scanner.nextLine();

        switch (animo){
            case "feliz":
                System.out.println("Happy – Pharrell Williams\n" +
                                   "Can’t Stop the Feeling! – Justin Timberlake\n" +
                                   "Walking on Sunshine – Katrina and the Waves");
                break;
            case "triste":
                System.out.println("Someone Like You – Adele\n" +
                                   "Fix You – Coldplay\n" +
                                   "Creep – Radiohead");
                break;
            case "energetico":
                System.out.println("Eye of the Tiger – Survivor\n" +
                                   "Uptown Funk – Mark Ronson ft. Bruno Mars\n" +
                                   "We Will Rock You – Queen");
                break;
            case "relajado":
                System.out.println("Weightless – Marconi Union\n" +
                                   "Banana Pancakes – Jack Johnson\n" +
                                   "Clair de Lune – Claude Debussy\n");
                break;
            default:
                System.out.println("No se encontraron canciones para su estado de animo");
 }
}

        }
