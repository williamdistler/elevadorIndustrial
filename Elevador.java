class Elevador {

  private String codigo;
  private int estado; //0, 1, 2 ou 3
  private int posicao;
  private int totalRun; //historico deslocamento

  public void inicializar(String codigo) {
    if (this.estaDesligado()) {
      this.codigo = codigo;
      this.totalRun = 0;
      this.estado = 1;

    } else {
      System.out.println("(log) falha ao inicializar!");
    }
  }

  public void ligar() {
    if(this.estado == 0)
      this.estado = 1;
    else
      System.out.println("(log) falha, no ligar!");
  }

  public void desligar() {
    if(this.estado == 1 && this.posicao == 0) //ligado e esta no terreo
      this.estado = 0;
    else
      System.out.println("(log) falha, ao desligar!");
  }

  public void mover(int destino) {
    if(destino >= 0 && estado ==1){
      int distancia;
      if(destino > posicao){
        System.out.println("(log) subindo ...!");
        distancia = destino - posicao;
      } else {
        System.out.println("(log) descendo ...!");
        distancia = posicao - destino;
      }

      totalRun = this.totalRun + distancia;
      this.posicao = destino;
    } else {
      System.out.println("(log) falha, no mover!");
    }
  }

  public String getCodigo() {
    return this.codigo;
  }

  public int getPosicao() {
    return posicao;
  }

  public int getTotalRun() {
    return totalRun;
  }

  public boolean estaDesligado() {

    if (estado == 0)
      return true;

    return false;

  }
}