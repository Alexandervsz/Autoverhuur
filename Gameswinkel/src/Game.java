import java.time.LocalDate;

public class Game {
    private String name;
    private int releaseYear;
    private Double originPrice;

    public Game(String name, int releaseYear, Double sellingPrice) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.originPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }

    public double getPrice() {
        int currentYear = LocalDate.now().getYear();
        return originPrice * Math.pow(0.7, (currentYear - releaseYear));
    }
}
