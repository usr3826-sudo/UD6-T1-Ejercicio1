import java.util.*;
import net.salesianos.Reparaciones.Reparacion;

public class App {
    public static void main(String[] args) {

        Queue<Reparacion> cola = new LinkedList<>();

        cola.add(new Reparacion("R001", "Ana", "Cambio pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Bateria", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto", true));

        System.out.println("Pendientes:");
        for (Reparacion r : cola) {
            System.out.println(r);
        }

        System.out.println("Primera: " + cola.peek());

        Stack<Reparacion> pila = new Stack<>();

        pila.push(cola.poll());
        pila.push(cola.poll());

        System.out.println("Ultima atendida: " + pila.peek());

        pila.pop();

        System.out.println("Pendientes: " + cola.size());
        System.out.println("¿Cola vacia? " + cola.isEmpty());
    }
}