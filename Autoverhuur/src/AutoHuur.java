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
        double ppd = 0.0;

        if (gehuurdeAuto != null) {
            ppd = gehuurdeAuto.getPrijsPerDag();
        }

        return ppd * aantalDagen;
    }

    @Override
    public String toString() {
        String text = "";
        if (gehuurdeAuto != null) {
            text += gehuurdeAuto.toString() + "\n";
        } else {
            text += "\ter is geen auto bekend\n";
        }
        if (huurder != null) {
            text += "\top naam van: "+huurder.toString() + "\n";
        } else {
            text += "\ter is geen huurder bekend\n";
        }
        text += "\taantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        return text+"\n";
    }
}
