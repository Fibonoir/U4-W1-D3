package esercizio1.classes;

public class Rettangolo {
    // Attributi privati per incapsulamento
    private double altezza;
    private double larghezza;

    // Costruttore per inizializzare altezza e larghezza
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    // Metodi getter e setter
    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("L'altezza deve essere positiva.");
        }
    }

    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            System.out.println("La larghezza deve essere positiva.");
        }
    }

    // Metodo per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    // Metodo per calcolare l'area
    public double calcolaArea() {
        return altezza * larghezza;
    }

    // Metodo per stampare area e perimetro di un rettangolo
    public void stampaRettangolo() {
        System.out.println("Rettangolo:");
        System.out.println("Altezza: " + altezza);
        System.out.println("Larghezza: " + larghezza);
        System.out.println("Perimetro: " + calcolaPerimetro());
        System.out.println("Area: " + calcolaArea());
        System.out.println();
    }

    // Metodo statico per stampare informazioni di due rettangoli
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo Rettangolo:");
        r1.stampaRettangolo();

        System.out.println("Secondo Rettangolo:");
        r2.stampaRettangolo();

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
