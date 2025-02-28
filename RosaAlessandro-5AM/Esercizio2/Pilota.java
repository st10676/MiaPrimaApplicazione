public class Pilota extends Thread{
    private int _tempo;
    private String _nome;
    
    public Pilota(int tempo, String nome){
        this._tempo = tempo;
        this._nome = nome;
    }
}