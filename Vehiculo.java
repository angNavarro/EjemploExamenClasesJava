public abstract class Vehiculo{ //clase abstracta

    //atributos 
    protected String matricula;
    protected String modelo;

    //Constructor
    public Vehiculo(String matricula, String modelo){
        this.matricula=matricula;
        this.modelo=modelo;
    }
    //sets and gets
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void imprimir();

    
    
}