public class CarInsuranceDecorator extends CarDecorator {
    public CarInsuranceDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        // Add car insurance
    }
}
