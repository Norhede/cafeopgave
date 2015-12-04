/**
 * Created by eselta on 12/4/15.
 */
public class Vagt {

    private String dato;

    private int timeAntal;

    private Medarbejder medarbejder;

    public Vagt(Medarbejder m, int timer, String dato){
        this.medarbejder = m;
        this.timeAntal = timer;
        this.dato = dato;
    }


    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getTimeAntal() {
        return timeAntal;
    }

    public void setTimeAntal(int timeAntal) {
        this.timeAntal = timeAntal;
    }

    public Medarbejder getMedarbejder() {
        return medarbejder;
    }

    public void setMedarbejder(Medarbejder medarbejder) {
        this.medarbejder = medarbejder;
    }
}
