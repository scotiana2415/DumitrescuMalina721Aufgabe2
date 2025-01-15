import java.io.IOException;
import java.util.List;
import java.util.Scanner;

//todo change to match

public class Main {
    public static void main(String[] args) throws IOException {
        Repository<Charaktere> charaktereRepository = new Repository();
        Repository<Produkt> produktRepository = new Repository();
        Controller controller = new Controller(produktRepository, charaktereRepository);
        ConsoleView consoleView = new ConsoleView(controller);
        consoleView.run();
    }
}

