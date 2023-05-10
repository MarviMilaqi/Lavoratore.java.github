package it.unipr.lavoratore;

public class Lavoratore {
    private final String nome;
    private final String specializzazione;
    private final double stipendioMensile;
    private static final double salarioMinimo = 1200;


    public Lavoratore(String nome, String specializzazione, double stipendioMensile) {
        this.nome = nome;
        this.specializzazione = specializzazione;
        this.stipendioMensile = stipendioMensile;

        if (salarioMinimo > stipendioMensile)
            throw new RuntimeException("ERRORE!");
    }

    public double getStipendio() {
        return stipendioMensile * 12;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nSpecializzazione: " + specializzazione + "\nStipendio Mensile: " + stipendioMensile;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null)
            return false;
        else if (obj instanceof Lavoratore other) {
            return this.nome.equals(other.nome) && this.specializzazione.equals(other.specializzazione) && this.stipendioMensile == other.stipendioMensile;
        }
        return false;
    }
}
