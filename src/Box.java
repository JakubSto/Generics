
import java.util.ArrayList;

public class Box <T> {

    public ArrayList<T> itemsInBox = new ArrayList();
    public void clearBox(){
        itemsInBox.clear();
    }

    public void addItem(T item){
         itemsInBox.add(item);
    }

    public void printItemsOfBox(){
       for (T item:itemsInBox) {
            System.out.println(item);
       }
    }

    public Box(ArrayList<T> itemsInBox) {
        this.itemsInBox = itemsInBox;
    }

    public Box<T> foodBox = new Box<>(itemsInBox);
    public Box<T> toyBox = new Box<>(itemsInBox);
    public Box<T> toolBox = new Box<>(itemsInBox);

    foodBox.addItem(Food obj);
    toyBox.addItem(Toy obj);
    toolBox.addItem(Tool obj);
}

