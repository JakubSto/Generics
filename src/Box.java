
import java.util.ArrayList;

public class Box <T> {

     public ArrayList<T> itemsInBox = new ArrayList();

     void clearBox(){
        itemsInBox.clear();
    }

    void addItem(T item){
         itemsInBox.add(item);
    }

     void printItemsOfBox(){
        for (T item:itemsInBox) {
            System.out.println(item);
        }
    }


}
