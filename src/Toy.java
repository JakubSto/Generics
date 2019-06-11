public class Toy extends Item {
    Toy car1 = new Toy("bmw", true);
    Toy car2 = new Toy("audi", false);
    Toy car3 = new Toy("fiat", true);

    public boolean rcToy;

    public Toy(String itemName, boolean rcToy) {
        super(itemName);
        this.rcToy = rcToy;
    }


}
