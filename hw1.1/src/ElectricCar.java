final public class ElectricCar extends Car{

    public ElectricCar(String brandName, Owner owner, int horsePower) {
        super(brandName, FuelType.ELECTRIC, owner, horsePower);
    }

    @Override
    public void getInfo(Owner owner) {
        owner.ownerInfo();
        System.out.println(owner.getName()+ " has Electric Car: " + this.getBrandName() +
                "\nHorse Power - " + this.getHorsePower());
    }
}
