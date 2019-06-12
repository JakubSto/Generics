public class Food {

    public String typeOfFood;
    public boolean fastFood;

    public Food(String typeOfFood, boolean fastFood) {
        this.typeOfFood = typeOfFood;
        this.fastFood = fastFood;
    }

    @Override
    public String toString() {
        return "Food{" +
                "typeOfFood='" + typeOfFood + '\'' +
                ", fastFood=" + fastFood +
                '}';
    }
}
