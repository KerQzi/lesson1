public abstract class Transport {
    private String brandName;
    private FuelType fuelType;
    private Owner owner;

    public Transport(String brandName, FuelType fuelType, Owner owner) {
        this.brandName = brandName;
        this.fuelType = fuelType;
        this.owner = owner;
    }

    public String getBrandName() {
        return brandName;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public Owner getOwner() {
        return owner;
    }

    public abstract void getInfo(Owner owner);
}
