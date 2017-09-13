import java.util.ArrayList;
import java.util.List;

public class Blynine {
    private String pav;
    private String sav_vardas;
    private List<Blynas> blynai = new ArrayList<>();
    public Blynine(String pav, String sav_vardas) {
        this.pav = pav;
        this.sav_vardas = sav_vardas;
        blynai.add(new Blynas("Lietinis"));
        blynai.add(new Blynas("Zemaiciu"));
        blynai.add(new Blynas("Kedainiu"));
    }
    public List<Blynas> getBlynai() {
        return blynai;
    }

    public String getPav() {
        return pav;
    }

    public void setPav(String pav) {
        this.pav = pav;
    }

    public String getSav_vardas() {
        return sav_vardas;
    }

    public void setSav_vardas(String sav_vardas) {
        this.sav_vardas = sav_vardas;
    }

    @Override
    public String toString() {
        return "java.pirma.paskaita.Blynine{" +
                "pav='" + pav + '\'' +
                ", sav_vardas='" + sav_vardas + '\'' +
                '}';
    }
}
