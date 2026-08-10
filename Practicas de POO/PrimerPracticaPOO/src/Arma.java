public class Arma {

    private String nombreArma;
    private int danio;

    //constructores
    public Arma(String nombreArma, int danio){
        this.nombreArma=nombreArma;
        this.danio=danio;
    }

    public Arma(){
        
    }

    //Getter and setter
    public String getNombreArma() {
        return nombreArma;
    }
    public void setNombreArma(String nombreArma) {
        this.nombreArma = nombreArma;
    }
    public int getDanio() {
        return danio;
    }
    public void setDanio(int danio) {
        this.danio = danio;
    }

    //Medoto toString
    @Override
    public String toString() {
        return " Arma [Arma=" + nombreArma + ", danio=" + danio + "]";
    }


}
