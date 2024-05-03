public class Satelite implements InterfazSatelite {

    private String tipo;
    protected int posicionOrbitalX;
    protected int posicionOrbitalY;
    protected int posicionOrbitalZ;
    private String trayectoria;
    private int vidaUtil;
    protected int estadoEnergia;
    protected int temperatura;
    private int orientacion;

    public Satelite(String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        this.tipo = tipo;
        this.posicionOrbitalX = posicionOrbitalX;
        this.posicionOrbitalY = posicionOrbitalY;
        this.posicionOrbitalZ = posicionOrbitalZ;
        this.trayectoria = trayectoria;
        this.vidaUtil = vidaUtil;
        this.estadoEnergia = estadoEnergia;
        this.temperatura = temperatura;
        this.orientacion = orientacion;
    }


    @Override
    public String calcularTelemetria() {
        int telemetria = (this.posicionOrbitalX + this.posicionOrbitalY + this.posicionOrbitalZ) * this.estadoEnergia + temperatura;

        if(telemetria >= 5000){
            return "Buena Calidad";
        } else if(telemetria < 2000){
            return "Mala Calidad";
        }
        return "Calidad Regular";

    }

    @Override
    public String obtenerPlanJubilacion() {
        int tiempoDeVidaUtil = this.vidaUtil / 10;
        return "Tiempo de vida util del Satelite es de " + tiempoDeVidaUtil + " años";
    }
}



