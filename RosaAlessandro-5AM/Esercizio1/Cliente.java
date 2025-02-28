public class Cliente extends Thread{
    private String _nome;
    private String _cognome;
    private String _numeroCliente;
    private String _reparto;
    private Gastronomia gastronomia;
    private Macelleria macelleria;
    private Pescheria pescheria;
    private Panetteria panetteria;

    public Cliente(String reparto, String Nome, String Cognome, String NumeroCliente){
        this._reparto = reparto;
        this._nome = Nome;
        this._cognome = Cognome;
        this._numeroCliente = NumeroCliente;
    }

    public void run()
    {   
        try {
            if (_reparto == "gastronomia") {
                gastronomia.termineServizio(_numeroCliente, _nome, _cognome);
            }
            else if (_reparto == "macelleria") {
                macelleria.termineServizio(_numeroCliente, _nome, _cognome);
            }
            else if (_reparto == "pescheria") {
                pescheria.termineServizio(_numeroCliente, _nome, _cognome);
            }
            else if (_reparto == "panetteria") {
                panetteria.termineServizio(_numeroCliente, _nome, _cognome);
            }
        } catch (Exception ex) {
            System.out.println("Errore " + ex);
        }    
        
    }
}
