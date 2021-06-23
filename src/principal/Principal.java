package principal;

import tropas.Elfo;
import tropas.Hobbit;
import tropas.Hombre;
import tropas.Orco;
import tropas.Trasgo;

public class Principal {
    
    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    private Elfo elfo1 = new Elfo("Legolas");
    private Hobbit hobbit1 = new Hobbit("Frodo");
    private Hombre hombre1 = new Hombre("Marth");
    private Orco orco1 = new Orco("Sephiroth");
    private Trasgo trasgo1 = new Trasgo("Ganon");



    public Principal(){
        System.out.println(elfo1.getNombre() + " Armadura: " + elfo1.getArmadura() + " Vida: " + elfo1.getVida());
        System.out.println(hobbit1.getNombre() + " Armadura: " + hobbit1.getArmadura() + " Vida: " + hobbit1.getVida());
        System.out.println(hombre1.getNombre() + " Armadura: " + hombre1.getArmadura() + " Vida: " + hombre1.getVida());
        System.out.println(orco1.getNombre() + " Armadura: " + orco1.getArmadura() + " Vida: " + orco1.getVida());
        System.out.println(trasgo1.getNombre() + " Armadura: " + trasgo1.getArmadura() + " Vida: " + trasgo1.getVida());
    }
}
