import java.util.ArrayList;

public class Empresa {

    ArrayList<Satelite> satelites;
    String nombre;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.satelites = new ArrayList<>();
    }

    void agregarSatelite(Satelite s) {
        this.satelites.add(s);
    }

}
