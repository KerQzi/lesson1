public class City extends Country{
    private int population;

    public City(String name, String capital, int population) {
        super(name, capital);
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public void print() {
        System.out.println("City Name: " + getName() + ", Capital: " + getCapital() + ", Population: " + population);
    }
}
