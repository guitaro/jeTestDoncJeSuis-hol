package js.jetestdoncjesuis;

import static org.junit.Assert.fail;

import java.util.Collection;

import org.junit.*;

public class UtilitaireDeClicPartoutTest {

  private Collection<Ecran> ecrans = null;

  @Before
  public void init() {
    ecrans = ContexteTest.creerEcrans();
  }

  @Test
  public void quand_j_ouvre_un_ecran_je_clique_partout_et_rien_ne_bug() {
    UtilitaireDeClicPartout utilitaireDeClic = new UtilitaireDeClicPartout();
    try {
      utilitaireDeClic.clicsPartout(ecrans);
    } catch (Exception ex) {
      fail("Bug en approche !!");
    }
  }
}
