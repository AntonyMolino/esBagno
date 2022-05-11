public class Bagno {
    String genereBagno;
    
    public Bagno(String g){
        this.genereBagno = g;
    }
    
    
    public synchronized void usaBagno(String nome) {

        System.out.println( genereBagno + " : " + nome + " e' entrato nel bagno");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println( genereBagno + " : " + nome + " e' uscito dal bagno");
    }

}
