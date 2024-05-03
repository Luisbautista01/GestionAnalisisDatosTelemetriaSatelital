import java.util.ArrayList;

public class Clima extends Satelite {

    ArrayList<Ciudad> ciudades;

    public Clima(String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        super(tipo, posicionOrbitalX, posicionOrbitalY, posicionOrbitalZ, trayectoria, vidaUtil, estadoEnergia, temperatura, orientacion);
        this.ciudades = new ArrayList<>();
    }

    void agregarCiudad(Ciudad ciudad){
        this.ciudades.add(ciudad);
    }

    String pronosticoClima(String nombreCiudad){
        Ciudad ciudad = ciudades.stream().filter(c -> c.obtenerNombre().equals(nombreCiudad)).findFirst().orElse(null);
        int temperatura = ciudad.getTemperaturaClima();
        int humedad = ciudad.getHumedad();
        int velocidadViento = ciudad.getVelocidadViento();

        if(temperatura < 20 && humedad > 70 && velocidadViento > 10) {
            return "Va a llover";
        } else if(temperatura >= 15 && temperatura <= 25 && humedad >= 60 && humedad <= 70 && velocidadViento >= 5 && velocidadViento <= 10){
            return "Va a estar nublado";
        }else if(temperatura >= 20 && temperatura <= 30 && humedad >= 40 && humedad <= 60 && velocidadViento >= 3 && velocidadViento <= 8){
            return "Va estar parcialmente nublado";
        }
        return "Va a ser soleado";
    }
}
