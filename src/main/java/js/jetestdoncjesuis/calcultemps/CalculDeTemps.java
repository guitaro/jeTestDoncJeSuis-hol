package js.jetestdoncjesuis.calcultemps;

public class CalculDeTemps implements ICalculDeTemps {

  private long tempsDebutExecution;
  public long tempsFinExection;

  public CalculDeTemps(long tempsDebutExecution) {
    this.setTempsDebutExecution(tempsDebutExecution);
  }

  public CalculDeTemps() {
    // TODO Auto-generated constructor stub
  }

  public long getTempsDebutExecution() {
    return tempsDebutExecution;
  }

  public void setTempsDebutExecution(long tempsDebutExecution) {
    this.tempsDebutExecution = tempsDebutExecution;
  }

  public long getTempsFinExecution() {
    return tempsFinExection;
  }

  public void setTempsFinExecution(long temps) {
    this.tempsFinExection = temps;
  }

}
