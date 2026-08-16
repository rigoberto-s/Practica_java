public class Submarino extends VehiculoAcuatico{


    public Submarino(String nombre, TanqueOxigeno tanque){
        super(nombre, tanque);
    }

    @Override
    public void sumergirse() {
        
        if (super.getTanque().consumir(25)==true) {
            System.out.println("El submarino " + this.getNombre() +" se ha sumergido con éxito");
        }else{
            System.out.println("Alarma: Oxígeno insuficiente para " + this.getNombre());
        }
    }

}
