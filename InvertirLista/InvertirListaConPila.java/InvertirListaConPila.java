import java.util.Stack;

public class InvertirListaConPila {

    public static void main(String[] args) {
        // Array de entrada
        int[] lista = {1, 2, 3, 4, 5};

        // Invertir la lista
        invertirLista(lista);

        // Imprimir la lista invertida
        System.out.print("Lista invertida: ");
        for (int elemento : lista) {
            System.out.print(elemento + " ");
        }
    }

    public static void invertirLista(int[] lista) {
        // Crear una pila para almacenar los elementos
        Stack<Integer> pila = new Stack<>();

        // Empujar todos los elementos del arreglo a la pila
        for (int elemento : lista) {
            pila.push(elemento);
        }

        // Sacar los elementos de la pila y sobrescribir el arreglo original
        for (int i = 0; i < lista.length; i++) {
            lista[i] = pila.pop();
        }
    }
}