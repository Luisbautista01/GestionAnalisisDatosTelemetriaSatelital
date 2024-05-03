public class Ciudad {
    private String nombre;
    private int temperaturaClima;

    private int humedad;
    private int velocidadViento;

    public Ciudad(String nombre, int temperaturaClima, int humedad, int velocidadViento) {
        this.nombre = nombre;
        this.temperaturaClima = temperaturaClima;
        this.humedad = humedad;
        this.velocidadViento = velocidadViento;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public int getTemperaturaClima() {
        return temperaturaClima;
    }

    public int getHumedad() {
        return humedad;
    }

    public int getVelocidadViento() {
        return velocidadViento;
    }

}
