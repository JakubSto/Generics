public class Food {

    Food tomatooSoup = new Food("soup", false);
    Food macChicken = new Food("McDonald", true);
    Food boxOfSpicyChickens = new Food("KFC", true);


    public String typeOfFood;
    public boolean fastFood;

    public Food(String typeOfFood, boolean fastFood) {
        this.typeOfFood = typeOfFood;
        this.fastFood = fastFood;
    }
}
