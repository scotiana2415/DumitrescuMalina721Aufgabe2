import java.util.*;

/**
 * Controller class that manages operations for Produkt and Kunde entities.
 */
public class Controller {
    private Repository<Produkt> produktRepo;
    private Repository<Charaktere> charaktereRepo;

    /**
     * Constructor for Controller.
     *
     * @param produktRepo Repository for Produkt entities.
     * @param kundeRepo   Repository for Kunde entities.
     */
    public Controller(Repository<Produkt> produktRepo, Repository<Charaktere> kundeRepo) {
        this.produktRepo = produktRepo;
        this.charaktereRepo = charaktereRepo;
    }

    /**
     * Adds a Produkt to the repository.
     *
     * @param produkt The Produkt to add.
     */
    public void addProdukt(Produkt produkt) {
        produktRepo.add(produkt);
    }

    /**
     * Adds a Kunde to the repository.
     *
     * @param charaktere The Kunde to add.
     */
    public void addCharaktere(Charaktere charaktere) {
        charaktereRepo.add(charaktere);
    }

    /**
     * Retrieves a Produkt by its ID.
     *
     * @param id The ID of the Produkt.
     * @return The Produkt with the specified ID.
     */
    public Produkt getProdukt(int id) {
        return produktRepo.get(id);
    }

    /**
     * Retrieves a Kunde by its ID.
     *
     * @param id The ID of the Kunde.
     * @return The Kunde with the specified ID.
     */
    public Charaktere getCharaktere(int id) {
        return charaktereRepo.get(id);
    }

    /**
     * Deletes a Produkt by its ID.
     *
     * @param id The ID of the Produkt to delete.
     */
    public void deleteProdukt(int id) {
        produktRepo.delete(id);
    }

    /**
     * Deletes a Kunde by its ID.
     *
     * @param id The ID of the Kunde to delete.
     */
    public void deleteCharaktere(int id) {
        charaktereRepo.delete(id);
    }

    /**
     * Updates a Produkt by its ID.
     *
     * @param id      The ID of the Produkt to update.
     * @param produkt The updated Produkt.
     */
    public void updateProdukt(int id, Produkt produkt) {
        produktRepo.update(id, produkt);
    }

    /**
     * Updates a Kunde by its ID.
     *
     * @param id    The ID of the Kunde to update.
     * @param charaktere The updated Kunde.
     */
    public void updateKunde(int id, Charaktere charaktere) {
        charaktereRepo.update(id, charaktere);
    }
}
