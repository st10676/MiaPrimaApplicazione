public class Supermercato {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("gastronomia", "a", "a", "e23h");
        Cliente c2 = new Cliente("macelleria", "b", "b", "qwefew222");
        Cliente c3 = new Cliente("panetteria", "c", "c", "gr445");
        Cliente c4 = new Cliente("pescheria", "d", "d", "dhh666");
        Cliente c5 = new Cliente("gastronomia", "e", "e", "wefw21");
        Cliente c6 = new Cliente("macelleria", "f", "f", "23fdf");
        Cliente c7 = new Cliente("panetteria", "g", "g", "687vcbf");
        Cliente c8 = new Cliente("pescheria", "h", "h", "564fdffd");
        Cliente c9 = new Cliente("gastronomia", "i", "i", "65ff44");
        Cliente c10 = new Cliente("macelleria", "j", "j", "sd33hh");

        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start();
        c10.start();
    }
}