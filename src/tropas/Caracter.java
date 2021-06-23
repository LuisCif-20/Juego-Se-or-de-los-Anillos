package tropas;

import principal.Dados;

public class Caracter {
    
    //Atributos
    protected Dados dados = new Dados();
    protected int vida;
    protected String nombre;
    protected int armadura;
    protected int ataque;


    //Constructor
    public Caracter(){
    }

    //Metodos
    public void ponerArmadura(){
        armadura = dados.darValorArmadura();
    }


    //Getters y Setters
    public int getArmadura() {
        return armadura;
    }

    public int getAtaque() {
        return ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }


}
