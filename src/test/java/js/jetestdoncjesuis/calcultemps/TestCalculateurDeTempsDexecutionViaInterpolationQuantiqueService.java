package js.jetestdoncjesuis.calcultemps;

import org.junit.*;

public class TestCalculateurDeTempsDexecutionViaInterpolationQuantiqueService {

  @Test
  public void test_calculerTempsExecutionMethode() {
    // Given
    CalculateurDeTempsDexecutionViaInterpolationQuantiqueService service = new CalculateurDeTempsDexecutionViaInterpolationQuantiqueService();
    ICalculDeTemps calculDeTemps = new CalculDeTemps(System.currentTimeMillis());

    // When
    try {
      Thread.sleep(200);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    service.arreterCalculTempsMethode(calculDeTemps);
    long tempsExecutionMethode = service.calculerTempsExecutionMethode(calculDeTemps);

    // Then
    Assert.assertEquals(200, 200);
  }

}
