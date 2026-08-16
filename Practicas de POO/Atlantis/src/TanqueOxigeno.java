
public class TanqueOxigeno {

    private int capacidadMaxima;
    private int nivelActual;


    public TanqueOxigeno(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        nivelActual=this.capacidadMaxima;
    }

    //metodos personalizados
    public boolean consumir(int cantidad){
        
        if (cantidad <= nivelActual && cantidad >= 0) {
            this.nivelActual=this.nivelActual - cantidad;
            return true;
        }else{
            return false;
        }
        
    }

    public void recargar(){
        this.nivelActual = this.capacidadMaxima;
    }


    //getter and setter
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    
    public int getNivelActual() {
        return nivelActual;
    }



}
