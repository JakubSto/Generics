import java.util.ArrayList;

public class Room {
    ArrayList<Shelf> shelvesInRoom = new ArrayList<>();
    String roomName;

    @Override
    public String toString() {
        return "Room{" +
                "shelvesInRoom=" + shelvesInRoom +
                '}';
    }

    public void addShelvesToRoom(Shelf shelf){
        shelvesInRoom.add(shelf);
    }

    public void clearRoom(){
        shelvesInRoom.clear();
    }

    public void showShelvesInRoom(){
        for (Shelf shelf: shelvesInRoom) {
            System.out.println(shelf);
        }
    }
}
