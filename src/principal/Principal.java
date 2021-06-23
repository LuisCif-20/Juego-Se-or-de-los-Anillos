package principal;

import tropas.*;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    private Juego juego = new Juego();
    private Scanner scan = new Scanner(System.in);

    public Principal() {
        int opcion;
        do {
            System.out.println("\nBienvenido al juego de el señor de los anillos");
            System.out.println("¿Que quieres Hacer");
            System.out.println("1) Jugar");
            System.out.println("2) Salir");
            opcion = Integer.parseInt(scan.nextLine());
            if (opcion == 1) {
                juego.jugar();
            } else {
                System.out.println("Hasta Pronto");
            }
        } while (opcion == 1);
    }
}
