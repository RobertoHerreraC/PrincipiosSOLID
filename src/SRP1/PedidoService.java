package SRP1;

public class PedidoService {

    private PedidoValidator validator;
    private CalculadoraPedido calculadora;
    private PedidoRepository repositorio;
    private EmailService emailService;
    private LoggerService logger;

    public PedidoService(PedidoValidator validator, CalculadoraPedido calculadora,PedidoRepository repositorio, EmailService emailService, LoggerService logger) {
        this.validator = validator;
        this.calculadora = calculadora;
        this.repositorio = repositorio;
        this.emailService = emailService;
        this.logger = logger;
    }


    public void crearPedido(Pedido pedido){
        //Validacion
       validator.validar(pedido);
        double total = calculadora.calcularTotal(pedido);
        pedido.setTotal(total);
        repositorio.guardar(pedido);
        emailService.enviarConfirmacion(pedido);
        logger.log("Pedido creado correctamente");

    }
}
