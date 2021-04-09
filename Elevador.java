class Elevador {

  private String codigo;
  private int estado; //0, 1, 2 ou 3
  private int posicao;
  private int totalRun; //historico deslocamento

  public void inicializar(String codigo) {
    if (estaDesligado()) {
      this.codigo = codigo;
      this.totalRun = 0;
      this.estado = 1;

    } else {
      System.out.println("(log) falha!");
    }
  }

  public void ligar() {

  }

  public void desligar() {

  }

  public void mover(int destino) {

  }

  public String getCodigo() {
    return codigo;
  }

  public int getTotalRun() {
    return totalRun;
  }

  public boolean estaLigado() {
    
    if (estado == 1)
      return true;

    return false;
  }

  public boolean estaDesligado() {

    if (estado == 0)
      return true;

    return false;

  }
}