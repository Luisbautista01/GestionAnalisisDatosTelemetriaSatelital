public class Main {
    public static void main(String[] args) {

        Empresa adidas = new Empresa("ADIDAS");
        Clima sateliteClima = new Clima("Meteorologico",50000,20000,34000,"Este",80,90,20,15);
        GPS sateliteGPS = new GPS(2000,5,7,"GPS",50000,20000,34000,"Norte",50,70,20,15);
        TV sateliteTV = new TV(-50,10,100,"TV",50000,20000,34000,"Norte",50,70,20,15);
        Comunicaciones sateliteComunicaciones = new Comunicaciones(50,100,40, "Comunicaciones",50000,20000,34000,"Norte",50,70,20,15);

        adidas.agregarSatelite(sateliteClima);
        adidas.agregarSatelite(sateliteGPS);
        adidas.agregarSatelite(sateliteTV);
        adidas.agregarSatelite(sateliteComunicaciones);


        System.out.println(" ");
        Ciudad medellin = new Ciudad("Medellin", 22,60,3);
        Ciudad cordoba = new Ciudad("Cordoba", 27,96,17);

        sateliteClima.agregarCiudad(medellin);
        sateliteClima.agregarCiudad(cordoba);

        String pronosticoMedellin = sateliteClima.pronosticoClima("Medellin");
        System.out.println(pronosticoMedellin);

        String pronosticoCordoba = sateliteClima.pronosticoClima("Cordoba");
        System.out.println(pronosticoCordoba);


        System.out.println(" ");
        Receptor receptor = new Receptor(2010);
        String precisionGPS = sateliteGPS.obtenerPrecisionGPS();
        String ubicacionReceptor = sateliteGPS.obtenerUbicacionGPS(receptor);
        System.out.println(precisionGPS);
        System.out.println(ubicacionReceptor);


        System.out.println(" ");
        String calidadTV = sateliteTV.obtenerCalidadTransmision();
        System.out.println(calidadTV);


        System.out.println(" ");
        String comunicacion = sateliteComunicaciones.obtenerCalidadComunicaciones();
        System.out.println(comunicacion);

    }

}