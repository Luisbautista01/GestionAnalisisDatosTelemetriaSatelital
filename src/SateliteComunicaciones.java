public class SateliteComunicaciones extends Satelite{
    private int potencia;
    private int frecuencia;
    private int relacionSenialRuido;

    public SateliteComunicaciones(int potencia, int frecuencia, int relacionSenialRuido, String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        super(tipo, posicionOrbitalX, posicionOrbitalY, posicionOrbitalZ, trayectoria, vidaUtil, estadoEnergia, temperatura, orientacion);
        this.potencia = potencia;
        this.frecuencia = frecuencia;
        this.relacionSenialRuido = relacionSenialRuido;
    }

    String obtenerCalidadComunicaciones(){
        double potencia = this.potencia / (double)100;
        double frecuencia = (this.frecuencia - (double)20) / ((double)10000 - (double)20);
        double relacionSenialRuido = (this.relacionSenialRuido - (double)-10) / ((double)60 - (double)-10);

        double calidad = (0.4 * potencia) + (0.2 * frecuencia) + (0.4 * relacionSenialRuido);
        double porcentajeCalidad = calidad * 100;

        if(porcentajeCalidad >= 80){
            return "Calidad de comunicacion excelente";
        } else if(porcentajeCalidad >= 50){
            return "Calidad de comunicacion Buena";
        } else if(porcentajeCalidad >= 20){
            return "Calidad de comunicacion regular";
        }
        return "Calidad de comunicacion mala";
    }
}
