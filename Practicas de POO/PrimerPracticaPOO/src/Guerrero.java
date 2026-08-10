

public class Guerrero extends Personaje{

    private int fuerza;


    public Guerrero(){

    }

    public Guerrero(String nombre, int nivel, Arma arma, int fuerza){
        super(nombre,nivel,arma);
        this.fuerza=fuerza;
    }

    //metodo personalizado
    @Override
    public double atacar() {
        return fuerza * super.getNivel();
    }


    //getter ans setter
    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + " Guerrero [fuerza=" + fuerza + "]";
    }


}
