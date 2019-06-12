import java.util.ArrayList;

public class Shelf <T> {
    public ArrayList<Box <T>> boxesOnShelf = new ArrayList<>();

    void addBoxToShelf(Box<T> box) {
        boxesOnShelf.add(box);
    }

    void clearShelf(){
        boxesOnShelf.clear();
    }

    void showBoxesOnShelf(){
        for (Box box: boxesOnShelf) {
            System.out.println(boxesOnShelf);
        }
    }
}
