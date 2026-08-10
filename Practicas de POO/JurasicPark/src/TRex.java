
public class TRex extends Dinosaurio implements Rastreable{

    private int nivelAgresividad;
    private SensorGPS sensor;

    public TRex(String nombre, String especie, int nivelHambre, int nivelAgresividad, SensorGPS sensor){
        super(nombre,especie,nivelHambre);
        this.nivelAgresividad=nivelAgresividad;
        this.sensor=sensor;
    }

    public TRex(){
        sensor = new SensorGPS();
    }



    
    //getter and setter
    public int getNivelAgresividad() {
        return nivelAgresividad;
    }

    public void setNivelAgresividad(int nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    //metodo abstracti
    @Override
    public String emitirSonido() {
        return "¡ROAAAR ¡ROAAAR";
    }



    @Override
    public String obtenerCoordenadas() {
        return sensor.leerUbicacion();
    }




}
