
package zoohandlung;


    public class Schmetterling extends Tier implements Laufen, Fliege {

    String farbe;
    double spannweite;
    int anzahlBeine;

    public Schmetterling(String name, double gewicht, String farbe, double spannweite) {
        super(name, gewicht);
        this.farbe = farbe;
        this.spannweite = spannweite;
    }

    @Override
    public void laufe() {
        System.out.println("Ich laufe");
    }

    @Override
    public int getAnzahlBeine() {
         return anzahlBeine;
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public void fliege() {
        System.out.println("Ich fliege!");
    }
}

