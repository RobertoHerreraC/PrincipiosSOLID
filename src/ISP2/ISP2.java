package ISP2;

import java.awt.*;

public class ISP2 {
    static void main() {
        WorkerManager wm = new WorkerManager();
        Trabajable empleado = new Employee();
        Trabajable robot = new RobotWorker();
        wm.iniciarTrabajo(empleado);
        wm.iniciarTrabajo(robot);
    }
}
