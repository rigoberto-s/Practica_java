public abstract class Dinosaurio {

    private String nombre;
    private String especie;
    private int nivelHambre;

    public Dinosaurio(){

    }

    public Dinosaurio(String nombre, String especie, int nivelHambre){
        this.nombre=nombre;
        this.especie=especie;
        this.nivelHambre=nivelHambre;
    }

    //metodo de alimentar
    public void alimentar(int porcionComida) {
    // ¿Cómo escribirías aquí el 'if' usando this.nivelDeHambre y porcionComida?
        
        if(porcionComida <= this.nivelHambre && porcionComida > 0){
            this.setNivelHambre(this.nivelHambre-porcionComida);
        }
        
    }

    //metodo abstracto
    public abstract String emitirSonido();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }

    public void setNivelHambre(int nivelHambre) {
        this.nivelHambre = nivelHambre;
    }

    
}
