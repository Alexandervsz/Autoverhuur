public class Klant {
    private final String naam;
    private Double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public Double getKorting() {
        return kortingsPercentage;
    }

    public void setKorting(Double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam+" (korting: "+kortingsPercentage+"%)";
    }
}
