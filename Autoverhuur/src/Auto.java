public class Auto {
    private final String type;
    private Double prijsPerDag;

    public Auto(String type, Double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public Double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(Double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        return type + " met de prijs per dag: " + prijsPerDag;
    }
}
