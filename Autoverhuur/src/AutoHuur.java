public class AutoHuur {
    int aantalDagen = 0;
    Auto gehuurdeAuto;
    Klant huurder;

    public AutoHuur() {
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public double totaalPrijs() {
        return gehuurdeAuto.getPrijsPerDag() * aantalDagen;
    }

    @Override
    public String toString() {
        String text = "";
        if (gehuurdeAuto != null) {
            text += gehuurdeAuto.toString() + "\n";
        } else {
            text += "er is geen auto bekend\n";
        }
        if (huurder != null) {
            text += huurder.toString() + "\n";
        } else {
            text += "er is geen huurder bekend\n";
        }
        text += "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        return text;
    }
}
