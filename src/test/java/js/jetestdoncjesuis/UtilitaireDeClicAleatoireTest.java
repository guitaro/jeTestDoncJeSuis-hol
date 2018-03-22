package js.jetestdoncjesuis;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.*;

public class UtilitaireDeClicAleatoireTest {

  private Collection<Ecran> ecrans = null;

  @Before
  public void init() {
    ecrans = ContexteTest.creerEcrans();
  }

  @Test
  public void quand_j_ouvre_un_ecran_je_clique_partout_et_rien_ne_bug() {
    UtilitaireDeClicAleatoire utilitaireDeClic = new UtilitaireDeClicAleatoire();
    try {
      utilitaireDeClic.clicsAleatoires(ecrans);
    } catch (Exception ex) {
      fail("Bug en approche !!");
    }
  }
}