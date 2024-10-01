import java.util.Scanner;
public class EJERCICIO6secuen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas horas al día tienes disponibles para estudiar?");
        int horasDiarias = scanner.nextInt();


        String[] materias = {"lengua", "Programacion", "ingles", "matematicas", "historia"};


        int horasTotalesSemanales = horasDiarias * 7;


        int horasPorMateria = horasTotalesSemanales / materias.length;
        int horasRestantes = horasTotalesSemanales % materias.length;


        System.out.println("\nPlan de Estudio Semanal:");


        for (int i = 0; i < materias.length; i++) {
            if (i == materias.length - 1) {
                // La última materia recibe las horas restantes, si las hay
                System.out.println(materias[i] + ": " + (horasPorMateria + horasRestantes) + " horas");
            } else {
                System.out.println(materias[i] + ": " + horasPorMateria + " horas");
            }
        }

        scanner.close();
}


}
