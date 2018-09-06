package polimorfismo;
public class Polimorfismo {
    
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Celaya", 10);
        System.out.println(edificio.getDatos());
        
        Edificio edificio_poli = new Departamernto("Celaya", 10,12,4);
        System.out.println(edificio_poli.getDatos());
 
    }
    
}
