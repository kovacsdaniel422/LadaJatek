package lada;

public class Lada {

    public static final String ARANY = "Arany";
    public static final String EZUST = "Ezüst";
    public static final String BRONZ = "Bronz";
    private String aranySzabaly;
    private String ezustSzabaly;
    private String bronzSzabaly;
    private String helyesLada;
    private String leiras;

    public Lada() {
        this(
                "3 ládát látsz ezek közül 1 rejti a kincset.<br> Találd ki melyik.<br>"
                + " A ládákon van 1-1 felirat.<br>"
                + " Csak az egyik láda mond igazat.<br><br> Sok szerencsét",
                EZUST);
    }

    public Lada(String leiras, String helyesLada) {
        this.aranySzabaly = "Arany: Én rejtem a kincset";
        this.ezustSzabaly = "Ezüst: Nem én rejtem a kincset";
        this.bronzSzabaly = "Bronz: Az arany hazudik.";
        this.leiras = leiras;
        this.helyesLada = helyesLada;
    }

    public String vizsgal(String Tipp) {
        if (Tipp.equals(helyesLada)) {
            return ("Gratulálok! Nyertél!");

        } else {
            return ("Sajnálom. Vesztettél.");
        }
    }

    public String getAranySzabaly() {
        return aranySzabaly;
    }

    public String getEzustSzabaly() {
        return ezustSzabaly;
    }

    public String getBronzSzabaly() {
        return bronzSzabaly;
    }

    public String getHelyesLada() {
        return helyesLada;
    }

    public String getLeiras() {
        return leiras;
    }

}
