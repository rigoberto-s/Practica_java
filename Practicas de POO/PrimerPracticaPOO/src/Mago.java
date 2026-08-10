public class Mago extends Personaje implements Volar{

    private int mana;


    public Mago(){
        
    }

    public Mago(String nombre, int nivel, Arma arma, int mana){
        super(nombre,nivel,arma);
        this.mana=mana;
    }


    @Override
    public double atacar() {
        return mana = this.mana * super.getNivel();
    }

    @Override
    public String toString() {
        return super.toString() + " Mago [mana=" + mana + "]";
    }

    //getter and setter
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public void volar() {
        System.out.println("El mago vuela con su magia");
    }

}
