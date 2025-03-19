import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaAtencionTienda {
    public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>(); // Cola para almacenar clientes
        Scanner scanner = new Scanner(System.in); // Scanner para leer entradas

        while (true) {
            System.out.print("Ingrese un comando: "); // Mensaje para guiar al usuario
            String comando = scanner.nextLine();

            if (comando.startsWith("LLEGAR")) {
                String nombre = comando.split(" ")[1]; // Extrae el nombre del cliente
                filaClientes.add(nombre); // Agrega el cliente a la cola
                System.out.println("Cliente " + nombre + " ha llegado.");
            } else if (comando.equals("ATENDER")) {
                if (!filaClientes.isEmpty()) {
                    String atendido = filaClientes.poll(); // Atiende al primer cliente
                    System.out.println("Atendiendo a: " + atendido);
                } else {
                    System.out.println("No hay clientes en la fila.");
                }
            } else if (comando.equals("MOSTRAR")) {
                if (filaClientes.isEmpty()) {
                    System.out.println("Fila actual: [vacía]");
                } else {
                    System.out.println("Fila actual: " + filaClientes);
                }
            } else if (comando.equals("SALIR")) {
                System.out.println("Programa finalizado.");
                break; // Sale del bucle
            } else {
                System.out.println("Comando no reconocido.");
            }
        }

        scanner.close(); // Cierra el Scanner
    }
}
