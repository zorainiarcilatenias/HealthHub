import java.util.Scanner;
import java.util.ArrayList;

public class ClinicaApp {
    // Listas para almacenar datos
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static ArrayList<Usuario> pacientes = new ArrayList<>();
    static ArrayList<Usuario> medicos = new ArrayList<>();
    static ArrayList<String> turnos = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA CLÍNICA ---");
            System.out.println("1. Listar usuarios");
            System.out.println("2. Listar pacientes");
            System.out.println("3. Listar médicos");
            System.out.println("4. Reservar turno");
            System.out.println("5. Listar turnos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> listarUsuarios();
                case 2 -> listarPacientes();
                case 3 -> listarMedicos();
                case 4 -> reservarTurno(sc);
                case 5 -> listarTurnos();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    static void inicializarDatos() {
        // Ejemplo de integración con Usuario y Administrador
        usuarios.add(new Usuario("Juan", "Pérez", "juanp", "1234"));
        usuarios.add(new Administrador("Ana", "García", "anag", "admin", "Sistemas"));
        // Puedes agregar pacientes y médicos de manera similar
    }

    static void listarUsuarios() {
        for (Usuario u : usuarios) {
            System.out.println(u.getNombre() + " " + u.getApellido() + " (" + u.getUsuario() + ")");
        }
    }

    static void listarPacientes() {
        for (Usuario p : pacientes) {
            System.out.println(p.getNombre() + " " + p.getApellido());
        }
    }

    static void listarMedicos() {
        for (Usuario m : medicos) {
            System.out.println(m.getNombre() + " " + m.getApellido());
        }
    }

    static void reservarTurno(Scanner sc) {
        // Implementación pendiente
    }

    static void listarTurnos() {
        for (String t : turnos) {
            System.out.println(t);
        }
    }
}
