public class VehiculoTerrestre extends Vehiculo { // subclase vehiculo
    protected int ruedas;

    public VehiculoTerrestre(String matricula, String modelo, int ruedas) {// boton derecho crear constructor
        super(matricula, modelo);
        this.ruedas = ruedas;

    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public void imprimir() {
        System.out.println("Vehiculo terrestre. Matricula: " + matricula + " Modelo: " + modelo + "Ruedas: " + ruedas);

    }

}
