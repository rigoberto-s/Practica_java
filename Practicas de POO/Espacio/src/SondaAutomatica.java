

public class SondaAutomatica extends VehiculoEspacial implements Comunicable{

    private BateriaSolar bateriaSolar;

    public SondaAutomatica(){
        bateriaSolar = new BateriaSolar();
    }

    public SondaAutomatica(String nombre, int porcentajeBateria, BateriaSolar bateriaSolar){
        super(nombre,porcentajeBateria);
        this.bateriaSolar=bateriaSolar;
    }

    //implementa
    @Override
    public String transmitirDatos() {
        return "La bateria solar esta bien";
    }

    //hereda
    @Override
    public void ejecutarMision() {
        
        int sumar = (this.getPorcentajeBateria() - 20);
        if(bateriaSolar.extraerEnergia(20)==true){
            System.out.println("Sonda recolectando muestras marcianas");
        }else{
            System.out.println("Error: Energía solar insuficiente");
        }
    }

    //getter ans setter
    public BateriaSolar getBateriaSolar() {
        return bateriaSolar;
    }

    public void setBateriaSolar(BateriaSolar bateriaSolar) {
        this.bateriaSolar = bateriaSolar;
    }

}
