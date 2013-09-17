package sk.upjs.ics.paz1c.automat;


import java.util.ArrayList;
import java.util.List;

public class Automat {

    private double hodeneMince;
    private int zadanyKod;
    
    private List<Tovar> tovary = new ArrayList<Tovar>();

    public Automat() {
        Tovar cokolada = new Tovar();
        cokolada.setCena(2);
        cokolada.setKod(24);
        cokolada.setNazov("Cokolada");
        
        tovary.add(cokolada);
        
        Tovar dazdnik = new Tovar();
        dazdnik.setKod(1);
        dazdnik.setCena(5);
        dazdnik.setNazov("Dáždnik");

        tovary.add(dazdnik);
    }
    
    public void prijmiMince(int hodnota) {
        hodeneMince = hodeneMince + hodnota;
    }
  
    public void prijmiKod(int zadanyKod) {
        this.zadanyKod = zadanyKod;
    }

    public Tovar vydajTovar() {
        Tovar najdenyTovar = null;
        for(Tovar t : tovary) {
            if(t.getKod() == this.zadanyKod) {
                najdenyTovar = t;
            }
        }
        if(najdenyTovar != null) {
            tovary.remove(najdenyTovar);
        }
        return najdenyTovar;
    }
    
}
