public class Guitar extends Instument implements IPlay{
    int numberOfStrings;

    public Guitar(String material, String colour, String type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }



    @Override
    public String play() {
        return "Guitar";
    }
}
