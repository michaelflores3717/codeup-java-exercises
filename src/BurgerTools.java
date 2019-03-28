public class BurgerTools {

    private String mostPopularTopping;
    private int averageDaysBeforeExpiration;
    private int temperatureWhenCooked;

    public BurgerTools (String mostPopularTopping, int averageDaysBeforeExpiration, int temperatureWhenCooked) {
        this.mostPopularTopping = mostPopularTopping;
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
        this.temperatureWhenCooked = temperatureWhenCooked;
    }

    public BurgerTools() {

    }

    public void grill() {
        System.out.println("Grilling burger");
    }

    public String getMostPopularTopping() {
        return mostPopularTopping;
    }

    public void setMostPopularTopping(String mostPopularTopping) {
        this.mostPopularTopping = mostPopularTopping;
    }

    public int getAverageDaysBeforeExpiration() {
        return averageDaysBeforeExpiration;
    }

    public void setAverageDaysBeforeExpiration(int averageDaysBeforeExpiration) {
        this.averageDaysBeforeExpiration = averageDaysBeforeExpiration;
    }

    public int getTemperatureWhenCooked() {
        return temperatureWhenCooked;
    }

    public void setTemperatureWhenCooked(int temperatureWhenCooked) {
        this.temperatureWhenCooked = temperatureWhenCooked;
    }
}
