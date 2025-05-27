package UD18JDBC;

import java.sql.*;
import javax.swing.*;

public class Ej05Directores {
	static Connection conexion = null;
	Statement st = null;
	static final String URL = "jdbc:mysql://localhost:3306/";
	static final String USER = "root";
	static final String PASSWORD = "";

	public static void main(String[] args) {

		insertarDatos("java_directores", "directores", "DNI, NombreApellidos, Despacho",
				"'33219985', 'Almudena Zamorano Arrabia', 2566");
		insertarDatos("java_directores", "directores", "DNI, NombreApellidos, Despacho",
				"'08664328', 'Carlos Jiménez Losantos', 2443");
		insertarDatos("java_directores", "directores", "DNI, NombreApellidos, Despacho, DNIjefe",
				"'60021763', 'María Peña Carrasco', 1056, '33219985'");
		insertarDatos("java_directores", "directores", "DNI, NombreApellidos, Despacho, DNIjefe",
				"'84496577', 'Núria Almádena Curiel', 8775, '33219985'");
		insertarDatos("java_directores", "directores", "DNI, NombreApellidos, Despacho, DNIjefe",
				"'76321589', 'Óscar Lafuente Muñoz', 1555, '08664328'");

	}

	public static void crearTabla(String db, String nombre, String contenido) {
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión exitosa a la base de datos");
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "CREATE TABLE " + nombre + "" + contenido;
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Tabla creada.");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			System.out.println("Error al crear la tabla.");
		}
	}

	public static void insertarDatos(String db, String nombre_tabla, String Values, String QueryValues) {
		try {
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexión exitosa a la base de datos");
			String Querydb = "USE " + db + ";";
			Statement stdb = conexion.createStatement();
			stdb.executeUpdate(Querydb);

			String Query = "INSERT INTO " + nombre_tabla + "(" + Values + ")" + " VALUES(" + QueryValues + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(Query);
			System.out.println("Datos almacenados correctamente.");
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
			JOptionPane.showMessageDialog(null, "Error de almacenamiento.");

		}
	}
}