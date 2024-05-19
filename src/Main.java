import com.sun.jdi.request.ExceptionRequest;
import models.Characters.Player;
import models.Dungeons.dungeon;
import models.Dungeons.raid;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.io.*;

public class Main {
    public static Scanner input;
    public static void main(String[] args) throws IOException {
        int menu = 0;
        dungeon listadungeons [] = new dungeon[26];
        listadungeons[0] = new dungeon("Sima Ignea", "Ragefire Chasm","RFC", "Orgrimmar", 13, 18);
        listadungeons[1] = new dungeon("Minas de la Muerte", "The Deadmines","Paramos de poniente", "TDM", 17, 24);
        listadungeons[2] = new dungeon("Cueva de los lamentos", "Wailing Caverns", "WC", "Los Baldio", 17, 24);
        listadungeons[3] = new dungeon("Caverna Brazanegra", "Blackfathom Deeps", "BFD", "Vallefresno", 24, 32);
        listadungeons[4] = new dungeon("Castillo del Colmillo Oscuro", "Shadowfang Keep", "SFK", "Bosque de Argénteos", 22, 30);
        listadungeons[5] = new dungeon("Las Mazmorrass", "The Stockade","Stockades", "Ventormenta", 24, 32);
        listadungeons[6] = new dungeon("Horado Rajacieno", "Razorfen Kraul", "RFK","Los Baldios",29,38);
        listadungeons[7] = new dungeon("Gnomeregan", "Gnomeregan", "Gnomeregan","Dun Morogh",29,38);
        listadungeons[8] = new dungeon("Monasterio Escarlata: Cementerio", "Scarlet Monastery: Graveyard", "SM.GY","Claros de Tirisfal",34,45);
        listadungeons[9] = new dungeon("Monasterio Escarlata: Biblioteca", "Scarlet Monastery: Library", "SM Lib","Claros de Tirisfal",34,45);
        listadungeons[10] = new dungeon("Monasterio Escarlata: Armeria", "Scarlet Monastery: Armory", "SM Arm","Claros de Tirisfal",34,45);
        listadungeons[11] = new dungeon("Monasterio Escarlata: Catedral", "Scarlet Monastery: Cathedral", "SM Cath","Claros de Tirisfal",34,45);
        listadungeons[12] = new dungeon("Zahúrda Rajacieno", "Razorfen Down", "RFD","Los Baldios", 37, 46);
        listadungeons[13] = new dungeon("Uldaman", "Uldaman", "Ulda", "Tierras Inhóspitas", 41, 51);
        listadungeons[14] = new dungeon("Zul'Farral", "Zul'Farrak", "ZF", "Tanaris", 42, 46);
        listadungeons[15] = new dungeon("Maraudon", "Maraudon", "Mara", "Desolace", 46, 55);
        listadungeons[16] = new dungeon("Templo de Atal'Hakkar", "Sunken Temple", "ST", "Pantano de las penas", 50, 56);
        listadungeons[17] = new dungeon("Profundidades Roca negra", "Blackrock Depths", "BRD", "Las Estepas Ardientes", 52, 60);
        listadungeons[18] = new dungeon("Cumbre Roca Negra Inferior", "Lower Blackrock Spire", "LBRS", "Las Estepas Ardientes", 55, 60);
        listadungeons[19] = new dungeon("Cumbre Roca Negra Inferior", "Upper Blackrock Spire", "UBRD", "Las Estepas Ardientes", 55, 60);
        listadungeons[20] = new dungeon("La Masacre: Este y Oeste", "Dire Maul Est/West", "DM E/W", "Feralas", 55, 60);
        listadungeons[21] = new dungeon("La Masacre: Norte", "Dire Maul: Tribute Run", "DM: Tribute Run", "Feralas", 55, 60);
        listadungeons[22] = new dungeon("Stratholme Escarlata", "Stratholme: Scarlet", "Strath Scarlet", "Tierras de la Peste del Este", 58, 60);
        listadungeons[23] = new dungeon("Stratholme No-Muerto", "Stratholme: Undeath", "Strath UD", "Tierras de la Peste del Este", 58, 60);
        listadungeons[24] = new dungeon("Scholomance", "Scholomance", "Scholo", "Tierras de la Peste del Oeste", 58, 60);
        listadungeons[25] = new dungeon();
        //Creamos los objetos del Array raid, estos estan en el txt raidsinfo.txt
        String filePath = "C:\\Users\\marca\\IdeaProjects\\conceptowow\\src\\models\\Dungeons\\raidsinfo.txt";
        List<raid> raids = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(";");
                if (fields.length == 5) {
                    String name = fields[0];
                    String ingname = fields[1];
                    String abreviatura = fields[2];
                    String location = fields[3];
                    int size = Integer.parseInt(fields[4]);
                    raid raid = new raid(name, ingname, abreviatura, location, size);
                    raids.add(raid);
                } else {
                    System.err.println("Línea no válida: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        do{
            menu = menu(menu);
            switchgeneral(menu, listadungeons);
        }while (menu != 3);
    }
    private static void switchgeneral(int menu, dungeon[] listadungeons) throws IOException {
        switch (menu){
            case 1:
                infomazmorras(listadungeons);
                dardatos(listadungeons, menu);
                break;
            case 2:
                createcharacter();
                break;
            case 3:
        }
    }

    private static void dardatos(dungeon[] listadungeons, int menu) {
        Scanner input = new Scanner(System.in);
        try {
            menu = input.nextInt();
        switch (menu) {
            case 1:
                listadungeons[0].datosDungeon();
                listadungeons[0].mostrarNivelRecomendado();
                break;
            case 2:
                listadungeons[1].datosDungeon();
                listadungeons[1].mostrarNivelRecomendado();
                break;
            case 3:
                listadungeons[2].datosDungeon();
                listadungeons[2].mostrarNivelRecomendado();
                break;
            case 4:
                listadungeons[3].datosDungeon();
                listadungeons[3].mostrarNivelRecomendado();
                break;
            case 5:
                listadungeons[4].datosDungeon();
                listadungeons[4].mostrarNivelRecomendado();
                break;
            case 6:
                listadungeons[5].datosDungeon();
                listadungeons[5].mostrarNivelRecomendado();
                break;
            case 7:
                listadungeons[6].datosDungeon();
                listadungeons[6].mostrarNivelRecomendado();
                break;
            case 8:
                listadungeons[7].datosDungeon();
                listadungeons[7].mostrarNivelRecomendado();
                break;
            case 9:
                listadungeons[8].datosDungeon();
                listadungeons[8].mostrarNivelRecomendado();
                break;
            case 10:
                listadungeons[9].datosDungeon();
                listadungeons[9].mostrarNivelRecomendado();
                break;
            case 11:
                listadungeons[10].datosDungeon();
                listadungeons[10].mostrarNivelRecomendado();
                break;
            case 12:
                listadungeons[11].datosDungeon();
                listadungeons[11].mostrarNivelRecomendado();
                break;
            case 13:
                listadungeons[12].datosDungeon();
                listadungeons[12].mostrarNivelRecomendado();
                break;
            case 14:
                listadungeons[13].datosDungeon();
                listadungeons[13].mostrarNivelRecomendado();
                break;
            case 15:
                listadungeons[14].datosDungeon();
                listadungeons[14].mostrarNivelRecomendado();
                break;
            case 16:
                listadungeons[15].datosDungeon();
                listadungeons[15].mostrarNivelRecomendado();
                break;
            case 17:
                listadungeons[16].datosDungeon();
                listadungeons[16].mostrarNivelRecomendado();
                break;
            case 18:
                listadungeons[17].datosDungeon();
                listadungeons[17].mostrarNivelRecomendado();
                break;
            case 19:
                listadungeons[18].datosDungeon();
                listadungeons[18].mostrarNivelRecomendado();
                break;
            case 20:
                listadungeons[19].datosDungeon();
                listadungeons[19].mostrarNivelRecomendado();
                break;
            case 21:
                listadungeons[20].datosDungeon();
                listadungeons[20].mostrarNivelRecomendado();
                break;
            case 22:
                listadungeons[21].datosDungeon();
                listadungeons[21].mostrarNivelRecomendado();
                break;
            case 23:
                listadungeons[22].datosDungeon();
                listadungeons[22].mostrarNivelRecomendado();
                break;
            case 24:
                listadungeons[23].datosDungeon();
                listadungeons[23].mostrarNivelRecomendado();
                break;
            case 25:
                listadungeons[24].datosDungeon();
                listadungeons[24].mostrarNivelRecomendado();
                listadungeons[25].setName("Murallas de fuego infernal");
                System.out.println(listadungeons[25].name);
                break;
            default:
                System.out.println("El numero introducido no es valido, intentalo con otro");
                break;
        }
        }catch (Exception e){
            System.out.println();
        }
    }

    private static void createcharacter() throws IOException {
        Player personaje = new Player();
        introducirnombre(personaje);
        personaje.VerDatos();
    }

    private static void introducirnombre(Player personaje) throws IOException {
        Scanner input = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce el nombre del personaje");
        nombre = input.nextLine();
        personaje.setLvl(1);
        personaje.setType("Humanoide");
        personaje.setName(nombre);
        pasaratexto(personaje);
    }

    private static void pasaratexto(Player personaje)throws IOException {
        try {
            FileWriter escritor = new FileWriter("C:\\Users\\marca\\IdeaProjects\\conceptowow\\src\\models\\Characters\\personaje.txt");
            escritor.write(" Nombre: "+personaje.getName());
            escritor.write("| Nivel: "+personaje.getLvl());
            escritor.write("| Tipo: "+personaje.getType());
            escritor.close();
        }catch (FileNotFoundException a){
            System.out.println("ERROR: "+a.getMessage());
        }
    }

    private static void infomazmorras(dungeon[] listadungeons) {

        System.out.println("Lista de mazmorras wow classic");
        for (int i = 0; i < 25; i++) {
            System.out.println(i+1+". "+listadungeons[i].name);
        }
    }

    private static int menu(int menu) {
        String Yellow = "\u001B[33m";
        String green =  "\u001B[32m";
        String resetColorCode = "\u001B[0m";
        Scanner input = new Scanner(System.in);
        System.out.println(green+"======================="+resetColorCode);
        System.out.println(Yellow+"       WOW INFO"+resetColorCode);
        System.out.println(green+"======================="+resetColorCode);
        System.out.println("1. Info Mazmorras");
        System.out.println("2. Creación personaje");
        System.out.println("3. Salir");
        try {
            menu = input.nextInt();
        }catch (Exception a){
            System.out.println("Introduce un caracter que sea valido");
        }
        return menu;
    }
}
