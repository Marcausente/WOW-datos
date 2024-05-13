package models.Characters;
import java.io.*;


public class Player extends Character{
    String clase;
    String Faccion;

    public Player(String name, String type, int lvl, String clase, String Faccion) throws IOException {
        super(name, type, lvl);
        this.clase = clase;
        this.Faccion = Faccion;
    }

    public Player() {

    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setFaccion(String faccion) {
        this.Faccion = faccion;
    }
}
