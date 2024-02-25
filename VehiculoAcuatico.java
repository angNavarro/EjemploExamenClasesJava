public class VehiculoAcuatico extends Vehiculo {
    protected int eslora;
    public VehiculoAcuatico(String matricula, String modelo, int eslora) {
        super(matricula, modelo);
        this.eslora=eslora;
        
    }

    public int getEslora() {
        return eslora;
    }
    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
    
    @Override
    public void imprimir() {
        System.out.println("Vehiculo acuatico.Matricula: " + matricula + " Modelo: " + modelo + "Eslora: " + eslora);


    }
    
    
    
}
