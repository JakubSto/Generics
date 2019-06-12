public class Toy extends Item {

    public boolean rcToy;

    public Toy(String itemName, boolean rcToy) {
        super(itemName);
        this.rcToy = rcToy;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "rcToy=" + rcToy +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
