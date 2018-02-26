
package zoohandlung;


    public class Ente extends Tier implements Laufen, Fliege, Schwimmen {

    double schnabellänge;
    double spannweite;
    int anzahlBeine;

    public Ente(String name, double gewicht, double schnabellänge, double spannweite) {
        super(name, gewicht);
        this.schnabellänge = schnabellänge;
        this.spannweite = spannweite;
    }

    @Override
    public void laufe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAnzahlBeine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnzahlBeine(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fliege() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void schwimme() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAnzahlFlossen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAnzahlFlossen(int anzahl) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
