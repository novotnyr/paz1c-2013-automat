package sk.upjs.ics.paz1c.automat;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutomatTest {
    @Test
    public void test() {
        Automat automat = new Automat();
        automat.prijmiMince(5);
        automat.prijmiKod(24);
        Tovar tovar = automat.vydajTovar();
        
        assertEquals(24, tovar.getKod());
    }
        
    @Test
    public void testZadajNeexistujuciKodTovaru() {
        Automat automat = new Automat();
        automat.prijmiMince(12);
        automat.prijmiKod(8888);
        Tovar tovar = automat.vydajTovar();
        System.out.println(tovar);
        
        assertTrue(tovar == null);
    }
    
    
    
    
    
    
}