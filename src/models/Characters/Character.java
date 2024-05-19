package models.Characters;

import java.lang.reflect.Type;

public abstract class Character {
    int lvl;
    String type;
    String name;

    public Character(){

    }
    public Character(String name, String type, int lvl) {
        this.name = name;
        this.type = type;
        this.lvl = lvl;
    }

    public void VerDatos() {
        System.out.println("El nivel es: "+this.lvl);
        System.out.println("El personaje es: "+this.type);
        System.out.println("El nombre es: "+this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public int getLvl(){
        return lvl;
    }
    public String getType(){
        return type;
    }

}




