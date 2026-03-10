package ISP1;

public class SuperMultifuncion implements Impresora,  Fax , Escaner{
    @Override
    public void enviarFax(String documento) {
        System.out.println("Enviando fax: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("Escaneando documento: " + documento);
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimiendo a color: " + documento);
    }
}
