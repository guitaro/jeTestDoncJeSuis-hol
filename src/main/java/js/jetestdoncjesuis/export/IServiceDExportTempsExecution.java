package js.jetestdoncjesuis.export;

import js.jetestdoncjesuis.calcultemps.ICalculDeTemps;

public interface IServiceDExportTempsExecution {

  /**
   * Génère un format de sortie avec les résultats de {@link ICalculDeTemps} au path indiqué s'il existe.
   */
  public void genererFormatDeSortie(ICalculDeTemps calculDeTemps, String path);

}
