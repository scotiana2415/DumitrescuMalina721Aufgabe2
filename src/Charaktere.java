import java.util.List;

public class Charaktere {
    private int id;
    private String name;
    private String ort;
    private List<Produkt> produktList;

    public Charaktere(int id, String name, String ort, List<Produkt> produktList) {
        this.id = id;
        this.name = name;
        this.ort = ort;
        this.produktList = produktList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public List<Produkt> getProduktList() {
        return produktList;
    }

    public void setProduktList(List<Produkt> produktList) {
        this.produktList = produktList;
    }
}


