public abstract class Instument {
    String material;
    String colour;
    String type;
    double buyingPrice;
    double sellingPrice;

    public Instument(String material, String colour, String type, double buyingPrice, double sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;


    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
