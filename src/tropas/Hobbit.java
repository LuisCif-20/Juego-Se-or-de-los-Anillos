package tropas;

public class Hobbit extends Heroes{
    

    //Constructor

    public Hobbit(String nombre){
        super();
        super.vida = 200;
        super.nombre = nombre;
        super.ponerArmadura();
        super.atacarEnemigo();
        super.tipo = "Hobbit";
    }

    //Metodos
    @Override
    public boolean modificarDanioEscudo(Caracter rival){
        super.atacarEnemigo();
        if (rival instanceof Trasgo) {
            super.setAtaque(super.getAtaque()-5);
            if (rival.getArmadura() < super.getAtaque()) {
                return true;
            } else {
                return false;
            }
        } else {
            if (rival.getArmadura() < super.getAtaque()) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void modificarDanioVida(Caracter rival){ 
        super.atacarEnemigo();
        if (rival instanceof Trasgo) {
            super.setAtaque(super.getAtaque()-5);
        }
    }

}
