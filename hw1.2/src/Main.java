public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];

        printables[0] = createObject("City");
        printables[1] = createObject("Village");
        printables[2] = createObject("Continent");

        for (Printable printable : printables) {
            printable.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "City":
                return new City("TokMok", "TokMok", 841960);
            case "Village":
                return new Village("Pokrovka", "Pokrovka", 120);
            case "Continent":
                return new Continent("Asia", "Kyrgyzstan", "Kyrgyz");
            default:
                return null;
        }
    }
}