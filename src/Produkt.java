public class Produkt {
    private String name;
    private float price;
    private String ort;

    public Produkt(String name, float price, String ort) {
        this.name = name;
        this.price = price;
        this.ort = ort;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

}
