// Concrete decorator classes
public class CarAccessoriesDecorator extends CarDecorator {
    public CarAccessoriesDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        // Add car accessories
    }
}
