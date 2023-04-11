public class Estudiante {
    private String nombre;
    private int ticket;

    
    public Estudiante(String nombre, int ticket) {
        this.nombre = nombre;
        this.ticket = ticket;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTicket() {
        return ticket;
    }
    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    
}
