package models.Dungeons;
public class dungeon {
   public String name;
   public String ingname;
   public String abreviatura;
   public String location;
   public int min_lvl;
   public int max_lvl;
   public int recomend_lvl;

    public dungeon(){
    }
   public dungeon(String name, String ingname, String abreviatura, String location, int min_lvl, int max_lvl){
       this.name = name;
       this.ingname = ingname;
       this.abreviatura = abreviatura;
       this.location = location;
       this.min_lvl = min_lvl;
       this.max_lvl = max_lvl;
   }


   public void datosDungeon(){
       String green =  "\u001B[32m";
       String resetColorCode = "\u001B[0m";
      System.out.println(green+"Nombre de la mazmorra: "+resetColorCode+this.name);
       System.out.println(green+"Nombre en ingles de la mazmorra: "+resetColorCode+this.ingname);
       System.out.println(green+"Abreviatura del nombre: "+resetColorCode+this.abreviatura);
      System.out.println(green+"Localización de la mazmorra: "+resetColorCode+this.location);
       System.out.println(green+"Nivel minimo de entrada: "+resetColorCode+this.min_lvl);
       System.out.println(green+"Nivel maximo de estancia: "+resetColorCode+this.max_lvl);
   }
   public void mostrarNivelRecomendado(){
       String green =  "\u001B[32m";
       String resetColorCode = "\u001B[0m";
       SetRecomend_lvl();
       System.out.println(green+"El nivel recomendado es: "+resetColorCode+this.recomend_lvl);
   }
    public void SetRecomend_lvl(){
        this.recomend_lvl = (max_lvl + min_lvl) / 2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngname(String ingname) {
        this.ingname = ingname;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setMax_lvl(int max_lvl) {
        this.max_lvl = max_lvl;
    }

    public void setMin_lvl(int min_lvl) {
        this.min_lvl = min_lvl;
    }
}


