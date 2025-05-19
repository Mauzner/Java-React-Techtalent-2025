package UD19SWINGAWT;

import java.sql.*;
import java.util.ArrayList;

public class ConexionMySQL01 {
    private static final String URL = "jdbc:mysql://localhost:3306/calculadora_db";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Cambiar si tu MySQL tiene contraseña

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void guardarOperacion(double num1, double num2, String operador, double resultado) {
        String sql = "INSERT INTO operaciones (numero1, numero2, operador, resultado) VALUES (?, ?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, num1);
            stmt.setDouble(2, num2);
            stmt.setString(3, operador);
            stmt.setDouble(4, resultado);

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al guardar operación: " + e.getMessage());
        }
    }

    public static ArrayList<String> obtenerHistorial() {
        ArrayList<String> historial = new ArrayList<>();
        String sql = "SELECT numero1, operador, numero2, resultado, fecha FROM operaciones ORDER BY id DESC";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                double n1 = rs.getDouble("numero1");
                double n2 = rs.getDouble("numero2");
                String op = rs.getString("operador");
                double res = rs.getDouble("resultado");
                String fecha = rs.getString("fecha");

                historial.add(n1 + " " + op + " " + n2 + " = " + res + " (" + fecha + ")");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener historial: " + e.getMessage());
        }

        return historial;
    }
}
