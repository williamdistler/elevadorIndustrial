class Main {
  public static void main(String[] args) {

      Elevador e = new Elevador();

      e.inicializar("TORRE-B");

    System.out.println("Nome: " + e.getCodigo() + " [rodagem: "+e.getTotalRun()+"]");
      System.out.println("Andar: " + e.getPosicao());

      e.mover(10);

    System.out.println("Nome: " + e.getCodigo() + " [rodagem: "+e.getTotalRun()+"]");
      System.out.println("Andar: " + e.getPosicao());

      e.mover(3);

    System.out.println("Nome: " + e.getCodigo() + " [rodagem: "+e.getTotalRun()+"]");
      System.out.println("Andar: " + e.getPosicao());

      e.mover(0);

      e.desligar();

    System.out.println("Nome: " + e.getCodigo() + " [rodagem: "+e.getTotalRun()+"]");
      System.out.println("Andar: " + e.getPosicao());

      e.inicializar("NEW-TOWER-CENTRAL");

    System.out.println("Nome: " + e.getCodigo() + " [rodagem: "+e.getTotalRun()+"]");
      System.out.println("Andar: " + e.getPosicao());

    System.out.println("fim do teste!");
  }
}
