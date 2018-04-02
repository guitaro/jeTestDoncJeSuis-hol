package js.jetestdoncjesuis.export;

import java.io.*;
import java.nio.file.Paths;

import org.junit.*;

import js.jetestdoncjesuis.calcultemps.*;

public class ServiceDExportTempsExecutionPlainTextTest {

  @Test
  public void test_genererFormatDeSortie_casTempsAPeurPresBon() {
    // Given
    long sleep = 500;
    ICalculDeTemps calculDeTemps = new CalculDeTemps();

    // When
    CalculateurDeTempsDexecutionViaInterpolationQuantiqueService service = new CalculateurDeTempsDexecutionViaInterpolationQuantiqueService();
    service.lancerCalculTempsMethode(calculDeTemps);
    try {
      Thread.sleep(sleep);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    service.arreterCalculTempsMethode(calculDeTemps);
    new ServiceDExportTempsExecutionPlainText().genererFormatDeSortie(calculDeTemps, null);

    // Then
    File file = Paths.get("01_time.txt").toFile();
    BufferedReader buffer = null;
    try {
      buffer = new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException e1) {
      e1.printStackTrace();
    }
    String readLine = null;
    try {
      readLine = buffer.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String tempsStr = readLine.substring(readLine.length() - 3, readLine.length());
    Integer temps = Integer.valueOf(tempsStr);
    Assert.assertTrue(temps < 600);
    Assert.assertTrue(temps > 500);
  }
}
