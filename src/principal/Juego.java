package principal;

import tropas.*;
import java.util.*;

public class Juego {
    

    //Atributos
    private Scanner scan = new Scanner(System.in);
    private int control;
    private int controlbestias;
    private int controlheroes;
    private Elfo elfo1 = new Elfo("Legolas");
    private Elfo elfo2 = new Elfo("Aran");
    private Elfo elfo3 = new Elfo("Lara");
    private Elfo elfo4 = new Elfo("Sova");
    private Hobbit hobbit1 = new Hobbit("Frodo");
    private Hobbit hobbit2 = new Hobbit("Chems");
    private Hobbit hobbit3 = new Hobbit("Happy");
    private Hombre hombre1 = new Hombre("Yoru");
    private Hombre hombre2 = new Hombre("Meta");
    private Hombre hombre3 = new Hombre("Cascar");   
    private Heroes[] heroes = {elfo1, hobbit1, elfo2,hombre1, elfo3, hobbit2, hombre2, elfo4, hobbit3, hombre3};
    private Orco orco1 = new Orco("Ganon");
    private Orco orco2 = new Orco("Shaung");
    private Orco orco3 = new Orco("Metro");
    private Orco orco4 = new Orco("Gaunter");
    private Orco orco5 = new Orco("Nordus");
    private Trasgo trasgo1 = new Trasgo("Knigthmon");
    private Trasgo trasgo2 = new Trasgo("Morbius");
    private Trasgo trasgo3 = new Trasgo("Churck");
    private Trasgo trasgo4 = new Trasgo("Cletus");
    private Trasgo trasgo5 = new Trasgo("Tathunus");
    private Bestias[] bestias = {orco1, trasgo1, orco2, trasgo2, orco3, trasgo3, orco4, trasgo4, orco5, trasgo5};


    //Constructor
    public Juego(){
        controlbestias = 10;
        controlheroes = 10;
        control = 10;
    }

    //Metodos
    public void jugar(){
        int ronda;
        do {
            for (int i = 0; i < control; i++) {
                if (heroes[i].getVida()> 0) {
                    heroes[i].mostrarProcesos(bestias[i]);
                }
                if (bestias[i].getVida() > 0) {
                    bestias[i].mostrarProcesos(heroes[i]);
                }
                buscarJugadoresBestias();
                buscarJugadoresHeroes();
                editarControl();
            }
            System.out.println("Ingresa cualquier numero para empezar la otra ronda");
            ronda = Integer.parseInt(scan.nextLine());
        } while (control != 0);

        if (controlheroes == 0) {
            System.out.println("Ganaron Bestias");
        } else {
            System.out.println("Ganaron Heroes");
        }
    }

    public void buscarJugadoresBestias(){
        for (int i = 0; i < controlbestias; i++) {
            if (bestias[i].mostrarSiEstaMuerto()) {
                for (int j = i; j < controlbestias -1; j++) {
                    bestias[j] = bestias[j+1];
                }
                controlbestias--;
            } 
        }
    }

    public void buscarJugadoresHeroes(){
        for (int i = 0; i < controlheroes; i++) {
            if (heroes[i].mostrarSiEstaMuerto() ) {
                for (int j = i; j < controlheroes -1; j++) {
                    heroes[j] = heroes[j+1];
                }
                controlheroes--;
            }
        }
    }

    public void editarControl(){
        if (controlbestias <= controlheroes) {
            control = controlbestias;
        } else {
            control = controlheroes;
        }
    }


}
