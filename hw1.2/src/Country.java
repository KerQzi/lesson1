public abstract class Country implements Printable{
    private String name, capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }
}
