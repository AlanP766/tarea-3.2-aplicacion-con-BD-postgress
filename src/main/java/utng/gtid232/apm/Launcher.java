package utng.gtid232.apm;

/**
 * Punto de entrada alterno para ejecutar la aplicacion desde el boton "Run" de VS Code
 * (o cualquier IDE) sin pasar por el plugin de Maven. Al no extender Application
 * directamente, evita la verificacion de modulo que provoca el error
 * "JavaFX runtime components are missing".
 */
public class Launcher {
    public static void main(String[] args) {
        App.main(args);
    }
}


