public class CarAssemble {
    public static void main(String[] args){
        Car myCar = new Car.CarBuilder()
            .engineType("Diesel")
            .brand("Honda")
            .color("Black")
            .transmission("Manual")
            .passengerCapacity(7)
            .build();

            System.out.println(myCar.brand);
            System.out.println(myCar.engineType);
            System.out.println(myCar.transmission);
            System.out.println(myCar.color);
            System.out.println(myCar.passengerCapacity);
    }
}
