import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        

        //List
        List<String> nombres = new ArrayList<>();
        nombres.add("Neil Armstrong");
        nombres.add("Buzz Aldrin");
        System.out.println(nombres.get(0));
        System.out.println(nombres.size());

        //Set
        Set<String> sectores = new HashSet<>();
        sectores.add("Sector Alpha");
        sectores.add("Sector Beta");
        sectores.add("Sector Alpha");
        System.out.println(sectores.size());

        //Map
        Map<String, String> identificaciones = new HashMap<>();
        identificaciones.put("CMD-01","Neil Armstrong");
        identificaciones.put("PLT-02", "Buzz Aldrin");
        System.out.println(identificaciones.get("CMD-01"));

        // Creamos la sonda, pero le ponemos el disfraz genérico de VehiculoEspacial
        VehiculoEspacial v = new SondaAutomatica("Sonda 23-12", 100, new BateriaSolar(30));
    
        SondaAutomatica miSonda = (SondaAutomatica) v;
        System.out.println(miSonda.getBateriaSolar());
    }
}
