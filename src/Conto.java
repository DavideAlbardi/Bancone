public class Conto {
    private String iban;
    private double saldo;

    public Conto(String iban, String nome, String cognome, String dataNascita, String cf) {
        this.iban = iban;
        Persona nuovaPersona = new Persona(nome, cognome, dataNascita, cf);
        this.saldo = 0;
    }

    public boolean deposita(Conto conto, double deposito){
        if(deposito > 0){
            saldo = saldo + deposito;
            return true;
        }
        return false;
    }

    public boolean preleva(Conto conto, double prelievo){
        if(saldo >= prelievo){
            saldo = saldo - prelievo;
            return true;
        }
        else
            return false;
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }
}
