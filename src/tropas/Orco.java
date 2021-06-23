package tropas;

public class Orco extends Bestias{
    
    //Constructor

    public Orco(String nombre){
        super();
        super.vida = 300;
        super.nombre = nombre;
        super.ponerArmadura();
        super.atacarEnemigo();
        super.tipo = "Orco";
    }

    //Metodos
    @Override
    public boolean modificarDanioEscudo(Caracter rival){
        super.atacarEnemigo();
        if (rival instanceof Heroes) {
            int armadura = rival.getArmadura() - (int)(rival.getArmadura()*0.1);
            if (armadura > super.getAtaque()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
