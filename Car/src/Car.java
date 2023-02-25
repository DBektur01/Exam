import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Car  implements Type{
    private String brand;
    private LocalDate dateOfMade;
    private BigDecimal price;
    private TypeCar typeCar;

    public Car(String brand, LocalDate dateOfMade, BigDecimal price, TypeCar typeCar) {
        this.brand = brand;
        this.dateOfMade = dateOfMade;
        this.price = price;
        this.typeCar = typeCar;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }


    @Override
      public String bodyTypeIdentification(TypeCar typeCar) {
        switch (typeCar) {
            case SEDAN:
            case HATCHBACK:
                return "легковой классындагы машина";
            case CROSSOVER:
            case SUV:
                return "внедорожник классындагы машина";
            case STATION_WAGON:
                return "универсал классындагы машина";
            default:
        }return " Error ";
    }

    @Override
    public void determinationYearOfManufacture(LocalDate dateOfMade) {
        int date=Period.between(dateOfMade,LocalDate.now()).getYears();
        System.out.println("Чыгарылганына "+date+" жыл болду");

    }

    @Override
    public String toString() {
        return "Car: " +
                "brand: " + brand + '\'' +
                ", dateOfMade: " + dateOfMade +
                ", price: " + price +
                ", typeCar: " + typeCar;
    }
}
