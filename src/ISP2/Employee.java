package ISP2;



public class Employee implements Trabajable, Comible, Dormible {
    @Override
    public void comer() {
        System.out.println("Empleado comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("Empleado durmiendo");
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado trabajando");
    }
}
