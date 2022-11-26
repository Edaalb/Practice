package bootcamp.day23_constructors;

public class Day23_HCarsDifferentCars {
    public static void main(String[] args) {

        HCar superModelCar = new HCar(1234,"Mercedes","C180","benzine",30000);

        System.out.println(superModelCar);

        HCar.maxSpeed(superModelCar.fuel);

        System.out.println("superModelCar.numberOfTires = " + superModelCar.numberOfTires); //4


        HCar secondCar = new HCar(34534,"Opel","corsa","diesel",333334);
        System.out.println(secondCar);

        System.out.println("secondCar.numberOfTires = " + secondCar.numberOfTires); //4
        secondCar.numberOfTires=5;
        System.out.println("secondCar.numberOfTires = " + secondCar.numberOfTires); //5


        System.out.println("superModelCar.numberOfTires = " + superModelCar.numberOfTires); //5
    }
}
