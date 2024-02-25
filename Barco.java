public class Barco extends VehiculoAcuatico {
    protected int motor;

    public Barco(String matricula, String modelo, int eslora, int motor) {
        super(matricula, modelo, eslora);
       this.motor=motor;

    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehiculo acuatico.Matricula: " + matricula + " Modelo: " + modelo + " Eslora: " + eslora + "Motor: "+motor);
    }

    

   
    
    
}
