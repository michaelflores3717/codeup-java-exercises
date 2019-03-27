public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public RestaurantDish(int costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public RestaurantDish() {

    }

    public static void eat() {
        System.out.println("Nom nom nom...");
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(800, "hamburger", true);
        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());
        dish.eat();
    }
}
