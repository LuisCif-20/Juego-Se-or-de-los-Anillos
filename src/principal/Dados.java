package principal;

import java.util.*;

import tropas.Heroes;

public class Dados {

    // Atributos
    private Random random = new Random();
    private final int DANIO_HEROES = 101;
    private final int DANIO_BESTIAS = 91;
    private int dado1;
    private int dado2;
    private int resultadoArmadura;
    private int resultadoAtaque;

    // Constructor
    public Dados() {

    }

    // Metodos
    public int crearValorAtaque(Object caracter) {
        int promedio;
        if (caracter instanceof Heroes) {
            promedio = DANIO_HEROES;
        } else {
            promedio = DANIO_BESTIAS;
        }
        do {
            dado1 = random.nextInt(promedio);
            dado2 = random.nextInt(promedio);        
        } while (dado1 == dado2);
        if (dado1 > dado2) {
            resultadoAtaque = dado1;
            return resultadoAtaque;
        } else {
            resultadoAtaque = dado2;
            return resultadoAtaque;
        }
    }

    public int darValorArmadura(){
        do {
            dado1 = random.nextInt(21) + 50;
            dado2 = random.nextInt(21) + 50;
        } while (dado1 == dado2);
        if (dado1 > dado2) {
            resultadoArmadura = dado1;
            return resultadoArmadura;
        } else {
            resultadoArmadura = dado2;
            return resultadoArmadura;
        }
    }

    public int incrementarDaño(){
        do {
            dado1 = random.nextInt(11);
            dado2 = random.nextInt(12);
        } while (dado1 == dado2);
        if (dado1 > dado2) {
            return dado1;
        } else {
            return dado2;
        }
    }

}
