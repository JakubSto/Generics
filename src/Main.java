import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        //--------------------------Create objects-----------------------------------//

        //Foods:
        Food tomatooSoup = new Food("soup", false);
        Food macChicken = new Food("McDonald", true);
        Food boxOfSpicyChickens = new Food("KFC", true);

        //Toys:
        Toy car1 = new Toy("bmw", true);
        Toy car2 = new Toy("audi", false);
        Toy car3 = new Toy("fiat", true);

        //Tools:
        Tool hammer = new Tool("hammer", false);
        Tool drill = new Tool("drill", true);
        Tool keyboard = new Tool("keyboard", true);

        //Boxes:
        Box<Food> foodBox = new Box<>();
        Box<Food> foodBox2 = new Box<>();

        Box<Toy> toyBox = new Box<>();
        Box<Toy> toyBox2 = new Box<>();

        Box<Tool> toolBox = new Box<>();
        Box<Tool> toolBox2 = new Box<>();

        Box<Item> itemBox = new Box<>();
        Box<Item> itemBox2 = new Box<>();

        //Shelves
        Shelf<Box<Food>> shelfFood = new Shelf();
        Shelf<Box<Toy>> shelfToy = new Shelf();
        Shelf<Box<Tool>> shelfTool = new Shelf();
        Shelf<Box<Item>> shelfItem = new Shelf();
        Shelf<Box<?>> shelfAll = new Shelf<>();

        //Room
        Room room = new Room();

        //----------------------------------------------------------------------------//

        foodBox.addItem(tomatooSoup); foodBox.addItem(macChicken); foodBox.addItem(boxOfSpicyChickens);
        foodBox2.addItem(tomatooSoup); foodBox2.addItem(macChicken);

        toyBox.addItem(car1); toyBox.addItem(car2); toyBox.addItem(car3);
        toyBox2.addItem(car1); toyBox2.addItem(car2);

        toolBox.addItem(hammer); toolBox.addItem(drill); toolBox.addItem(keyboard);
        toolBox2.addItem(hammer); toolBox2.addItem(drill);

        itemBox.addItem(drill); itemBox.addItem(car1);
        itemBox2.addItem(drill); itemBox2.addItem(car2);

        foodBox.printItemsOfBox();
        toyBox.printItemsOfBox();
        toolBox.printItemsOfBox();
        itemBox.printItemsOfBox();

        shelfFood.addBoxToShelf(foodBox); shelfFood.addBoxToShelf(foodBox2);
        shelfTool.addBoxToShelf(toolBox); shelfTool.addBoxToShelf(toolBox2);
        shelfToy.addBoxToShelf(toyBox); shelfToy.addBoxToShelf(toyBox2);
        shelfItem.addBoxToShelf(itemBox); shelfItem.addBoxToShelf(itemBox2);
        shelfAll.addBoxToShelf(toolBox); shelfAll.addBoxToShelf(foodBox);

        shelfFood.showBoxesOnShelf();
        shelfTool.showBoxesOnShelf();
        shelfToy.showBoxesOnShelf();
        shelfItem.showBoxesOnShelf();
        shelfAll.showBoxesOnShelf();

        room.addShelvesToRoom(shelfItem);
        room.addShelvesToRoom(shelfTool);
        room.addShelvesToRoom(shelfToy);
        room.addShelvesToRoom(shelfFood);
        room.addShelvesToRoom(shelfAll);

        room.showShelvesInRoom();
    }
}
