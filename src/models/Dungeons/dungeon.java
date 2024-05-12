package models.Dungeons;
public class dungeon {
   public String name;
   public String ingname;
   public String abreviatura;
   public String location;
   public int min_lvl;
   public int max_lvl;

   public dungeon(String name, String ingname, String abreviatura, String location, int min_lvl, int max_lvl){
       this.name = name;
       this.ingname = ingname;
       this.abreviatura = abreviatura;
       this.location = location;
       this.min_lvl = min_lvl;
       this.max_lvl = max_lvl;
   }
   public void datosDungeon(){
      System.out.println("Nombre de la mazmorra: "+this.name);
       System.out.println("Nombre en ingles de la mazmorra: "+this.ingname);
       System.out.println("Abreviatura del nombre: "+this.abreviatura);
      System.out.println("Localización de la mazmorra: "+this.location);
       System.out.println("Nivel minimo de entrada: "+this.min_lvl);
       System.out.println("Nivel maximo de estancia: "+this.max_lvl);
   }
}


