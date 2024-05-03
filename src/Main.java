public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        SateliteClima sateliteClima = new SateliteClima("Meteorologico",50000,20000,34000,"Este",80,90,20,15);
        Ciudad medellin = new Ciudad("Medellin", 22,60,3);
        Ciudad cordoba = new Ciudad("Cordoba", 27,96,17);

        sateliteClima.agregarCiudad(medellin);
        sateliteClima.agregarCiudad(cordoba);

        String pronosticoMedellin = sateliteClima.pronosticoClima("Medellin");
        System.out.println(pronosticoMedellin);

        String pronosticoCordoba = sateliteClima.pronosticoClima("Cordoba");
        System.out.println(pronosticoCordoba);


        System.out.println(" ");
        SateliteGPS sateliteGPS = new SateliteGPS(5,7,"GPS",50000,20000,34000,"Norte",50,70,20,15);
        String precisionGPS = sateliteGPS.obtenerPrecisionGPS();
        System.out.println(precisionGPS);


        System.out.println(" ");
        SateliteTV sateliteTV = new SateliteTV(-50,10,100,"TV",50000,20000,34000,"Norte",50,70,20,15);
        String calidadTV = sateliteTV.obtenerCalidadTransmision();
        System.out.println(calidadTV);


        System.out.println(" ");
        SateliteComunicaciones sateliteComunicaciones = new SateliteComunicaciones(50,100,40, "Comunicaciones",50000,20000,34000,"Norte",50,70,20,15);
        String comunicacion = sateliteComunicaciones.obtenerCalidadComunicaciones();
        System.out.println(comunicacion);

    }

}