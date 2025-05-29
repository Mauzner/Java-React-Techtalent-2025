package com.ejemplo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContadorBotones {
    private static int contadorBoton1 = 0;
    private static int contadorBoton2 = 0;

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Contador mejorado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 250);
        ventana.setLayout(new GridLayout(3, 2, 10, 10));
        ventana.setLocationRelativeTo(null);

        JLabel etiqueta1 = new JLabel("Botón 1 presionado: 0 veces");
        JLabel etiqueta2 = new JLabel("Botón 2 presionado: 0 veces");

        JButton boton1 = new JButton("Botón 1 (Tecla A)");
        JButton boton2 = new JButton("Botón 2 (Tecla B)");
        JButton botonReset = new JButton("Borrar todo");

        // Acción del Botón 1
        ActionListener accionBoton1 = e -> {
            try {
                contadorBoton1++;
                etiqueta1.setText("Botón 1 presionado: " + contadorBoton1 + " veces");
            } catch (NumberFormatException ex) {
                mostrarError("Error de formato numérico en Botón 1.");
            }
        };

        // Acción del Botón 2
        ActionListener accionBoton2 = e -> {
            try {
                contadorBoton2++;
                etiqueta2.setText("Botón 2 presionado: " + contadorBoton2 + " veces");
            } catch (NumberFormatException ex) {
                mostrarError("Error de formato numérico en Botón 2.");
            }
        };

        // Acción del Botón Reset
        ActionListener accionReset = e -> {
            contadorBoton1 = 0;
            contadorBoton2 = 0;
            etiqueta1.setText("Botón 1 presionado: 0 veces");
            etiqueta2.setText("Botón 2 presionado: 0 veces");
        };

        boton1.addActionListener(accionBoton1);
        boton2.addActionListener(accionBoton2);
        botonReset.addActionListener(accionReset);

        // Asociar teclas (A para Botón 1, B para Botón 2)
        InputMap map = ventana.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        ActionMap actions = ventana.getRootPane().getActionMap();

        map.put(KeyStroke.getKeyStroke('A'), "boton1");
        map.put(KeyStroke.getKeyStroke('B'), "boton2");
        actions.put("boton1", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton1.doClick();
            }
        });
        actions.put("boton2", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton2.doClick();
            }
        });

        // Añadir elementos a la ventana
        ventana.add(etiqueta1);
        ventana.add(boton1);
        ventana.add(etiqueta2);
        ventana.add(boton2);
        ventana.add(new JLabel()); // espacio vacío
        ventana.add(botonReset);

        ventana.setVisible(true);
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
