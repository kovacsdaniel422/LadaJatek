package teszt;

import lada.Lada;

public class tesztEset {
    public static void main(String[] args) {
        new tesztEset().ladaTesz(Lada.EZUST);
    }

    private void ladaTesz(String melyikLadaJo) {
        Lada lad=new Lada("", melyikLadaJo);
        String vizs=lad.vizsgal(melyikLadaJo);
        assert vizs.equals("Gratulálok! Nyertél!"):"Kiiratás jó";
        
    }
}
