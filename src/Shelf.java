import java.util.ArrayList;

public class Shelf {
    public ArrayList<Box> boxesOnShelf = new ArrayList<>();

    void addBoxToShelf(Box box) {
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
