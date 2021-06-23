package tropas;

public class Elfo extends Heroes {
    
    //Constructor

    public Elfo(String nombre){
        super();
        super.vida = 250;
        super.nombre = nombre;
        super.ponerArmadura();
        super.atacarEnemigo();
        super.tipo = "Elfo";
    }

    //Metodos
    @Override
    public boolean modificarDanioEscudo(Caracter rival){
        super.atacarEnemigo();
        if (rival instanceof Orco) {
            super.setAtaque(super.getAtaque()+super.dados.incrementarDanio());
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
        if (rival instanceof Orco) {
            super.setAtaque(super.getAtaque()+super.dados.incrementarDanio());
        }
    }

}
