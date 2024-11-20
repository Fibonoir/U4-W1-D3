package esercizio1;

import esercizio1.classes.Rettangolo;

public class Main {
    public static void main(String[] args) {
        // Creazione di due istanze di Rettangolo
        Rettangolo rett1 = new Rettangolo(5.0, 3.0);
        Rettangolo rett2 = new Rettangolo(4.0, 6.0);

        // Stampa delle informazioni di ciascun rettangolo
        rett1.stampaRettangolo();
        rett2.stampaRettangolo();

        // Stampa delle informazioni di entrambi i rettangoli e delle loro somme
        Rettangolo.stampaDueRettangoli(rett1, rett2);
    }
}
