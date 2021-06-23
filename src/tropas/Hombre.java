package tropas;

public class Hombre extends Heroes{
    


    //Constructor

    public Hombre(String nombre){
        super();
        super.vida = 180;
        super.nombre = nombre;
        super.ponerArmadura();
        super.atacarEnemigo();
        super.tipo = "Hombre";
    }
}
