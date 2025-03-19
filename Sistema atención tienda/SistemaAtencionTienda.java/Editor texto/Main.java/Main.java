import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class EditorTexto {
    private List<String> texto;
    private List<String> pilaDeshacer;

    public EditorTexto() {
        texto = new ArrayList<>();
        pilaDeshacer = new ArrayList<>();
    }

    public void agregarLinea(String linea) {
        texto.add(linea);
        pilaDeshacer.clear(); // Limpiar la pila de rehacer al agregar nueva línea
    }

    public void deshacer() {
        if (!texto.isEmpty()) {
            String lineaDeshacada = texto.remove(texto.size() - 1); // Elimina la última línea
            pilaDeshacer.add(lineaDeshacada); // La agrega a la pila de rehacer
        }
    }

    public void rehacer() {
        if (!pilaDeshacer.isEmpty()) {
            String lineaRehazada = pilaDeshacer.remove(pilaDeshacer.size() - 1); // Elimina la última línea deshechada
            texto.add(lineaRehazada); // La agrega de nuevo al texto
        }
    }

    public void mostrar() {
        if (!texto.isEmpty()) {
            for (String linea : texto) {
                System.out.println(linea);
            }
        } else {
            System.out.println("No hay texto para mostrar.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese texto o comando (DESHACER, REHACER, MOSTRAR, SALIR): ");
            String entrada = scanner.nextLine();

            if (entrada.equals("SALIR")) {
                break;
            } else if (entrada.equals("DESHACER")) {
                editor.deshacer();
            } else if (entrada.equals("REHACER")) {
                editor.rehacer();
            } else if (entrada.equals("MOSTRAR")) {
                editor.mostrar();
            } else {
                editor.agregarLinea(entrada);
            }
        }

        scanner.close();
    }
}
