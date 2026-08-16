public abstract class VehiculoAcuatico {

    private String nombre;

    private TanqueOxigeno tanque;


    public VehiculoAcuatico(String nombre, TanqueOxigeno tanque){
        this.nombre=nombre;
        this.tanque=tanque;
    }

    //metodos abs
    public abstract void sumergirse();


    //solo get para acceder
    public String getNombre(){
        return nombre;
    }

        public TanqueOxigeno getTanque() {
        return tanque;
    }


}
