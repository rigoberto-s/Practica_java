

public class App {
    public static void main(String[] args) throws Exception {

        BateriaSolar bateria = new BateriaSolar(30);
        
        NavePiloteada nave = new NavePiloteada("AV-200",20,8);
        SondaAutomatica sonda = new SondaAutomatica("Sonda 23-12",1,bateria);

        Comunicable[] comu = {nave,sonda};

        for (Comunicable c : comu) {
            System.out.println(c.transmitirDatos());
        }

        sonda.ejecutarMision();
        nave.ejecutarMision();


        System.out.println(bateria.extraerEnergia(-3));
        nave.cargarBateria(21);
        System.out.println(nave.getPorcentajeBateria());
        

    }
}
