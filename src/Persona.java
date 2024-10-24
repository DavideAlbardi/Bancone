public class Persona {
    private String nome, cognome, dataNascita, cf;

    public Persona(String nome, String cognome, String dataNascita, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }

    public String getCf() {
        return cf;
    }
}
