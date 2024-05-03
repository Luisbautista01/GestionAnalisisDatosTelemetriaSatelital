import java.time.LocalTime;

public class SateliteGPS extends Satelite{
    private int tiempoRecepcionSeñal;
    private LocalTime tiempoReloj;
    private int precisionHorizontal;
    private int precisionVertical;

    public SateliteGPS(int precisionHorizontal, int precisionVertical, String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        super(tipo, posicionOrbitalX, posicionOrbitalY, posicionOrbitalZ, trayectoria, vidaUtil, estadoEnergia, temperatura, orientacion);
        this.precisionHorizontal = precisionHorizontal;
        this.precisionVertical = precisionVertical;
        this.tiempoReloj = LocalTime.now();
    }

    String obtenerPrecisionGPS(){
        int precisionCombinada = this.precisionHorizontal + this.precisionVertical;
        double temperaturaNormalizada = super.temperatura / 100.0;
        double estadoEnergiaNormalizado = super.estadoEnergia / 100.0;

        double porcentajePrecision = 100 - (0.4 * precisionCombinada + 0.3 * temperaturaNormalizada + 0.3 * estadoEnergiaNormalizado);
        return "La precision del GPS es de " + porcentajePrecision + "%";

    }



}
