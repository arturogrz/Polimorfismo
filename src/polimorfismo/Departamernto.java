package polimorfismo;

public class Departamernto extends Edificio{
    private int numero_interior;
    private int numero_cuartos;
    
    

    public Departamernto(String direccion, int pisos, int numero_interior,int numero_cuartos) {
        super(direccion, pisos);
        this.numero_interior = numero_interior;
        this.numero_cuartos = numero_cuartos;
    }

    public int getNumero_interior() {
        return numero_interior;
    }

    public void setNumero_interior(int numero_interior) {
        this.numero_interior = numero_interior;
    }

    public int getNumero_cuartos() {
        return numero_cuartos;
    }

    public void setNumero_cuartos(int numero_cuartos) {
        this.numero_cuartos = numero_cuartos;
    }
    
    @Override
    public String getDatos(){
        return "Direccion: " + getDireccion() + " Pisos: " + getPisos() +
                "Numero interior: " + numero_interior + 
                " Numero de cuartos: " + numero_cuartos;
    }
    
    
    
}
