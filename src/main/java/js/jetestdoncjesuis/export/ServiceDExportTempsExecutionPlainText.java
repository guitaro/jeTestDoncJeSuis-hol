package js.jetestdoncjesuis.export;

import java.io.*;

import js.jetestdoncjesuis.calcultemps.*;

public class ServiceDExportTempsExecutionPlainText implements IServiceDExportTempsExecution {

  public void genererFormatDeSortie(ICalculDeTemps calculDeTemps, String path) {
    long tempsExecutionMethode = new CalculateurDeTempsDexecutionViaInterpolationQuantiqueService().calculerTempsExecutionMethode(calculDeTemps);
    
    String str = "s." + calculDeTemps.getTempsDebutExecution() + "|t" + tempsExecutionMethode;
    BufferedWriter writer;
    try {
      writer = new BufferedWriter(new FileWriter("01_time.txt"));
      writer.write(str);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
