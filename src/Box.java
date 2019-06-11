
import java.util.ArrayList;

public class Box {

    static public ArrayList<?> box = new ArrayList();

    static void clearBox(){
        box.clear();
    }

    static void printItemsOfBox(){
        for (Box item:box) {
            System.out.println(item);
        }
    }


}
