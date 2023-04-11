package Taller2;

public class Ruta {
    private int ruta;
    private String pueblo;

    public Ruta(){};

    public Ruta(int ruta, String pueblo) {
        this.ruta = ruta;
        this.pueblo = pueblo;
    }

    public int getRuta() {
        return ruta;
    }
    public void setRuta(int ruta) {
        this.ruta = ruta;
    }
    public String getPueblo() {
        return pueblo;
    }
    public void setPueblo(String pueblo) {
        this.pueblo = pueblo;
    }
}
