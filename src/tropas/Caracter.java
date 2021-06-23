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
        armadura = dados.darValorArmadura();
    }

    //Metodos


    //Getters y Setters

}
