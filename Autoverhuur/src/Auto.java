public class Auto {
    String type;
    Double prijsPerDag;

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
        return "\tautotype: " + type + " met de prijs per dag: " + prijsPerDag;
    }
}
