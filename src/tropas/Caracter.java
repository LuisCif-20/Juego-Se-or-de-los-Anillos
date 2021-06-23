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

    public boolean modificarDanioEscudo(Caracter rival){
        if (rival.getArmadura() < this.getAtaque()) {
            return true;
        } else {
            return false;
        }
    }

    public void modificarDanioVida(Caracter rival){ 
        atacarEnemigo();
    }

    public void pelear(Caracter rival){
        if (rival.getArmadura() <= 0) {
            rival.setArmadura(0); 
            if (rival.getVida() <= 0) {
                rival.setVida(0);
            }
            modificarDanioVida(rival);
            rival.setVida(rival.getVida() - this.getAtaque());
        } else {
            if (modificarDanioEscudo(rival) == true) {
                rival.setArmadura(rival.getArmadura() - this.getAtaque());
                if (rival.getArmadura() <= 0) {
                    rival.setArmadura(0);
                }
            } else {
                System.out.println("No se rompio la armadura del rival");
            }
        }
    }

    public void mostrarProcesos(Caracter rival){
        System.out.print("\nPelea entre: ");
        System.out.println(this.getTipo() + " " + this.getNombre() + " Vida: " + this.getVida() + " Armadura: " + this.getArmadura() + " ---Contra--- " + rival.getTipo() + " " + rival.getNombre() + " Vida: " + rival.getVida() + " Armadura: " + rival.getArmadura());
        pelear(rival);
        System.out.println("Estatus despues del ataque");
        System.out.println(this.getTipo() + " " + this.getNombre() + " Vida: " + this.getVida() + " Armadura: " + this.getArmadura() + " ---Contra--- " + rival.getTipo() + " " + rival.getNombre() + " Vida: " + rival.getVida() + " Armadura: " + rival.getArmadura());
        
    }

    public boolean mostrarSiEstaMuerto(){
        if (this.getVida() <= 0) {
            return true;
        } else {
            return false;
        }
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
