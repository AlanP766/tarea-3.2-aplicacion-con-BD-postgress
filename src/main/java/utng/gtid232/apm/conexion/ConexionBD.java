package utng.gtid232.apm.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
/**
 * Punto unico de acceso a la conexion JDBC hacia PostgreSQL.
 * Ajusta URL, USUARIO y PASSWORD a tu entorno local.
 */
public class ConexionBD {
 
    private static ConexionBD instancia;
 
    private static final String URL = "jdbc:postgresql://localhost:5432/auditoriasdb";
    private static final String USUARIO = "Admin";
    private static final String PASSWORD = "Admin";
 
    private Connection conexion;
 
    private ConexionBD() throws SQLException {
        conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
 
    public static synchronized ConexionBD getInstancia() throws SQLException {
        if (instancia == null || instancia.conexion == null || instancia.conexion.isClosed()) {
            instancia = new ConexionBD();
        }
        return instancia;
    }
 
    public Connection getConexion() {
        return conexion;
    }
 
    public static void cerrar() {
        try {
            if (instancia != null && instancia.conexion != null && !instancia.conexion.isClosed()) {
                instancia.conexion.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }
}
