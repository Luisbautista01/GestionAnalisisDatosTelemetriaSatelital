public class SateliteTV extends Satelite{
    private int senial;
    private int anchoBanda;
    private int latencia;

    public SateliteTV(int potenciaSenial, int anchoBanda, int latencia, String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        super(tipo, posicionOrbitalX, posicionOrbitalY, posicionOrbitalZ, trayectoria, vidaUtil, estadoEnergia, temperatura, orientacion);
        this.senial = potenciaSenial;
        this.anchoBanda = anchoBanda;
        this.latencia = latencia;
    }

    String obtenerCalidadTransmision(){
        double anchoBanda = this.anchoBanda / (double)500;
        double potenciaSenial = (this.senial - ((double)-200)) / ((double)100 - ((double)-200));
        double latencia = 1 - (this.latencia / (double)500);

        double calidad = (0.5 * potenciaSenial) + (0.4 * anchoBanda) + (0.1 * latencia);
        double porcentajeCalidad = calidad * 100;

        if(porcentajeCalidad >= 80){
            return "Calidad de señal excelente";
        } else if(porcentajeCalidad >= 50){
            return "Calidad de señal Buena";
        } else if(porcentajeCalidad >= 20){
            return "Calidad de señal regular";
        }
        return "Calidad de señal mala";
    }

}
