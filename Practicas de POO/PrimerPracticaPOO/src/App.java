public class App {
    public static void main(String[] args) throws Exception {
        

        Arma espada = new Arma("Scalifor",7);
        Arma baston = new Arma("Piston",10);

        Guerrero guerrero = new Guerrero("Jose",10,espada,5);
        Mago mago = new Mago("Merlin",3,baston,8);

        //primer prueba
        /* 
        Personaje p1 = guerrero;
        Personaje p2 = mago;
        */
        System.out.println(guerrero.atacar());
        System.out.println(mago.atacar());

        System.out.println(mago.getNivel());
        mago.getNivel();
        mago.setNombre("Jose");
        System.out.println(mago.getNombre());


        //
    }
}
