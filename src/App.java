public class App {
    public static void main(String[] args) throws Exception {
       
        Bagno bagnoMaschi = new Bagno("M");
        Bagno bagnoFemmine = new Bagno("F");

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
