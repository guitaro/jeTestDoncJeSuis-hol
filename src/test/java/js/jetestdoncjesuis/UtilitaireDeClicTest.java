package js.jetestdoncjesuis;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilitaireDeClicTest {

    @Test
    public void quand_j_ouvre_un_ecran_je_clique_partout_et_rien_ne_bug() {
        
        UtilitaireDeClic utilitaireDeClic = new UtilitaireDeClic();
        try {
            utilitaireDeClic.clicsAleatoires();
        } catch (Exception ex) {
            fail("Bug en approche !!");
        }
    }
}