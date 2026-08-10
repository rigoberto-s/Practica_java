public class NavePiloteada extends VehiculoEspacial implements Comunicable{

    private int cantidadAstronautas;

    public NavePiloteada(String nombre, int porcentajeBateria, int cantidadAstronautas){
        super(nombre,porcentajeBateria);
        this.cantidadAstronautas=cantidadAstronautas;
    }

    public NavePiloteada(){
        
    }

    //herencia
    @Override
    public void ejecutarMision() {
        System.out.println("Nave " + super.getNombre() + " iniciando descenso con " + this.cantidadAstronautas + " astronautas");
    }

    //implementacion
    @Override
    public String transmitirDatos() {
        return "Hola les comunicamos que si hay señal";
    }


    //getter and setter
    public int getCantidadAstronautas() {
        return cantidadAstronautas;
    }

    public void setCantidadAstronautas(int cantidadAstronautas) {
        this.cantidadAstronautas = cantidadAstronautas;
    }


}
