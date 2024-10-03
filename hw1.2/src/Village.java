public class Village extends Country{
    private int cowAmount;

    public Village(String name, String capital, int cowAmount) {
        super(name, capital);
        this.cowAmount = cowAmount;
    }

    public int getCowAmount() {
        return cowAmount;
    }

    @Override
    public void print() {
        System.out.println("Region Name: " + getName() + ", Capital: " + getCapital() + ", and " + getCowAmount() + " Cows");
    }
}
