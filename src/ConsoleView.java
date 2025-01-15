import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

public class ConsoleView {
    private Controller controller;

    public ConsoleView(Controller controller) {
        this.controller = controller;
    }

    public void menu() {
        System.out.println("""
                1 - Create Produkt
                2 - Read Produkt
                3 - Update Produkt
                4 - Delete Produkt
                5 - Create Charakter
                6 - Read Charakter
                7 - Update Charakter
                8 - Delete Charakter
                9 - Filter Charakter nach Ort
                10 - Filter alle Charaktere, die ein Produkt aus einer vom Benutzer angegebenen Herkunftsregion gekauft haben
                11 - Sort Produkte eines Kunden""");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        menu();

        String option;
        while(true) {
            option = scanner.nextLine();
            switch(option) {
                case "1": {
                    System.out.println("Produkt Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Produkt Preis: ");
                    float preis = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Produkt Ort: ");
                    String ort = scanner.nextLine();
                    Produkt produkt = new Produkt(name, preis, ort);
                    controller.addProdukt(produkt);
                    break;
                }
                case "2": {
                    System.out.println("Produkt ID: ");
                    int id = scanner.nextInt();
                    Produkt produkt = controller.getProdukt(id);
                    System.out.println(produkt.getName() + ", " + produkt.getOrt());
                    break;
                }
                case "3": {
                    System.out.println("Produkt ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Produkt Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Produkt Preis: ");
                    float preis = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.println("Produkt Jahreszeit: ");
                    String ort = scanner.nextLine();
                    Produkt produkt = new Produkt(name, preis, ort);
                    controller.updateProdukt(id, produkt);
                    break;
                }
                case "4": {
                    System.out.println("Produkt ID: ");
                    int id = scanner.nextInt();
                    controller.deleteProdukt(id);
                    break;
                }
                case "5": {
                    System.out.println("Charaktere ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Charaktere Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Charaktere Ort: ");
                    String ort = scanner.nextLine();
                    System.out.println("Charaktere Produkte ID: ");
                    List<Produkt> produktList = new ArrayList<>();
                    int produktId;
                    while(scanner.hasNextInt()) {
                        produktId = scanner.nextInt();
                        produktList.add(controller.getProdukt(produktId));
                    }
                    scanner.nextLine();
                    scanner.nextLine();
                    Charaktere charaktere = new Charaktere(id, name, ort, produktList);
                    controller.addCharaktere(charaktere);
                    break;
                }
                case "6": {
                    System.out.println("Kunde ID: ");
                    int id = scanner.nextInt();
                    Charaktere kunde = controller.getCharaktere(id);
                    System.out.println(kunde.getId() + ", " + kunde.getName() + ", " + kunde.getOrt());
                    break;
                }
                case "7": {
                    System.out.println("Kunde ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Kunde Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Kunde Ort: ");
                    String ort = scanner.nextLine();
                    System.out.println("Kunde Produkte ID: ");
                    List<Produkt> produktList = new ArrayList<>();
                    int produktId;
                    while(scanner.hasNextInt()) {
                        produktId = scanner.nextInt();
                        produktList.add(controller.getProdukt(produktId));
                    }
                    scanner.nextLine();
                    scanner.nextLine();
                    Charaktere charaktere = new Charaktere(id, name, ort, produktList);
                    controller.updateKunde(id, charaktere);
                    break;
                }
                case "8": {
                    System.out.println("Kunde ID: ");
                    int id = scanner.nextInt();
                    controller.deleteCharaktere(id);
                    break;
                }
                case "9": {
                    System.out.println("Ort: ");
                    String ort = scanner.nextLine();
                    controller.filterNachOrt(ort);
                    break;
                }
                case "10": {
                    System.out.println("Produkt Herkunftsregion: ");
                    String region = scanner.nextLine();
                    controller.filterCharaktereNachProduktRegion(region);
                    break;
                }
                case "11": {
                    System.out.println("Kunde ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Modus: ");
                    String modus = scanner.nextLine();
                    controller.sortiereNachProdukte(id, modus);
                    break;
                }
            }
        }
    }
}



