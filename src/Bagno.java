public class Bagno {
    String genereBagno;
    Semaforo semaforo;
    public Bagno(String g,Semaforo s){
        this.genereBagno = g;
        this.semaforo = s;
    }
    
    
    public  void usaBagno(String nome) {

        System.out.println( genereBagno + " : " + nome + " e' entrato nel bagno");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println( genereBagno + " : " + nome + " e' uscito dal bagno");
    }

}
