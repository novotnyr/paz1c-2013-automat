package sk.upjs.ics.paz1c.automat;

public class Tovar {

    private int kod;
    
    private double cena;
    
    private String nazov;
    
    int getKod() {
        return kod;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getNazov() {
        return nazov;
    }

    public void setNazov(String nazov) {
        this.nazov = nazov;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Tovar{" + "kod=" + kod + ", cena=" + cena + ", nazov=" + nazov + '}';
    }
        
    
}
