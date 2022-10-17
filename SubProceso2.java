// Ejecucuion de un sub proceso //

public class Main extends Thread {
  public static void main(String[] args){
    Main thread = new Main();
    thread.start();
    System.out.println("Este codigo esta fuera del suub proceso" );
  }
  public void run(){
    System.out.println("Este codigo corre dentro de un subproceso" );
  }
  
}

