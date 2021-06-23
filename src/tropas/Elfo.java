package tropas;

public class Elfo extends Heroes {
    
    //Constructor

    public Elfo(){
        super();
        super.vida = 250;
        super.armadura = super.dados.darValorArmadura();
    }
}
