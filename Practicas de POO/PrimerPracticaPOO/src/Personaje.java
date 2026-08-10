public abstract class Personaje {

    private String nombre;
    private int nivel;
    private Arma arma;


    public Personaje(){
        arma = new Arma();
    }

    public Personaje(String nombre, int nivel, Arma arma){
        this.nombre=nombre;
        this.nivel=nivel;
        this.arma=arma;
    }

    //Metodos personalizados
    public abstract double atacar();

    //Metodo, aumenta en 1
    public void subirNivel(){
        int subir = 1;
        this.nivel = this.nivel + subir;
    }

    //Getter and setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }


    //Metodo toString
    @Override
    public String toString() {
        return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", arma=" + arma + "]";
    }

    
}
