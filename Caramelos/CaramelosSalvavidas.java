import java.util.Stack;

public class CaramelosSalvavidas {

    public static void main(String[] args) {
        // Crear una pila de caramelos
        Stack<String> caramelos = new Stack<>();
        
        // Agregar caramelos al paquete (pila)
        caramelos.push("Rojo");
        caramelos.push("Amarillo");
        caramelos.push("Verde");
        caramelos.push("Amarillo");
        caramelos.push("Azul");

        // Simular el proceso de comer caramelos amarillos
        Stack<String> caramelosNoAmarillos = new Stack<>();
        
        while (!caramelos.isEmpty()) {
            String caramelo = caramelos.pop();
            if (caramelo.equals("Amarillo")) {
                System.out.println("Comiendo caramelo: " + caramelo);
            } else {
                caramelosNoAmarillos.push(caramelo);
            }
        }

        // Regresar los caramelos de otros colores al paquete
        while (!caramelosNoAmarillos.isEmpty()) {
            caramelos.push(caramelosNoAmarillos.pop());
        }

        // Imprimir el estado final de la pila de caramelos
        System.out.println("Caramelos restantes en el paquete (en orden): " + caramelos);
    }
}
