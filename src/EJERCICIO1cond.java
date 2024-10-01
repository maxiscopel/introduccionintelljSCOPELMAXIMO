import java.util.Scanner;
public class EJERCICIO1cond {
    static String accion = """
            Acción: Rapidos y furiosos: se trata carreras callejeras, autos modificados y emocionantes escenas de espionaje y robos, con un fuerte enfoque en la familia y la lealtad.""";
    static String comedia = """
            Comedia: Son como ninos:  comedia sobre un grupo de amigos de la infancia que se reencuentran años después para pasar un divertido fin de semana juntos, reflexionando sobre la madurez y reviviendo momentos de su juventud. """;
    static String drama = """
            Drama: La La Land: es un drama musical que sigue la historia de amor entre una aspirante a actriz y un pianista de jazz en Los angeles, mientras ambos luchan por alcanzar sus suenos y equilibrar sus ambiciones personales con su relacion.
            """;
    static String ciencia_ficcion = """
            Ciencia ficción: Interstellar (2014) - Una epica aventura espacial que explora temas de supervivencia, amor y los misterios del espacio-tiempo.
            """;
    public static String pelicula(int opcion){
        return switch (opcion) {
            case 1 -> accion;
            case 2 -> comedia;
            case 3 -> drama;
            case 4 -> ciencia_ficcion;
            default -> "Opcion no valida.";
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su genero favorito: \n1. Acción \n2. Comedia \n3. Drama \n4. Ciencia Ficción \nSu opción: ");
        try{
            int op = sc.nextInt();
            System.out.println(pelicula(op));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}


