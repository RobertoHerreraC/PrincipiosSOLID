package LSP2;

public class Vehiculo {
    int velocidad = 0;

    void acelerar(int incremento){
        velocidad += incremento;
        System.out.println("El velocidad es: " + velocidad);
    }

    void frenar(int decremento){
        velocidad = Math.max(0, velocidad - decremento);
        System.out.println("El velocidad tras frenar es: : " + velocidad);

    }
}
