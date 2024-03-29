
import java.util.ArrayList;

public class Box <T> {
    @Override
    public String toString() {
        return "Box{" +
                "itemsInBox=" + itemsInBox +
                '}';
    }

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
        System.out.println();
    }
    }

