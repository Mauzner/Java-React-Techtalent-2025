package UD19SWINGAWT;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class Calculadora extends JFrame {
    private JTextField txtNum1, txtNum2, txtResultado;
    private JButton btnSuma, btnResta, btnMultiplicacion, btnDivision, btnSalir, btnAbout, btnHistorial;
    private JLabel lblNum1, lblNum2, lblResultado, lblTitulo;

    public Calculadora() {
        setTitle("Calculadora con MySQL");
        setSize(420, 330);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblTitulo = new JLabel("Calculadora DEM");
        lblTitulo.setBounds(100, 10, 250, 20);

        lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(30, 50, 80, 20);

        lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(30, 80, 80, 20);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(30, 110, 80, 20);

        txtNum1 = new JTextField();
        txtNum1.setBounds(120, 50, 100, 20);

        txtNum2 = new JTextField();
        txtNum2.setBounds(120, 80, 100, 20);

        txtResultado = new JTextField();
        txtResultado.setBounds(120, 110, 100, 20);
        txtResultado.setEditable(false);

        btnSuma = new JButton("+");
        btnSuma.setBounds(250, 50, 50, 25);

        btnResta = new JButton("-");
        btnResta.setBounds(310, 50, 50, 25);

        btnMultiplicacion = new JButton("*");
        btnMultiplicacion.setBounds(250, 80, 50, 25);

        btnDivision = new JButton("/");
        btnDivision.setBounds(310, 80, 50, 25);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(250, 180, 110, 25);

        btnAbout = new JButton("About");
        btnAbout.setBounds(250, 215, 110, 25);

        btnHistorial = new JButton("Historial");
        btnHistorial.setBounds(250, 145, 110, 25);

        add(lblTitulo);
        add(lblNum1);
        add(lblNum2);
        add(lblResultado);
        add(txtNum1);
        add(txtNum2);
        add(txtResultado);
        add(btnSuma);
        add(btnResta);
        add(btnMultiplicacion);
        add(btnDivision);
        add(btnSalir);
        add(btnAbout);
        add(btnHistorial);

        btnSuma.addActionListener(e -> operar('+'));
        btnResta.addActionListener(e -> operar('-'));
        btnMultiplicacion.addActionListener(e -> operar('*'));
        btnDivision.addActionListener(e -> operar('/'));

        btnSalir.addActionListener(e -> System.exit(0));

        btnAbout.addActionListener(e -> 
            JOptionPane.showMessageDialog(this, "Calculadora con historial.\nDesarrollado en DEM", "Acerca de", JOptionPane.INFORMATION_MESSAGE)
        );

        btnHistorial.addActionListener(e -> mostrarHistorial());
    }

    private void operar(char operador) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = 0;

            switch (operador) {
                case '+': resultado = num1 + num2; break;
                case '-': resultado = num1 - num2; break;
                case '*': resultado = num1 * num2; break;
                case '/':
                    if (num2 == 0) throw new ArithmeticException("División por cero");
                    resultado = num1 / num2;
                    break;
            }

            txtResultado.setText(String.valueOf(resultado));

            // Guardar operación en la base de datos
            ConexionMySQL01.guardarOperacion(num1, num2, String.valueOf(operador), resultado);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarHistorial() {
        List<String> historial = ConexionMySQL01.obtenerHistorial();
        if (historial.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay historial disponible.", "Historial", JOptionPane.INFORMATION_MESSAGE);
        } else {
            StringBuilder mensaje = new StringBuilder("Historial de operaciones:\n\n");
            for (String op : historial) {
                mensaje.append(op).append("\n");
            }
            JOptionPane.showMessageDialog(this, mensaje.toString(), "Historial", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora().setVisible(true));
    }
}
