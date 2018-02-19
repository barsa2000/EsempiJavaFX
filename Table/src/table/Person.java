package table;

public class Person {
    public Person(String nome, String cognome, int anni) {
        this.nome = nome; 
        this.cognome = cognome;
        this.anni = anni;
    }
    
    private final String nome;
    private final String cognome;
    private final int anni;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getAnni() {
        return anni;
    }
    
}
