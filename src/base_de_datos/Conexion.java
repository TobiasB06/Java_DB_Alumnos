package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection cnx;
    
    public Connection Conectar() {
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión (asegúrate de cambiar "usuario" y "contraseña" a los correctos)
            String url = "jdbc:mysql://localhost:3306/java_proyect";
            String usuario = "root"; // Reemplaza con tu usuario de MySQL
            String contraseña = ""; // Reemplaza con tu contraseña de MySQL
            cnx = DriverManager.getConnection(url, usuario, contraseña);
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión con la base de datos: " + e.getMessage());
        }
        return cnx;
    }
}

