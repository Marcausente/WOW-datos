import models.Characters.NPC;
import models.Dungeons.dungeon;
import models.Dungeons.raid;

import java.util.Scanner;

public class Main {
    public static Scanner input;
    public static void main(String[] args) {
        int menu = 0;
        dungeon listadungeons [] = new dungeon[25];
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
        listadungeons[14] = new dungeon();
        raid listaraids [] = new raid[25];
        do{
            menu = menu(menu);
            switchgeneral(menu, listadungeons);
        }while (menu != 3);
    }

    private static void switchgeneral(int menu, dungeon[] listadungeons) {
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
            default:
                System.out.println("El numero introducido no es valido, intentalo con otro");
                break;
        }
    }

    private static void createcharacter() {
    }

    private static void infomazmorras(dungeon[] listadungeons) {

        System.out.println("Lista de mazmorras wow classic");
        for (int i = 0; i < 13; i++) {
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
        menu = input.nextInt();
        return menu;
    }
}
