package js.jetestdoncjesuis.calcultemps;

/**
 * Définit les services de calcul de temps d'exéction.
 */
public interface ICalculateurDeTempsDexecutionService {

  /**
   * Initie le calcul de temps pour une méthode de test.
   */
  public void lancerCalculTempsMethode(ICalculDeTemps calculDeTemps);

  /**
   * Stoppe le calcul de temps d'une méthode.
   */
  public void arreterCalculTempsMethode(ICalculDeTemps calculDeTemps);

  /**
   * Calcule et loggue le temps d'éxecution d'une méthode.
   */
  public long calculerTempsExecutionMethode(ICalculDeTemps calculDeTemps);

}
