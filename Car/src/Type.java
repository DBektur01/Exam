import java.time.LocalDate;

public interface Type {

    String bodyTypeIdentification(TypeCar typeCar);

    void determinationYearOfManufacture(LocalDate yearOfManufacture);
}
