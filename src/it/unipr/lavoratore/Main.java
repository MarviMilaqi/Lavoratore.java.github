package it.unipr.lavoratore;

public class Main {
    public static void main(String[] args) {
        Lavoratore l1 = new Lavoratore("Marco", "AVANZATO", 2500);
        Lavoratore l2 = new Lavoratore("Paolo", "MEDIO", 2000);
        Lavoratore l3 = new Lavoratore("Leonardo", "BASE", 1500);
        LavoratoreConStaordinari l4 = new LavoratoreConStaordinari("Fabrizio", "MEDIO", 1900, 15);
        LavoratoreConStaordinari l5 = new LavoratoreConStaordinari("Davide", "BASE", 1300, 8);
        LavoratoreConStaordinari l6 = new LavoratoreConStaordinari("Alessandro", "AVANZATO", 2100, 18);

        System.out.println(l1);
        System.out.println(l6);
        System.out.println(l1.getStipendio());
        System.out.println(l6.getStipendio());
    }
}