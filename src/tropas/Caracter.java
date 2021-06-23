package tropas;

import principal.Dados;

public class Caracter {
    
    //Atributos
    protected Dados dados = new Dados();
    protected int vida;
    protected String nombre;
    protected String tipo;
    protected int armadura;
    protected int ataque;


    //Constructor
    public Caracter(){
    }

    //Metodos
    public void ponerArmadura(){
        armadura = dados.darValorArmadura();
    }

    public void atacarEnemigo(){
        ataque = dados.crearValorAtaque(this);
    }

    public boolean modificarDañoEscudo(Caracter rival){
        if (rival.getArmadura() < this.getAtaque()) {
            return true;
        } else {
            return false;
        }
    }

    public void modificarDañoVida(Caracter rival){ 
        atacarEnemigo();
    }

    public void pelear(Caracter rival){
        if (rival.getArmadura() <= 0) {
            modificarDañoVida(rival);
            rival.setVida(rival.getVida() - this.getAtaque());
        } else {
            if (modificarDañoEscudo(rival) == true) {
                rival.setArmadura(rival.getArmadura() - this.getAtaque());
            } else {
                System.out.println("No pudiste romper su armadura");
            }
        }
    }

    public void mostrarProcesos(Caracter rival){
        System.out.print("Pelea entre: ");
        System.out.println(this.getTipo() + " " + this.getNombre() + " Vida: " + this.getVida() + " Armadura: " + this.getArmadura() + " ---Contra--- " + rival.getTipo() + " " + rival.getNombre() + " Vida: " + rival.getVida() + " Armadura: " + rival.getArmadura());
        pelear(rival);
        System.out.println("Estatus despues del ataque");
        System.out.println(this.getTipo() + " " + this.getNombre() + " Vida: " + this.getVida() + " Armadura: " + this.getArmadura() + " ---Contra--- " + rival.getTipo() + " " + rival.getNombre() + " Vida: " + rival.getVida() + " Armadura: " + rival.getArmadura());
        
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

    public String getTipo() {
        return tipo;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

}
