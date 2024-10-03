public class Car extends Transport{
    private int horsePower;

    public Car(String brandName, FuelType fuelType, Owner owner, int horsePower) {
        super(brandName, fuelType, owner);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    final public void beep(){
        System.out.println("Beeeeepp");
    }

    public void drive(int speed) {
        System.out.println(this.getBrandName() + " is driving with " + speed + "km/h");
    }

    public void drive(){
        System.out.println(this.getBrandName() + " is driving");
    }



    @Override
    public void getInfo(Owner owner) {
        owner.ownerInfo();
        System.out.println(owner.getName()+ " has Car: " + this.getBrandName() +
                "\nHorse Power - " + this.getHorsePower());
    }
}
