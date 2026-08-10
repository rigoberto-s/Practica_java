public class BateriaSolar {

    private int energiaAlmacenada;


    //constructores
    public BateriaSolar(){

    }

    public BateriaSolar(int energiaAlmacenada){
        this.energiaAlmacenada=energiaAlmacenada;
    }

    //reglas de negocio
    public boolean extraerEnergia(int cantidad){

        if(cantidad <= energiaAlmacenada && cantidad >= 0){
            this.setEnergiaAlmacenada(this.getEnergiaAlmacenada()-cantidad);
            return true;
        }else{
            return false;
        }
    }

    public int getEnergiaAlmacenada() {
        return energiaAlmacenada;
    }

    public void setEnergiaAlmacenada(int energiaAlmacenada) {
        this.energiaAlmacenada = energiaAlmacenada;
    }

}
