public class AutoHuur {
    private int aantalDagen = 0;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {
    }


    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
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
            text += "\tautotype: "+ gehuurdeAuto + "\n";
        } else {
            text += "\ter is geen auto bekend\n";
        }
        if (huurder != null) {
            text += "\top naam van: "+huurder + "\n";
        } else {
            text += "\ter is geen huurder bekend\n";
        }
        text += "\taantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        return text+"\n";
    }
}
