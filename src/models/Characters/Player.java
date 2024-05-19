package models.Characters;
import java.io.*;


public class Player extends Character implements Serializable{
    String clase;
    String Faccion;
    String raza;

    public Player(String name, String type, int lvl, String clase, String Faccion, String raza) throws IOException {
        super(name, type, lvl);
        this.clase = clase;
        this.raza = raza;
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

    public void setRaza(String raza) { this.raza = raza; }
    public void VerDatos() {
        System.out.println("El nivel es: "+this.lvl);
        System.out.println("El personaje es: "+this.type);
        System.out.println("La raza del personaje es: "+this.raza);
        System.out.println("El nombre es: "+this.name);
        System.out.println("La clase elegida es: "+this.clase);
    }
    public String getClase() {
        return clase;
    }

    public String getFaccion() {
        return Faccion;
    }
    public String getRaza() {
        return raza;
    }
}

