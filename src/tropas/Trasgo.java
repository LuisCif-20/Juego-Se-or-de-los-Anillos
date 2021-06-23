package tropas;

public class Trasgo extends Bestias {
    
    //Constructor
    public Trasgo(String nombre){
        super();
        super.vida = 325;
        super.nombre = nombre;
        super.ponerArmadura();
        super.atacarEnemigo();
        super.tipo = "Trasgo";
    }

}
