import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> elementos;

    public Deque() {
        elementos = new LinkedList<>();
    }

    // Agregar un elemento al frente
    public void agregarAlFrente(T elemento) {
        elementos.addFirst(elemento);
    }

    // Agregar un elemento al final
    public void agregarAlFinal(T elemento) {
        elementos.addLast(elemento);
    }

    // Eliminar un elemento del frente
    public T eliminarDelFrente() {
        if (estaVacio()) {
            throw new IllegalStateException("El deque está vacío");
        }
        return elementos.removeFirst();
    }

    // Eliminar un elemento del final
    public T eliminarDelFinal() {
        if (estaVacio()) {
            throw new IllegalStateException("El deque está vacío");
        }
        return elementos.removeLast();
    }

    // Consultar el elemento del frente
    public T consultarFrente() {
        if (estaVacio()) {
            throw new IllegalStateException("El deque está vacío");
        }
        return elementos.getFirst();
    }

    // Consultar el elemento del final
    public T consultarFinal() {
        if (estaVacio()) {
            throw new IllegalStateException("El deque está vacío");
        }
        return elementos.getLast();
    }

    // Verificar si el deque está vacío
    public boolean estaVacio() {
        return elementos.isEmpty();
    }

    // Obtener el tamaño del deque
    public int obtenerTamano() {
        return elementos.size();
    }

    // Método para imprimir el contenido del deque
    public void imprimir() {
        System.out.println("Contenido del Deque: " + elementos);
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        
        deque.agregarAlFinal(1);
        deque.agregarAlFinal(2);
        deque.agregarAlFrente(0);
        deque.imprimir(); // Debe mostrar [0, 1, 2]

        deque.eliminarDelFrente();
        deque.imprimir(); // Debe mostrar [1, 2]

        deque.eliminarDelFinal();
        deque.imprimir(); // Debe mostrar [1]
    }
}
