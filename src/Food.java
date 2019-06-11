public class Food {

    public Food tomatooSoup = new Food("soup", false);
    public Food macChicken = new Food("McDonald", true);
    public Food boxOfSpicyChickens = new Food("KFC", true);


    public String typeOfFood;
    public boolean fastFood;

    public Food(String typeOfFood, boolean fastFood) {
        this.typeOfFood = typeOfFood;
        this.fastFood = fastFood;
    }
}
