package models.Dungeons;

public class raid {
    public String name;
    public String ingname;
    public String abreviatura;
    public String location;
    public int size;

    public raid (String name, String ingname, String abreviatura, String location, int size){
        this.name = name;
        this.ingname = ingname;
        this.abreviatura = abreviatura;
        this.location = location;
        this.size = size;
    }
    public void datosRaid(){
        String green =  "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        System.out.println(green+"Nombre de la raid: "+resetColorCode+this.name);
        System.out.println(green+"Nombre en ingles de la raid: "+resetColorCode+this.ingname);
        System.out.println(green+"Abreviatura del nombre: "+resetColorCode+this.abreviatura);
        System.out.println(green+"Localización de la raid: "+resetColorCode+this.location);
        System.out.println(green+"Numero de jugadores maximos: "+resetColorCode+this.size);
    }
    public String getName(){
        return name;
    }
}
