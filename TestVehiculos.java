import java.util.ArrayList;

public class TestVehiculos{
    public static void main(String[] args) {
            // VehiculoTerrestre vehiculo2 = new VehiculoTerrestre("1234AAS", "Tesla", 2);
            // vehiculo2.imprimir();

            // Coche coche2= new Coche("12334AAAS", "rena", 3, true);
            // coche2.imprimir();

            ArrayList<Vehiculo> listaVehiculos2= new ArrayList<>();
            listaVehiculos2.add(new Coche("112aas", "test1", 2, false));
            listaVehiculos2.add(new Coche("112a221", "test1", 3, false));
            listaVehiculos2.add(new Coche("112aas", "test1", 4, false));
            listaVehiculos2.add(new Barco("3321dd", "mann", 300, 2));

            // for(Vehiculo i:listaVehiculos2){
            //     if(i instanceof VehiculoTerrestre){
            //         System.out.println("Ruedas: " +((VehiculoTerrestre)i).getRuedas());
            //     }
            // }

            for(Vehiculo i:listaVehiculos2){
                if (i instanceof VehiculoTerrestre) {
                    System.out.println("Ruedas: "+ ((VehiculoTerrestre)i).getRuedas()+ " Matricula: " + ((VehiculoTerrestre)i).getMatricula());
                    
                }
            }
            for (int i = 0; i < listaVehiculos2.size(); i++) {
                if (listaVehiculos2.get(i) instanceof VehiculoAcuatico){
                    System.out.println("Eslora: " + ((VehiculoAcuatico)listaVehiculos2.get(i)).getEslora());

                }
                
            }
    }
}
