import java.util.Random;
public class Gara {
    public static void main(String[] args) {
        String[] nomi = new String[]{"Verstappen","Pèrez","Hamilton","Russell","Leclerc","Sainz","Norris","Piastri","Alonso","Stroll"};
        int tempo;

        Random rnd = new Random();
        tempo = rnd.nextInt();

        Pilota p1 = new Pilota(tempo, nomi[rnd.nextInt(9)-1]);
    } 
}
