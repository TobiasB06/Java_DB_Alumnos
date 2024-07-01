package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Base_de_datos {
    private static final String URL = "jdbc:mysql://localhost:3306/proyecto_colegio2"; // URL corregida
    private static final String USER = "root"; // Usuario por defecto en XAMPP
    private static final String PASSWORD = ""; // Contraseña por defecto en XAMPP

    public static void main(String[] args) {
        Connection cnx = null;
        Statement statement = null;
        ResultSet resultado = null;
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            cnx = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = cnx.createStatement();

            // Ejecutar la consulta
            resultado = statement.executeQuery("SELECT * FROM usuarios");

            // Procesar los resultados
            while (resultado.next()) {
                String usuario = resultado.getString("Usuario");
                String contraseña = resultado.getString("Contraseña");

                // Imprimir los resultados
                System.out.println("Usuario: " + usuario + " Contraseña: " + contraseña);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error al registrar el driver de MySQL.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión a la base de datos.");
            e.printStackTrace();
        } finally {
            // Cerrar los recursos
            try {
                if (resultado != null) resultado.close();
                if (statement != null) statement.close();
                if (cnx != null) cnx.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
