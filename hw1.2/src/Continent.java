public class Continent extends Country{
    private String mainLanguage;

    public Continent(String name, String capital, String mainLanguage) {
        super(name, capital);
        this.mainLanguage = mainLanguage;
    }

    public String getMainLanguage() {
        return mainLanguage;
    }

    @Override
    public void print() {
        System.out.println("Continent Name: " + getName() + ", Capital: " + getCapital() + ", Main Language: " + mainLanguage);
    }
}
