import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        

        TanqueOxigeno tanque1 = new TanqueOxigeno(15);
        TanqueOxigeno tanque2 = new TanqueOxigeno(50);

        Submarino sub1 = new Submarino("Nautilus", tanque1);
        Submarino sub2 = new Submarino("Poseidon", tanque2);

        List<VehiculoAcuatico> vehiculos = new ArrayList<>();
        vehiculos.add(sub1);
        vehiculos.add(sub2);

        for(VehiculoAcuatico v: vehiculos){
            v.sumergirse();
        }

    }
}
