package LSP2;

public class Bicicleta extends  Vehiculo{
    @Override
    public void acelerar(int incremento){
        System.out.println("La bicicleta pedalea ,as rapido:");
        super.acelerar(incremento);
    }
}
