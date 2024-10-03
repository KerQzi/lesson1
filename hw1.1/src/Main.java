import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Owner owner1 = new Owner("Oleg", 25);
        Owner owner2 = new Owner("Mike", 35);

        Car car = new Car("Toyota", FuelType.DIESEL, owner1, 100);
        ElectricCar electricCar1 = new ElectricCar("Tesla", owner2, 80);
        ElectricCar electricCar2 = new ElectricCar("Nissan", owner1, 60);

        Transport[] transports = {car, electricCar1, electricCar2};
        for (Transport transport : transports) {
            transport.getInfo(transport.getOwner());
            if (transport instanceof ElectricCar){
                ((ElectricCar) transport).beep();
                ((ElectricCar) transport).drive();
                ((ElectricCar) transport).drive(40);
            }else {
                ((Car) transport).beep();
                ((Car) transport).drive();
                ((Car) transport).drive(random.nextInt(70));
            }
            System.out.println("------------------------------");
        }
    }
}