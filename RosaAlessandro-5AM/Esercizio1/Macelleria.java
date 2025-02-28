import java.util.Random;

public class Macelleria {
    private int _cifraTotale;
    private int _tempoAttesa;
    
    public synchronized void termineServizio(String numeroCliente, String nome, String cognome) throws InterruptedException{
        _tempoAttesa = (int)(1000+Math.random()*1001);
        Thread.sleep(_tempoAttesa);
        _cifraTotale =(int)(2+Math.random()*51);
        System.out.println("Numero Cliente " +numeroCliente);
        System.out.println("Nome Cliente " +nome);
        System.out.println("Cognome Cliente " +cognome);
        System.out.println("Cifra totale " +_cifraTotale);
    }
}