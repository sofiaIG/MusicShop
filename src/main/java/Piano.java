public class Piano extends Instument implements IPlay {
    int numberOfKeys;

    public Piano(String material, String colour, String type, double buyingPrice, double sellingPrice, int numberOfKeys) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }


    @Override
    public String play() {
        return "Piano";
    }
}
