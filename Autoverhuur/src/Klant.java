public class Klant {
    String naam;
    Double kortingsPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public Double getKortingsPercentage() {
        return kortingsPercentage;
    }

    public void setKortingsPercentage(Double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    @Override
    public String toString() {
        return naam+" (korting: "+kortingsPercentage+"%)";
    }
}
