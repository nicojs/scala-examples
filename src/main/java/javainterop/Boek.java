package javainterop;


public class Boek {
    private String _titel;      // titel van het boek,  bv: "Desgin Patterns"
    private int _prijsInCenten; // prijs in centen,     bv: 2595
    private String _auteurs;    // achternamen, komma-geschieden, bv: "Gamma, Helm, Johnson, Vlissides"
    private String _uitgever;   // naam van de uitgever,    bv: "Addison-Wesley"

    public Boek(String titel, int prijsInCenten, String auteurs, String uitgever) {
        _titel = titel;
        _prijsInCenten = prijsInCenten;
        _auteurs = auteurs;
        _uitgever = uitgever;
    }

    public String getTitel() {
        return _titel;
    }
    public void setTitel(String titel) {
        _titel = titel;
    }

    public int getPrijsInCenten() {
        return _prijsInCenten;
    }
    public void setPrijsInCenten(int prijsInCenten) {
        _prijsInCenten = prijsInCenten;
    }

    public String getAuteurs() {
        return _auteurs;
    }
    public void setAuteurs(String auteurs) {
        _auteurs = auteurs;
    }

    public String getUitgever() {
        return _uitgever;
    }
    public void setUitgever(String uitgever) {
        _uitgever = uitgever;
    }
}
