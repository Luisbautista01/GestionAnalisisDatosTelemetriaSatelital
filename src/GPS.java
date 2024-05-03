public class GPS extends Satelite{

    private double tiempo;
    private int precisionHorizontal;
    private int precisionVertical;

    public GPS(double tiempo, int precisionHorizontal, int precisionVertical, String tipo, int posicionOrbitalX, int posicionOrbitalY, int posicionOrbitalZ, String trayectoria, int vidaUtil, int estadoEnergia, int temperatura, int orientacion) {
        super(tipo, posicionOrbitalX, posicionOrbitalY, posicionOrbitalZ, trayectoria, vidaUtil, estadoEnergia, temperatura, orientacion);
        this.precisionHorizontal = precisionHorizontal;
        this.precisionVertical = precisionVertical;
        this.tiempo = tiempo;
    }

    String obtenerPrecisionGPS(){
        int precisionCombinada = this.precisionHorizontal + this.precisionVertical;
        double temperaturaNormalizada = super.temperatura / 100.0;
        double estadoEnergiaNormalizado = super.estadoEnergia / 100.0;

        double porcentajePrecision = 100 - (0.4 * precisionCombinada + 0.3 * temperaturaNormalizada + 0.3 * estadoEnergiaNormalizado);
        return "La precision del GPS es de " + porcentajePrecision + "%";

    }

    String obtenerUbicacionGPS(Receptor receptor){
        double diferenciaTiempo = receptor.getTiempoRecepcion() - this.tiempo;

        double distancia = diferenciaTiempo * 299792;
        double[] ubicacionReceptor = {
                this.posicionOrbitalX + distancia,
                this.posicionOrbitalY + distancia,
                this.posicionOrbitalZ + distancia,
        };
        return "Tu ubicacion es: latitud " + ubicacionReceptor[0] + " km longitud " + ubicacionReceptor[1] + " km altura " + ubicacionReceptor[2] + " km";
    }

}
