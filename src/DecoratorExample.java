public class DecoratorExample {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car.assemble();
        System.out.println("\n*****");

        car = new CarAccessoriesDecorator(car);
        car.assemble();
        System.out.println("\n*****");

        car = new CarInsuranceDecorator(car);
        car.assemble();
    }
}
