public abstract class VehiculoEspacial {

    private String nombre;
    //de 0 a 100
    private int porcentajeBateria;

    public VehiculoEspacial(){

    }

    public VehiculoEspacial(String nombre, int porcentajeBateria){
        this.nombre=nombre;
        this.porcentajeBateria=porcentajeBateria;
    }

    //reglas de negocio
    public void cargarBateria(int cantidad){

        int vandera = this.getPorcentajeBateria() + cantidad;
        if(cantidad > 0 && vandera <= 100){
            this.setPorcentajeBateria(this.getPorcentajeBateria()+cantidad);
        }
    }

    //metodo abstractos
    public abstract void ejecutarMision();

    //getter and setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(int porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }
}
