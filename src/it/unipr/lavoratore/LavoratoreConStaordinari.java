package it.unipr.lavoratore;

public class LavoratoreConStaordinari extends Lavoratore {
    private static final double retribuzioneOraria = 10.50;
    private final double oreStraordinario;

    public LavoratoreConStaordinari(String nome, String specializzazione, double stipendioMensile, double oreStraordinario) {
        super(nome, specializzazione, stipendioMensile);
        this.oreStraordinario = oreStraordinario;
    }


    @Override
    public double getStipendio() {
        return super.getStipendio() + retribuzioneOraria * oreStraordinario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOre straordinario: " + oreStraordinario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        else if (obj == null)
            return false;
        else if (obj instanceof LavoratoreConStaordinari other) {
            return super.equals(other) && this.oreStraordinario == other.oreStraordinario;
        }
            return false;

        }
    }

