public class App {
    public static void main(String[] args) throws Exception {
       
        Semaforo s1 = new Semaforo(2);
        Semaforo s2 = new Semaforo(1);
        
        Bagno bagnoMaschi = new Bagno("M",s1);
        Bagno bagnoFemmine = new Bagno("F",s2);

        Persona p1 = new Persona("Ciccio", bagnoMaschi);
        Persona p2 = new Persona("Alessandro", bagnoMaschi);
        Persona p3 = new Persona("Alessia", bagnoFemmine);
        Persona p4 = new Persona("Giulia", bagnoFemmine);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
