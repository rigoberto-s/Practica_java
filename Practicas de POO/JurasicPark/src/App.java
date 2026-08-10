public class App {
    public static void main(String[] args) throws Exception {

        SensorGPS sensor = new SensorGPS();
        
        
        TRex rex = new TRex("Makali", "Trex Marino", 2, 9,sensor);
        Jeep jeep = new Jeep();

        Dinosaurio dinosaurio = rex;

        System.out.println(dinosaurio.emitirSonido());
        System.out.println(rex.emitirSonido());

        Rastreable[] rastrea = {rex,jeep};

        for(Rastreable r : rastrea){
            System.out.println(r.obtenerCoordenadas());
        }


    }
}
