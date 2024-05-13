package models.Characters;

public class Player extends Character {
    String clase;
    String Faccion;

    public Player(){

    }
    public Player(String name, String type, int lvl, String clase, String Faccion) {
        super(name, type, lvl);
        this.clase = clase;
        this.Faccion = Faccion;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setFaccion(String faccion) {
        Faccion = faccion;
    }
}
