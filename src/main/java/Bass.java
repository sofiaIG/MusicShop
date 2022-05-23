public class Bass extends Instument implements IPlay{
    int numberOfStrings;

    public Bass(String material, String colour, String type, double buyingPrice, double sellingPrice, int numberOfStrings) {
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    @Override
    public String play() {
        return "Bass";
    }
}
