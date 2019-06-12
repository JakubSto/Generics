import java.util.ArrayList;

public class Shelf <T extends Box> {
    public ArrayList<T> boxesOnShelf = new ArrayList<>();

    @Override
    public String toString() {
        return "Shelf{" +
                "boxesOnShelf=" + boxesOnShelf +
                '}';
    }

    void addBoxToShelf(T box) {
        boxesOnShelf.add(box);
    }

    void clearShelf(){
        boxesOnShelf.clear();
    }

    void showBoxesOnShelf(){
        for (Box<T> box: boxesOnShelf) {
            System.out.println(box);
        }
        System.out.println();
    }
}
