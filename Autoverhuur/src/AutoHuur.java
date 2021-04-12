public class AutoHuur {
    int aantalDagen;
    Auto gehuurdeAuto;
    Klant huurder;

    public AutoHuur() {
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public Klant getHuurder(){
        return huurder;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto){
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public void setHuurder(Klant huurder){
        this.huurder = huurder;
    }

    public double totaalPrijs(){
        return gehuurdeAuto.getPrijsPerDag() * aantalDagen;
    }

}
