
public class Jeep implements Rastreable{

    private SensorGPS sensor;

    public Jeep(){
        sensor = new SensorGPS();
    }


    @Override
    public String obtenerCoordenadas() {
        return sensor.leerUbicacion();
    }

    
}
