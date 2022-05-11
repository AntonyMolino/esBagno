public class Persona extends Thread{
    String nome;
    Bagno b;

    public Persona(String n , Bagno b){

        this.nome = n;
        this.b = b;
    }

    public void run(){

        b.usaBagno(this.nome);


    }
}
