import java.util.ArrayList;
import java.util.Scanner;

public class cargarNotas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        ArrayList <alumno> alumnos = new ArrayList<>();

        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantidad_alumnos = scanner.nextInt();

        for(int i = 0; i < cantidad_alumnos; i++){
            System.out.println("\nAlumno " + (i + 1) + " : ");

            System.out.print("Ingrese el nombre completo: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Ingrese el legajo: ");
            long legajo = scanner.nextLong();
            scanner.nextLine(); // Limpiar el buffer

            // Crear un nuevo alumno
            alumno alumno = new alumno(nombreCompleto, legajo);

            // Notas del alumno
            System.out.print("Ingrese la cantidad de notas del alumno: ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            while (cantidadNotas <= 0) {
                System.out.println("Debe ingresar al menos 1 nota.");
                System.out.print("Ingrese la cantidad de notas del alumno: ");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();
            }
        }
        
    }
}

